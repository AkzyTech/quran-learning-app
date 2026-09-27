package com.akzytech.quranlearning.data

data class Teacher(
    val id: String,
    val name: String,
    val specialization: String,
    val city: String,
    val hourlyRate: String,
    val rating: Float,
    val bio: String
)

data class Surah(
    val number: Int,
    val name: String,
    val englishName: String,
    val revelationType: String,
    val audioUrl: String
)

data class QuranAyah(
    val surahNumber: Int,
    val ayahNumber: Int,
    val arabicText: String,
    val translation: String
)

object QuranRepository {
    fun getTeachers(): List<Teacher> = listOf(
        Teacher(
            id = "1",
            name = "Ustadh Hamza Ali",
            specialization = "Tajweed & Hifz",
            city = "Dubai",
            hourlyRate = "$15/hr",
            rating = 4.9f,
            bio = "Helps students improve pronunciation, memorization, and confidence in daily recitation."
        ),
        Teacher(
            id = "2",
            name = "Ustadha Maryam Noor",
            specialization = "Quran Reading",
            city = "Karachi",
            hourlyRate = "$12/hr",
            rating = 4.8f,
            bio = "A patient teacher with a focus on beginners and children starting their Quran journey."
        ),
        Teacher(
            id = "3",
            name = "Ustadh Bilal Khan",
            specialization = "Memorization & Revision",
            city = "Lahore",
            hourlyRate = "$18/hr",
            rating = 5.0f,
            bio = "Creates structured revision plans for students preparing for memorization goals and assessments."
        )
    )

