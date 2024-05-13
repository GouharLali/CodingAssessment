# Coding Assessment App

The Coding Assessment App is an Android application developed to demonstrate basic Android development concepts such as ViewModel, RecyclerView, data binding, and unit testing.

## Features

- Allows users to enter text and save it along with a timestamp.
- Displays the entered text along with its timestamp in a RecyclerView.
- Supports special characters input.
- Unit tests for ViewModel and RecyclerView Adapter.

## Getting Started

To get started with this project, follow these steps:

1. Clone this repository.
2. Open the project in Android Studio.
3. Build and run the project on an Android device or emulator.

## Screenshots

<img src="https://github.com/GouharLali/CodingAssessment/assets/94018886/9b2dc0f4-ad0c-4919-be14-462d8e342725" alt="One" width="20%" height="auto"/>
<img src="https://github.com/GouharLali/CodingAssessment/assets/94018886/d3310db8-df76-4060-a6c7-22fd4348bbeb" alt="Two" width="20%" height="auto"/>
<img src="https://github.com/GouharLali/CodingAssessment/assets/94018886/ce9c1ad4-80f1-492a-aab1-c04bef9c9167" alt="Three" width="20%" height="auto"/>
<img src="https://github.com/GouharLali/CodingAssessment/assets/94018886/ffe155a2-4942-47a9-9678-fd0a6b6d9b82" alt="Four" width="20%" height="auto"/>


## Technologies Used

- Android Studio: Integrated development environment (IDE) for Android app development
- Kotlin: Programming language used for Android app development
- ViewModel: Part of Android Architecture Components for managing UI-related data
- RecyclerView: Android UI component for displaying large sets of data
- Data Binding: Android library for binding UI components in layouts to data sources in the app
- Espresso: Android testing framework for UI testing
- JUnit: Unit testing framework for Java and Kotlin

## Components

### MainViewModel

Manages the UI-related data and interactions for the main screen of the app.

### MainActivity

Entry point of the app, sets up the UI and binds ViewModel.

### MainAdapter

RecyclerView adapter for displaying list items.

### MainViewModelTest

Unit tests for MainViewModel.

### MainActivityTest

UI tests using Espresso for MainActivity.

## Implementation Decisions

### Architecture

The application follows the MVVM (Model-View-ViewModel) architecture pattern, separating concerns between UI, data, and business logic.

### UI Components

- TextInputLayout: Material Design component for text input with support for labels and error messages.
- RecyclerView: Utilized for efficiently displaying list items.
- Button: Standard Android UI component for user interaction.

### File I/O

- File I/O operations for saving text to a local text file.

## Areas for Improvement

While the Coding Assessment App is functional and demonstrates core Android development concepts, there are areas where it could be improved:

1. **Error Handling**: Implement more robust error handling mechanisms to gracefully handle unexpected situations and provide informative error messages to users.

2. **UI/UX Design**: I would have improved the layout to ensure text is visible straight away in recycleView.

3. **Code Refactoring**: Refactor the codebase to improve readability, maintainability, and scalability. Break down complex components into smaller, more manageable pieces and remove duplicate or redundant code.

4. **Unit Testing**: Increase test coverage by writing additional unit tests to cover edge cases and corner scenarios.

5. **Documentation**: Enhance code documentation by adding inline comments and documenting. 

6. **Security**: Ensure that the app follows best practices for security, such as securely storing sensitive data and protecting against common security threats.


