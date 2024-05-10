package com.example.codingassessment

import java.text.SimpleDateFormat
import java.util.*

data class ListItem(
    val text: String,
    val timestamp: Long
) {
    val timestampFormatted: String
        get() = SimpleDateFormat("[ HH:mm ]", Locale.getDefault()).format(Date(timestamp))
}
