package com.sct.roomdb.room_db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.sct.roomdb.dao.UserDao
import com.sct.roomdb.entity.User

@Database(entities = [User::class], version = 1)
abstract class UserDatabase: RoomDatabase() {

    abstract fun userDao() : UserDao

    companion object {
        @Volatile private var INSTANCE: UserDatabase?=null

        fun getDatabase(context: Context) : UserDatabase {
            return INSTANCE ?: synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    UserDatabase::class.java,
                    "user_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}