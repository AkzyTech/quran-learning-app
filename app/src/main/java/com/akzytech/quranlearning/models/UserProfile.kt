package com.akzytech.quranlearning.models

import com.google.firebase.Timestamp

data class UserProfile(
    val uid: String = "",
    val fullName: String = "",
    val email: String = "",
    val role: String = "student",
    val city: String = "",
    val createdAt: Timestamp? = null
)

data class TeacherProfile(
    val uid: String = "",
    val fullName: String = "",
    val email: String = "",
    val specialization: String = "Quran Reading",
    val city: String = "",
    val hourlyRate: String = "$15/hr",
    val rating: Double = 4.9,
    val bio: String = "",
    val availability: String = "Evenings"
)

data class ChatMessage(
    val messageId: String = "",
    val senderId: String = "",
    val receiverId: String = "",
    val text: String = "",
    val createdAt: com.google.firebase.Timestamp? = null
)

data class ChatThread(
    val threadId: String = "",
    val participantA: String = "",
    val participantB: String = "",
    val lastMessage: String = "",
    val updatedAt: com.google.firebase.Timestamp? = null
)
