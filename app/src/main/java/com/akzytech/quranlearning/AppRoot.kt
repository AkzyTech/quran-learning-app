# Quran Learning App

This Android app is a Firebase-ready starter for a modern Quran learning platform.

## Current features
- Home dashboard with teacher cards
- Quran surah list and recitation audio preview
- Teacher-student chat UI
- Student profile dashboard
- Login/signup screen for app flow
- Firebase-ready repository and model layer

## Architecture
- Kotlin + Jetpack Compose
- Firebase Authentication
- Firestore support ready for users, teachers, and chats
- ExoPlayer audio playback

## Setup
1. Open the project in Android Studio.
2. Add your Firebase project.
3. Download `google-services.json` from Firebase and place it in `app/`.
4. Sync Gradle and run the app.

## Recommended next steps
- Connect Firebase auth and Firestore collections
- Replace demo teacher data with real teacher profiles
- Add chat persistence using Firestore streams
- Add booking and scheduling flow
- Add real Quran text and audio dataset integration
- Add testing and CI

## Notes
This is a realistic MVP foundation rather than a final production mobile app. It is designed so you can extend it rapidly for an actual launch.
