package com.example.jailtrack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.jailtrack.databinding.ActivityNotificationsBinding

class Notifications : AppCompatActivity() {
    private lateinit var binding: ActivityNotificationsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityNotificationsBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.mainDashboardPage.setOnClickListener {
            startActivity(Intent(this@Notifications, MainDashboard::class.java))
        }
        binding.notificationPage.setOnClickListener {
            startActivity(Intent(this@Notifications, Notifications::class.java))
        }
        binding.schedulePage.setOnClickListener {
            startActivity(Intent(this@Notifications, ViewSchedule::class.java))
        }
        binding.facerecogPage.setOnClickListener {
            startActivity(Intent(this@Notifications, FaceRecognitionAttendance::class.java))
        }

        binding.attendanceHistoryPage.setOnClickListener {
            startActivity(Intent(this@Notifications, RegisterActivity::class.java))
        }
        binding.notificationRequestPage.setOnClickListener {
            startActivity(Intent(this@Notifications, RegisterActivity::class.java))
        }
    }
}