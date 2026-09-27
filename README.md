# Quran Learning App

A beginner-friendly Android app starter for a Quran learning platform where students can:
- browse teachers
- contact and chat with teachers
- read a complete Quran surah list
- play recitation audio
- manage a simple student profile

This project uses:
- Kotlin + Jetpack Compose
- Firebase Authentication and Firestore
- ExoPlayer for Quran audio

## Setup

1. Open the project in Android Studio.
2. Replace `app/google-services.json` with the real Firebase config from your Firebase project.
3. Sync Gradle and run the app.

## Notes

- This is a working MVP foundation.
- The Quran dataset here includes the complete surah catalog and recitation URL pattern.
- For full Quran text and a production-ready backend, connect your Firebase project and add a richer Quran dataset or Quran API integration.

## Main features included

- Home dashboard with featured teachers
- Quran reader with all 114 surah entries
- Recitation audio player using a streaming URL pattern
- Teacher-student chat UI
- Student profile summary screen

## Recommended next steps

- Add Firebase sign-in and Firestore collections for users, teachers, and chats
- Replace starter sample ayah text with full Quran API data
- Add booking and lesson scheduling flow
- Add teacher profile creation form and admin moderation
