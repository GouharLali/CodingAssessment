package com.example.codingassessment

import android.app.Application
import android.content.Context.MODE_APPEND
import android.widget.Toast
import androidx.lifecycle.AndroidViewModel
import java.io.IOException

class MainViewModel(
    application: Application
) : AndroidViewModel(application) {

    val items = mutableListOf<ListItem>()
    var text: String = ""

    private val fileName = "text_file.txt"

    fun onOkButtonClick(text: String) {
        val currentTimeMillis = System.currentTimeMillis()
        val listItem = ListItem(text, currentTimeMillis)
        items.add(listItem)

        writeTextToFile("$currentTimeMillis: $text")

    }

    fun getAdapter(): MainAdapter {
        return MainAdapter(items)
    }

    private fun writeTextToFile(text: String) {
        try {
            val fileOutputStream = getApplication<Application>().openFileOutput(fileName, MODE_APPEND)
            fileOutputStream?.write((text + "\n").toByteArray())
            fileOutputStream?.close()
        } catch (e: IOException) {
            // Handle the exception gracefully, for example, showing a toast message
            Toast.makeText(getApplication(), "Error saving data", Toast.LENGTH_SHORT).show()
            e.printStackTrace()
        }
    }

}




