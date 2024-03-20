package com.example.jailtrack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.jailtrack.databinding.ActivityFaceRecognitionAttendanceBinding

class FaceRecognitionAttendance : AppCompatActivity() {
    private lateinit var binding: ActivityFaceRecognitionAttendanceBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFaceRecognitionAttendanceBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.mainDashboardPage.setOnClickListener {
            startActivity(Intent(this@FaceRecognitionAttendance, MainDashboard::class.java))
        }
        binding.notificationPage.setOnClickListener {
            startActivity(Intent(this@FaceRecognitionAttendance, Notifications::class.java))
        }
        binding.schedulePage.setOnClickListener {
            startActivity(Intent(this@FaceRecognitionAttendance, ViewSchedule::class.java))
        }
        binding.facerecogPage.setOnClickListener {
            startActivity(Intent(this@FaceRecognitionAttendance, FaceRecognitionAttendance::class.java))
        }

        binding.attendanceHistoryPage.setOnClickListener {
            startActivity(Intent(this@FaceRecognitionAttendance, RegisterActivity::class.java))
        }
        binding.notificationRequestPage.setOnClickListener {
            startActivity(Intent(this@FaceRecognitionAttendance, RegisterActivity::class.java))
        }
    }
}