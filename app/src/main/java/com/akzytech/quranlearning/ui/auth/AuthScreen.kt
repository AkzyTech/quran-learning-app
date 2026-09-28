package com.akzytech.quranlearning.repository

import com.akzytech.quranlearning.models.ChatMessage
import com.akzytech.quranlearning.models.ChatThread
import com.akzytech.quranlearning.models.TeacherProfile
import com.akzytech.quranlearning.models.UserProfile
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.QuerySnapshot
import com.google.firebase.firestore.SetOptions

class AppRepository {
    private val auth: FirebaseAuth = FirebaseAuth.getInstance()
    private val firestore: FirebaseFirestore = FirebaseFirestore.getInstance()

    fun getCurrentUserId(): String? = auth.currentUser?.uid

    fun signIn(email: String, password: String): Task<com.google.firebase.auth.AuthResult> =
        auth.signInWithEmailAndPassword(email, password)

    fun createAccount(email: String, password: String): Task<com.google.firebase.auth.AuthResult> =
        auth.createUserWithEmailAndPassword(email, password)

    fun saveUserProfile(userProfile: UserProfile): Task<Void> {
        val uid = userProfile.uid.ifBlank { auth.currentUser?.uid ?: "" }
        return firestore.collection("users").document(uid).set(userProfile, SetOptions.merge())
    }

    fun saveTeacherProfile(teacherProfile: TeacherProfile): Task<Void> {
        val uid = teacherProfile.uid.ifBlank { auth.currentUser?.uid ?: "" }
        return firestore.collection("teachers").document(uid).set(teacherProfile, SetOptions.merge())
    }

    fun getTeachers(): Task<QuerySnapshot> =
        firestore.collection("teachers").limit(20).get()

    fun sendMessage(message: ChatMessage): Task<Void> {
        val documentRef = firestore.collection("chats").document()
        val finalMessage = message.copy(messageId = documentRef.id)
        return documentRef.set(finalMessage)
    }

    fun getChatThreadsForUser(userId: String): Task<QuerySnapshot> =
        firestore.collection("chat_threads")
            .whereArrayContains("participants", userId)
            .get()

    fun createChatThread(thread: ChatThread): Task<Void> =
        firestore.collection("chat_threads").document(thread.threadId).set(thread)
}
