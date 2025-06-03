# Room-DB
Room DB basic example for beginners where you can perform operation like INSERT, UPDATE &amp; DELETE data form table.

📱 Room Database Example (Insert, Update, Delete)
This is a basic Android example using Room Database for beginners. The app demonstrates how to:

✅ Insert data into a Room table

🔄 Update existing data

❌ Delete data from the database

📋 View all records in a simple UI

🏗️ Tech Stack
Kotlin

Room Persistence Library

Android Architecture Components (ViewModel, LiveData)

MVVM Pattern

📂 Features
Simple User table with fields: id, name, email and mobile no

Add a new user to the database

Update an existing user's details

Delete a user

Display all users in a RecyclerView with LiveData updates

🚀 How to Run
Clone this repository

Open in Android Studio

Build and Run on an emulator or real device

📁 Folder Structure
- entity/
  - User.kt
- dao/
  - UserDao.kt
- room_db/
  - UserDatabase.kt
- repository/
  - UserRepository.kt
- view_model/
  - UserViewModel.kt
- ui/
  - MainActivity.kt
  - UserAdapter.kt
 
📌 Room Annotations Used
@Entity – Defines the table

@Dao – Data Access Object for queries

@Insert, @Update, @Delete – Perform respective DB operations

@Query – For custom queries like fetching all users

📚 Good For
Android beginners learning local storage with Room

Learning MVVM architecture

Understanding LiveData & ViewModel integration

