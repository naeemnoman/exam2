package com.naeemnoman.serialno3.userprofileregestration_dipti_amad_l4_04_17

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.google.android.material.floatingactionbutton.FloatingActionButton

class ProfileListActivity_04_17 : AppCompatActivity() {

    private lateinit var profileViewModel: UserProfileViewModel_04_17
    private lateinit var profileAdapter: ProfileAdapter_04_17

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_list_04_17)

        profileViewModel = ViewModelProvider(this).get(UserProfileViewModel_04_17::class.java)

        val recyclerView = findViewById<RecyclerView>(R.id.profileRecyclerView)
        profileAdapter = ProfileAdapter_04_17()

        recyclerView.adapter = profileAdapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        profileViewModel.getUserProfiles().observe(this, Observer { profiles ->
            profileAdapter.submitList(profiles)
        })

        profileAdapter.setOnItemClickListener { userProfile ->
            val intent = Intent(this@ProfileListActivity_04_17, ProfileDetailActivity_04_17::class.java)
            intent.putExtra("USER_PROFILE", userProfile)
            startActivity(intent)
        }

        profileAdapter.setOnDeleteClickListener { userProfile ->
            profileViewModel.deleteUserProfile(userProfile)
        }

        profileAdapter.setOnUpdateClickListener { userProfile ->
            val intent = Intent(this@ProfileListActivity_04_17, UpdateProfileActivity_04_17::class.java)
            intent.putExtra("USER_PROFILE", userProfile)
            startActivity(intent)
        }

        findViewById<FloatingActionButton>(R.id.addProfileBtn).setOnClickListener {
            val intent = Intent(this@ProfileListActivity_04_17, AddProfileActivity_04_17::class.java)
            startActivity(intent)
        }
    }
}