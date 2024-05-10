package com.example.codingassessment

import android.app.Application
import androidx.lifecycle.AndroidViewModel

class MainViewModel(
    application: Application
) : AndroidViewModel(application) {

    val items = mutableListOf<ListItem>()
    var text: String = ""

    fun onOkButtonClick() {
        val currentTimeMillis = System.currentTimeMillis()
        val listItem = ListItem(text, currentTimeMillis)
        items.add(listItem)

        text = ""
    }

    fun getAdapter(): MainAdapter {
        return MainAdapter(items)
    }


}
