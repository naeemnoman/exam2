package com.naeemnoman.serialno3.userprofileregestration_dipti_amad_l4_04_17

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "user_profile")
data class UserProfile_04_17(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String,
    val email: String,
    val dob: String,
    val district: String,
    val mobile: String
): Serializable