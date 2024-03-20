package com.example.jailtrack

import android.content.Intent
import android.media.FaceDetector.Face
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.jailtrack.databinding.ActivityMainBinding
import com.example.jailtrack.databinding.ActivityMainDashboardBinding

class MainDashboard : AppCompatActivity() {

    private lateinit var binding:ActivityMainDashboardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.mainDashboardPage.setOnClickListener {
            startActivity(Intent(this@MainDashboard, MainDashboard::class.java))
        }
        binding.notificationPage.setOnClickListener {
            startActivity(Intent(this@MainDashboard, Notifications::class.java))
        }
        binding.schedulePage.setOnClickListener {
            startActivity(Intent(this@MainDashboard, ViewSchedule::class.java))
        }
        binding.facerecogPage.setOnClickListener {
            startActivity(Intent(this@MainDashboard, FaceRecognitionAttendance::class.java))
        }

        binding.attendanceHistoryPage.setOnClickListener {
            startActivity(Intent(this@MainDashboard, RegisterActivity::class.java))
        }
        binding.notificationRequestPage.setOnClickListener {
            startActivity(Intent(this@MainDashboard, RegisterActivity::class.java))
        }
    }
}