package com.naeemnoman.serialno3.userprofileregestration_dipti_amad_l4_04_17

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface UserProfileDao_04_17 {
    @Insert
    suspend fun insert(userProfile: UserProfile_04_17)

    @Update
    suspend fun update(userProfile: UserProfile_04_17)

    @Delete
    suspend fun delete(userProfile: UserProfile_04_17)

    @Query("SELECT * FROM user_profile")
    fun getAllUserProfiles(): LiveData<List<UserProfile_04_17>>
}