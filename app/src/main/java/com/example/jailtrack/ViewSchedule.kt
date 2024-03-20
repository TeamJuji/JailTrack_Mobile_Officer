package com.example.jailtrack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.jailtrack.databinding.ActivityViewScheduleBinding

class ViewSchedule : AppCompatActivity() {

    private lateinit var binding: ActivityViewScheduleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewScheduleBinding.inflate(layoutInflater)
        setContentView(binding.root)




        binding.mainDashboardPage.setOnClickListener {
            startActivity(Intent(this@ViewSchedule, MainDashboard::class.java))
        }
        binding.notificationPage.setOnClickListener {
            startActivity(Intent(this@ViewSchedule, Notifications::class.java))
        }
        binding.schedulePage.setOnClickListener {
            startActivity(Intent(this@ViewSchedule, ViewSchedule::class.java))
        }
        binding.facerecogPage.setOnClickListener {
            startActivity(Intent(this@ViewSchedule, FaceRecognitionAttendance::class.java))
        }

        binding.attendanceHistoryPage.setOnClickListener {
            startActivity(Intent(this@ViewSchedule, RegisterActivity::class.java))
        }
        binding.notificationRequestPage.setOnClickListener {
            startActivity(Intent(this@ViewSchedule, RegisterActivity::class.java))
        }

    }
}