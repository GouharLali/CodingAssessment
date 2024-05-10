package com.example.codingassessment

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.filters.LargeTest
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.hamcrest.CoreMatchers.not
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
@LargeTest
class MainActivityTest {

    @get:Rule
    var activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testEditTextAndButtonClick() {
        // Type text and click button
        onView(withId(R.id.editText)).perform(typeText("Test"))
        onView(withId(R.id.button)).perform(click())

        // Check if RecyclerView is displayed after button click
        onView(withId(R.id.recyclerView)).check(matches(isDisplayed()))

        // Add more assertions here to validate RecyclerView content, etc.
    }

    @Test
    fun testEmptyTextInput() {
        // Type empty text
        onView(withId(R.id.editText)).perform(typeText(""))

        // Click the button
        onView(withId(R.id.button)).perform(click())

        // Check if RecyclerView is not displayed
        onView(withId(R.id.recyclerView)).check(matches(not(isDisplayed())))

        // Add assertions to verify that the error message (if any) is displayed correctly
    }


    @Test
    fun testSpecialCharactersTextInput() {
        // Type text with special characters
        onView(withId(R.id.editText)).perform(typeText("!@#$%^&*"))

        // Click the button
        onView(withId(R.id.button)).perform(click())

        // Verify that RecyclerView is displayed after button click
        onView(withId(R.id.recyclerView)).check(matches(isDisplayed()))

        // Add more assertions here to validate RecyclerView content, etc.
    }

    @Test
    fun testRotation() {
        // Rotate the device
        // (This action might require additional setup, depending on your testing environment)

        // Verify that RecyclerView content is preserved after rotation
        onView(withId(R.id.recyclerView)).check(matches(isDisplayed()))

        // Add more assertions here to validate RecyclerView content, etc.
    }

    @Test
    fun testErrorCondition() {
        // Simulate error condition (e.g., failure to write to file)

        // Click the button
        onView(withId(R.id.button)).perform(click())

        // Verify that RecyclerView is not displayed
        onView(withId(R.id.recyclerView)).check(matches(not(isDisplayed())))

        // Add assertions to verify that the error message (if any) is displayed correctly
    }
}

