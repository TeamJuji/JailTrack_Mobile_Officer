package com.example.jailtrack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.jailtrack.databinding.ActivityAddFaceDataBinding

class AddFaceData : AppCompatActivity() {

    private lateinit var binding: ActivityAddFaceDataBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityAddFaceDataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginTextView.setOnClickListener {
            startActivity(Intent(this@AddFaceData, MainActivity::class.java))
        }
    }
}