package com.example.tulipselfcare

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth

class SignInActivity : AppCompatActivity() {
    private lateinit var edtEmail: EditText
    private lateinit var etPass: EditText
    private lateinit var btSignin: Button
    private lateinit var tvRedirectLogin: TextView
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        edtEmail = findViewById(R.id.EtEmail)
        etPass = findViewById(R.id.EtPassword)
        btSignin = findViewById(R.id.BtSignIN)
        tvRedirectLogin = findViewById(R.id.tvRedirectLogIn_User)

        auth = FirebaseAuth.getInstance()

        btSignin.setOnClickListener {
            val email=edtEmail.text.toString()
            val pass=etPass.text.toString()

            signUpUser(email,pass)
        }


        tvRedirectLogin.setOnClickListener {
            val intent = Intent(this, LogInActivity::class.java)
            startActivity(intent)
        }
    }
    private fun signUpUser(email:String,pass:String){
        auth.createUserWithEmailAndPassword(email, pass)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    Toast.makeText(this,"Welcome to Tulip Selfcare",Toast.LENGTH_LONG).show()
                   val intent=Intent(this,FindDoctorActivity::class.java)
                    startActivity(intent)
                } else {
                    Toast.makeText(this,"Some error occurred",Toast.LENGTH_SHORT).show()

                }
            }
    }




}
