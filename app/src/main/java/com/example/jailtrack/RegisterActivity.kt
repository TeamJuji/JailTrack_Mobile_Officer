package com.example.jailtrack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.jailtrack.data.JailOfficerData
import com.example.jailtrack.databinding.ActivityRegisterBinding
import com.example.jailtrack.validation.Validation
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding
    private lateinit var database: FirebaseDatabase;
    private lateinit var mAuth: FirebaseAuth;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        database = FirebaseDatabase.getInstance()
        mAuth = FirebaseAuth.getInstance()

        binding.registerCardView.setOnClickListener {
            if (Validation.validateField(
                    binding.fullNameEditText.text.toString(),
                    binding.emailAddressEditText.text.toString(),
                    binding.phoneNumberEditText.text.toString(),
                    binding.badgeNumberEditText.text.toString(),
                    binding.rankPositionEditText.text.toString(),
                    binding.addressEditText.text.toString(),
                    binding.jailFacilityEditText.text.toString(),
                    binding.passwordEditText.text.toString(),
                )
            ) {
                mAuth.createUserWithEmailAndPassword(
                    binding.emailAddressEditText.text.toString(),
                    binding.passwordEditText.text.toString()
                ).addOnSuccessListener {
                    database.getReference("jailOfficers").child(mAuth.currentUser?.uid.toString())
                        .setValue(
                            JailOfficerData(
                                binding.fullNameEditText.text.toString(),
                                binding.emailAddressEditText.text.toString(),
                                binding.phoneNumberEditText.text.toString(),
                                binding.badgeNumberEditText.text.toString(),
                                binding.rankPositionEditText.text.toString(),
                                binding.addressEditText.text.toString(),
                                binding.jailFacilityEditText.text.toString(),
                            )
                        ).addOnSuccessListener {
                        Toast.makeText(this@RegisterActivity, "Register Success", Toast.LENGTH_LONG)
                            .show()
                    }.addOnFailureListener {
                        Toast.makeText(
                            this@RegisterActivity,
                            "Data registry Failed",
                            Toast.LENGTH_LONG
                        ).show()
                    }
                }.addOnFailureListener {
                    Toast.makeText(this@RegisterActivity, "Register Failed", Toast.LENGTH_LONG)
                        .show()
                }
            } else {
                Toast.makeText(this@RegisterActivity, "All fields are required", Toast.LENGTH_LONG).show()
            }
        }
    }
}