package com.example.login

import android.content.Intent
import androidx.activity.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextUsername = findViewById<EditText>(R.id.editTextUsername)
        val editTextPassword = findViewById<EditText>(R.id.editTextPassword)
        val buttonLogin = findViewById<Button>(R.id.buttonLogin)

        buttonLogin.setOnClickListener {
            val username = editTextUsername.text.toString()
            val password = editTextPassword.text.toString()

            // TODO: Implement your authentication logic here.
            // For simplicity, let's check if the username and password are not empty.
            if (username.isNotEmpty() && password.isNotEmpty()) {
                // Authentication successful
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                // Authentication failed
                Toast.makeText(this, "Invalid credentials", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
}