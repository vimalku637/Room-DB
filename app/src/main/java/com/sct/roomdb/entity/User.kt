package com.sct.roomdb.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_table")
data class User(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,// Make sure 'id' is part of your User class
    val name: String,
    val email: String,
    val mobileNo: String
)
