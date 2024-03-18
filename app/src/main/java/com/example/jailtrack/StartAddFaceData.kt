package com.example.jailtrack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.jailtrack.databinding.ActivityStartAddFaceDataBinding

class StartAddFaceData : AppCompatActivity() {
    private lateinit var binding: ActivityStartAddFaceDataBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityStartAddFaceDataBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.continueAddFaceData.setOnClickListener {
            startActivity(Intent(this@StartAddFaceData, AddFaceData::class.java))
        }

        binding.loginTextView.setOnClickListener {
            startActivity(Intent(this@StartAddFaceData, MainActivity::class.java))
        }


    }
}