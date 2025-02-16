package com.naeemnoman.serialno3.userprofileregestration_dipti_amad_l4_04_17

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ProfileDetailActivity_04_17 : AppCompatActivity() {
    private lateinit var userProfile: UserProfile_04_17

    private lateinit var nameTextView: TextView
    private lateinit var emailTextView: TextView
    private lateinit var dobTextView: TextView
    private lateinit var districtTextView: TextView
    private lateinit var mobileTextView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_detail_04_17)
        userProfile = intent.getSerializableExtra("USER_PROFILE") as UserProfile_04_17

        nameTextView = findViewById(R.id.nameTextView)
        emailTextView = findViewById(R.id.emailTextView)
        dobTextView = findViewById(R.id.dobTextView)
        districtTextView = findViewById(R.id.districtTextView)
        mobileTextView = findViewById(R.id.mobileTextView)

        populateFields()
    }

    private fun populateFields() {
        nameTextView.text = userProfile.name
        emailTextView.text = userProfile.email
        dobTextView.text = userProfile.dob
        districtTextView.text = userProfile.district
        mobileTextView.text = userProfile.mobile
    }
}