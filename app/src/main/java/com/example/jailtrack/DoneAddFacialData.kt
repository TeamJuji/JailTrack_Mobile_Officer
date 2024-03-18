package com.example.jailtrack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.jailtrack.databinding.ActivityDoneAddFacialDataBinding

class DoneAddFacialData : AppCompatActivity() {
    private lateinit var binding: ActivityDoneAddFacialDataBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityDoneAddFacialDataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.doneAddfaceData.setOnClickListener {
            startActivity(Intent(this@DoneAddFacialData, MainActivity::class.java))
        }
    }
}