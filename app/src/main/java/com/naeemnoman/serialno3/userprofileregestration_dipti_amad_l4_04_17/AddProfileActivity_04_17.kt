package com.naeemnoman.serialno3.userprofileregestration_dipti_amad_l4_04_17

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.lifecycle.ViewModelProvider

class AddProfileActivity_04_17 : AppCompatActivity() {
    private lateinit var profileViewModel: UserProfileViewModel_04_17
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_profile_04_17)

        profileViewModel = ViewModelProvider(this).get(UserProfileViewModel_04_17::class.java)

        val nameEditText = findViewById<EditText>(R.id.profileNameEt)
        val emailEditText = findViewById<EditText>(R.id.profileEmailEt)
        val dobEditText = findViewById<EditText>(R.id.profileDOBEt)
        val districtEditText = findViewById<EditText>(R.id.profileDistrictEt)
        val mobileEditText = findViewById<EditText>(R.id.profilemobileEt)

        findViewById<Button>(R.id.addBtn).setOnClickListener {
            val name = nameEditText.text.toString()
            val email = emailEditText.text.toString()
            val dob = dobEditText.text.toString()
            val district = districtEditText.text.toString()
            val mobile = mobileEditText.text.toString()

            val userProfile = UserProfile_04_17(name = name, email = email, dob = dob, district = district, mobile = mobile)
            profileViewModel.insertUserProfile(userProfile)

            finish()
        }
    }
}