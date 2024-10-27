package com.naeemnoman.serialno3.userprofileregestration_dipti_amad_l4_04_17

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [UserProfile_04_17::class], version = 1)
abstract class UserDatabase_04_17 : RoomDatabase() {
    abstract fun userProfileDao(): UserProfileDao_04_17

    companion object {
        @Volatile
        private var INSTANCE: UserDatabase_04_17? = null

        fun getDatabase(context: Context): UserDatabase_04_17 {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    UserDatabase_04_17::class.java,
                    "user_profile_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}