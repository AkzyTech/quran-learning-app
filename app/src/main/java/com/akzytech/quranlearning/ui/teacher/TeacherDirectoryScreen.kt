package com.akzytech.quranlearning.ui.teacher

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.akzytech.quranlearning.models.TeacherProfile

@Composable
fun TeacherDirectoryCard(
    teacher: TeacherProfile,
    modifier: Modifier = Modifier
) {
    Card(modifier = modifier.fillMaxWidth()) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = teacher.fullName,
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold
            )
            Text(text = teacher.specialization, style = MaterialTheme.typography.bodyMedium)
            Text(text = teacher.city, style = MaterialTheme.typography.bodySmall)
            Text(text = teacher.bio, style = MaterialTheme.typography.bodyMedium)
            Text(text = "${teacher.hourlyRate} • ${teacher.availability}", style = MaterialTheme.typography.bodySmall)
        }
    }
}
