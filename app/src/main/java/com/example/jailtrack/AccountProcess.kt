package com.example.jailtrack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.jailtrack.databinding.ActivityAccountProcessBinding

class AccountProcess : AppCompatActivity() {

    private lateinit var binding: ActivityAccountProcessBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityAccountProcessBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.continueCreateAccount.setOnClickListener {
            startActivity(Intent(this@AccountProcess, StartAddFaceData::class.java))
        }

        binding.loginTextView.setOnClickListener {
            startActivity(Intent(this@AccountProcess, MainActivity::class.java))
        }
    }
}