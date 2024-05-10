package com.example.codingassessment

import android.app.Application
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.MockitoAnnotations

class MainViewModelTest {

    @Mock
    lateinit var application: Application

    lateinit var viewModel: MainViewModel

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        viewModel = MainViewModel(application)
    }

    @Test
    fun testOnOkButtonClick() {
        // Test initial state
        assertEquals(0, viewModel.items.size)

        // Simulate button click
        viewModel.onOkButtonClick("Test")

        // Verify item added
        assertEquals(1, viewModel.items.size)
    }
}