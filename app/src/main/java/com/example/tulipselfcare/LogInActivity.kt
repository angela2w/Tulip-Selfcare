package com.example.tulipselfcare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class LogInActivity : AppCompatActivity() {
    lateinit var et_username : EditText
    private lateinit var et_password : EditText
    private lateinit var bt_login : Button
    private lateinit var tvsignIn : TextView
    private lateinit var auth : FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in2)

        supportActionBar?.hide()

        et_username=findViewById(R.id.EtUsername)
        et_password=findViewById(R.id.EtPassword)
        bt_login=findViewById(R.id.BtSignIN)
        tvsignIn=findViewById(R.id.tvRedirectLogIn_User)
        auth= FirebaseAuth.getInstance()

        bt_login.setOnClickListener {
            val email = et_username.text.toString()
            val password = et_password.text.toString()

            login(email,password)

        }

        tvsignIn.setOnClickListener {
            val intent= Intent(this,SignInActivity::class.java)
            startActivity(intent)

        }

    }
    private fun login(email:String,password:String){
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    val intent=Intent(this@LogInActivity,MainActivity::class.java)
                    startActivity(intent)

                } else {
                    Toast.makeText(this@LogInActivity,"User does not exist",Toast.LENGTH_SHORT).show()
                }
            }
    }

}

