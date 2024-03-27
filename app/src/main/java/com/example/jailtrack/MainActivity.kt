package com.example.jailtrack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.os.Bundle
import com.example.jailtrack.databinding.ActivityMainBinding
import com.example.jailtrack.validation.Validation
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var mAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        mAuth = FirebaseAuth.getInstance()


        binding.loginCardView.setOnClickListener {
            if (Validation.validateField(
                    binding.emailEditText.text.toString(),
                    binding.passwordEditText.text.toString(),
                )) {
                mAuth.signInWithEmailAndPassword(
                    binding.emailEditText.text.toString(),
                    binding.passwordEditText.text.toString(),
                ).addOnSuccessListener {
                    Toast.makeText(this, "Login Success", Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this@MainActivity, MainDashboard::class.java))
                }.addOnFailureListener {
                    Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "All Field are required", Toast.LENGTH_SHORT).show()
            }

        }

        binding.signUpTextView.setOnClickListener {
            startActivity(Intent(this@MainActivity, RegisterActivity::class.java))
        }

        binding.forgetPasswordTextView.setOnClickListener {
            startActivity(Intent(this@MainActivity, ForgotPasswordActivity::class.java))
        }

    }
}