    fun getSurahs(): List<Surah> = listOf(
        Surah(1, "Al-Fatihah", "The Opening", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/001.mp3"),
        Surah(2, "Al-Baqarah", "The Cow", "Medinan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/002.mp3"),
        Surah(3, "Ali 'Imran", "Family of Imran", "Medinan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/003.mp3"),
        Surah(4, "An-Nisa", "The Women", "Medinan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/004.mp3"),
        Surah(5, "Al-Ma'idah", "The Table Spread", "Medinan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/005.mp3"),
        Surah(6, "Al-An'am", "The Cattle", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/006.mp3"),
        Surah(7, "Al-A'raf", "The Heights", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/007.mp3"),
        Surah(8, "Al-Anfal", "The Spoils of War", "Medinan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/008.mp3"),
        Surah(9, "At-Tawbah", "The Repentance", "Medinan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/009.mp3"),
        Surah(10, "Yunus", "Jonah", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/010.mp3"),
        Surah(11, "Hud", "Hud", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/011.mp3"),
        Surah(12, "Yusuf", "Joseph", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/012.mp3"),
        Surah(13, "Ar-Ra'd", "The Thunder", "Medinan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/013.mp3"),
        Surah(14, "Ibrahim", "Abraham", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/014.mp3"),
        Surah(15, "Al-Hijr", "The Rocky Tract", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/015.mp3"),
        Surah(16, "An-Nahl", "The Bee", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/016.mp3"),
        Surah(17, "Al-Isra", "The Night Journey", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/017.mp3"),
        Surah(18, "Al-Kahf", "The Cave", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/018.mp3"),
        Surah(19, "Maryam", "Mary", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/019.mp3"),
        Surah(20, "Ta-Ha", "Ta-Ha", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/020.mp3"),
        Surah(21, "Al-Anbiya", "The Prophets", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/021.mp3"),
        Surah(22, "Al-Hajj", "The Pilgrimage", "Medinan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/022.mp3"),
        Surah(23, "Al-Mu'minun", "The Believers", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/023.mp3"),
        Surah(24, "An-Nur", "The Light", "Medinan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/024.mp3"),
        Surah(25, "Al-Furqan", "The Criterion", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/025.mp3"),
        Surah(26, "Ash-Shu'ara", "The Poets", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/026.mp3"),
        Surah(27, "An-Naml", "The Ant", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/027.mp3"),
        Surah(28, "Al-Qasas", "The Stories", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/028.mp3"),
        Surah(29, "Al-'Ankabut", "The Spider", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/029.mp3"),
        Surah(30, "Ar-Rum", "The Romans", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/030.mp3"),
        Surah(31, "Luqman", "Luqman", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/031.mp3"),
        Surah(32, "As-Sajdah", "The Prostration", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/032.mp3"),
        Surah(33, "Al-Ahzab", "The Combined Forces", "Medinan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/033.mp3"),
        Surah(34, "Saba", "Sheba", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/034.mp3"),
        Surah(35, "Fatir", "Originator", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/035.mp3"),
        Surah(36, "Ya-Sin", "Ya-Sin", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/036.mp3"),
        Surah(37, "As-Saffat", "Those who stand firm", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/037.mp3"),
        Surah(38, "Sad", "The Letter Sad", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/038.mp3"),
        Surah(39, "Az-Zumar", "The Troops", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/039.mp3"),
        Surah(40, "Ghafir", "The Forgiver", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/040.mp3"),
        Surah(41, "Fussilat", "Explained in Detail", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/041.mp3"),
        Surah(42, "Ash-Shura", "The Consultation", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/042.mp3"),
        Surah(43, "Az-Zukhruf", "The Gold Adornments", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/043.mp3"),
        Surah(44, "Ad-Dukhan", "The Smoke", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/044.mp3"),
        Surah(45, "Al-Jathiyah", "The Crouching", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/045.mp3"),
        Surah(46, "Al-Ahqaf", "The Wind-Curved Sandhills", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/046.mp3"),
        Surah(47, "Muhammad", "Muhammad", "Medinan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/047.mp3"),
        Surah(48, "Al-Fath", "The Victory", "Medinan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/048.mp3"),
        Surah(49, "Al-Hujurat", "The Rooms", "Medinan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/049.mp3"),
        Surah(50, "Qaf", "Qaf", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/050.mp3"),
        Surah(51, "Adh-Dhariyat", "The Winnowing Winds", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/051.mp3"),
        Surah(52, "At-Tur", "The Mount", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/052.mp3"),
        Surah(53, "An-Najm", "The Star", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/053.mp3"),
        Surah(54, "Al-Qamar", "The Moon", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/054.mp3"),
        Surah(55, "Ar-Rahman", "The Beneficent", "Medinan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/055.mp3"),
        Surah(56, "Al-Waqi'ah", "The Inevitable", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/056.mp3"),
        Surah(57, "Al-Hadid", "The Iron", "Medinan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/057.mp3"),
        Surah(58, "Al-Mujadilah", "The Pleading Woman", "Medinan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/058.mp3"),
        Surah(59, "Al-Hashr", "The Exile", "Medinan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/059.mp3"),
        Surah(60, "Al-Mumtahanah", "She that is to be examined", "Medinan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/060.mp3"),
        Surah(61, "As-Saff", "The Ranks", "Medinan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/061.mp3"),
        Surah(62, "Al-Jumu'ah", "The Congregation", "Medinan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/062.mp3"),
        Surah(63, "Al-Munafiqun", "The Hypocrites", "Medinan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/063.mp3"),
        Surah(64, "At-Taghabun", "The Mutual Disillusion", "Medinan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/064.mp3"),
        Surah(65, "At-Talaq", "The Divorce", "Medinan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/065.mp3"),
        Surah(66, "At-Tahrim", "The Prohibition", "Medinan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/066.mp3"),
        Surah(67, "Al-Mulk", "The Sovereignty", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/067.mp3"),
        Surah(68, "Al-Qalam", "The Pen", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/068.mp3"),
        Surah(69, "Al-Haqqah", "The Reality", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/069.mp3"),
        Surah(70, "Al-Ma'arij", "The Ascending Stairways", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/070.mp3"),
        Surah(71, "Nuh", "Noah", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/071.mp3"),
        Surah(72, "Al-Jinn", "The Jinn", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/072.mp3"),
        Surah(73, "Al-Muzzammil", "The Enshrouded One", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/073.mp3"),
        Surah(74, "Al-Muddaththir", "The Cloaked One", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/074.mp3"),
        Surah(75, "Al-Qiyamah", "The Resurrection", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/075.mp3"),
        Surah(76, "Al-Insan", "The Human", "Medinan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/076.mp3"),
        Surah(77, "Al-Mursalat", "The Emissaries", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/077.mp3"),
        Surah(78, "An-Naba", "The Tidings", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/078.mp3"),
        Surah(79, "An-Nazi'at", "Those who drag forth", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/079.mp3"),
        Surah(80, "Abasa", "He Frowned", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/080.mp3"),
        Surah(81, "At-Takwir", "The Overthrowing", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/081.mp3"),
        Surah(82, "Al-Infitar", "The Cleaving", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/082.mp3"),
        Surah(83, "Al-Mutaffifin", "The Defrauding", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/083.mp3"),
        Surah(84, "Al-Inshiqaq", "The Splitting Open", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/084.mp3"),
        Surah(85, "Al-Buruj", "The Mansions of the Stars", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/085.mp3"),
        Surah(86, "At-Tariq", "The Morning Star", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/086.mp3"),
        Surah(87, "Al-A'la", "The Most High", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/087.mp3"),
        Surah(88, "Al-Ghashiyah", "The Overwhelming", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/088.mp3"),
        Surah(89, "Al-Fajr", "The Dawn", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/089.mp3"),
        Surah(90, "Al-Balad", "The City", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/090.mp3"),
        Surah(91, "Ash-Shams", "The Sun", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/091.mp3"),
        Surah(92, "Al-Lail", "The Night", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/092.mp3"),
        Surah(93, "Ad-Duhaa", "The Morning Brightness", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/093.mp3"),
        Surah(94, "Ash-Sharh", "The Relief", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/094.mp3"),
        Surah(95, "At-Tin", "The Fig", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/095.mp3"),
        Surah(96, "Al-'Alaq", "The Clot", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/096.mp3"),
        Surah(97, "Al-Qadr", "The Power", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/097.mp3"),
        Surah(98, "Al-Bayyinah", "The Clear Proof", "Medinan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/098.mp3"),
        Surah(99, "Az-Zalzalah", "The Earthquake", "Medinan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/099.mp3"),
        Surah(100, "Al-'Adiyat", "The Courser", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/100.mp3"),
        Surah(101, "Al-Qari'ah", "The Calamity", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/101.mp3"),
        Surah(102, "At-Takathur", "The Rivalry in world increase", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/102.mp3"),
        Surah(103, "Al-'Asr", "The Declining Day", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/103.mp3"),
        Surah(104, "Al-Humazah", "The Traducer", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/104.mp3"),
        Surah(105, "Al-Fil", "The Elephant", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/105.mp3"),
        Surah(106, "Quraysh", "Quraysh", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/106.mp3"),
        Surah(107, "Al-Ma'un", "The Small kindnesses", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/107.mp3"),
        Surah(108, "Al-Kawthar", "The Abundance", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/108.mp3"),
        Surah(109, "Al-Kafirun", "The Disbelievers", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/109.mp3"),
        Surah(110, "An-Nasr", "The Divine Support", "Medinan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/110.mp3"),
        Surah(111, "Al-Masad", "The Palm Fiber", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/111.mp3"),
        Surah(112, "Al-Ikhlas", "The Sincerity", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/112.mp3"),
        Surah(113, "Al-Falaq", "The Daybreak", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/113.mp3"),
        Surah(114, "An-Nas", "Mankind", "Meccan", "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasi/114.mp3")
    )

    fun getAyahsForSurah(surahNumber: Int): List<QuranAyah> {
        val surah = getSurahs().firstOrNull { it.number == surahNumber } ?: return emptyList()
        return (1..5).map { ayahNumber ->
            QuranAyah(
                surahNumber = surahNumber,
                ayahNumber = ayahNumber,
                arabicText = "آية ${ayahNumber}",
                translation = "This is a starter translation sample for ${surah.name}. Add your full Quran API or local dataset to enrich the app."
            )
        }
    }
}
