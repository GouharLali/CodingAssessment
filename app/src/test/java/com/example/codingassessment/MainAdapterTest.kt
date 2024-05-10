package com.example.codingassessment

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class MainAdapterTest {

    private val testItems = listOf(
        ListItem("Item 1", System.currentTimeMillis()),
        ListItem("Item 2", System.currentTimeMillis())
    )

    private lateinit var adapter: MainAdapter

    @Before
    fun setUp() {
        adapter = MainAdapter(testItems)
    }

    @Test
    fun testGetItemCount() {
        assertEquals(testItems.size, adapter.itemCount)
    }
}
