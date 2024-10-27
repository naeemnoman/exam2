package com.naeemnoman.serialno3.userprofileregestration_dipti_amad_l4_04_17

import androidx.lifecycle.LiveData

class UserProfileRepository_04_17(private val userProfileDao: UserProfileDao_04_17) {
    fun getUserProfiles(): LiveData<List<UserProfile_04_17>> {
        return userProfileDao.getAllUserProfiles()
    }

    suspend fun insert(userProfile: UserProfile_04_17) {
        userProfileDao.insert(userProfile)
    }

    suspend fun update(userProfile: UserProfile_04_17) {
        userProfileDao.update(userProfile)
    }

    suspend fun delete(userProfile: UserProfile_04_17) {
        userProfileDao.delete(userProfile)
    }
}