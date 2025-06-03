package com.sct.roomdb

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.lifecycle.ViewModelProvider
import com.sct.roomdb.entity.User
import com.sct.roomdb.view_model.UserViewModel

class MainActivity : ComponentActivity() {
    private lateinit var viewModel: UserViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this)[UserViewModel::class.java]

        viewModel.allUsers.observe(this) { users ->
            // Update UI with the List of users
            Log.d("USER_LIST_OBSERVED", "Current users: $users")
        }

//        Insert example
        val user = User(0, "Henry", "henry@example.com", "1234567890")
        viewModel.insert(user)
        Toast.makeText(this, "User Inserted Successfully", Toast.LENGTH_SHORT).show()

//        Update example by object
//        val userToUpdateObject = User(id = 3, name = "Jhon Doe", email = "jhon@example.com",  mobileNo = "1234567899")
//        viewModel.update(userToUpdateObject)
//        Toast.makeText(this, "User Updated Successfully", Toast.LENGTH_SHORT).show()

//        Delete example by object
//        val userToDeleteObject = User(id = 2, name = "Henry", email = "henry@example.com",  mobileNo = "1234567890")
//        viewModel.delete(userToDeleteObject)
//        Toast.makeText(this, "Attempted to delete user with ID 2 via object.", Toast.LENGTH_SHORT).show()
    }
}