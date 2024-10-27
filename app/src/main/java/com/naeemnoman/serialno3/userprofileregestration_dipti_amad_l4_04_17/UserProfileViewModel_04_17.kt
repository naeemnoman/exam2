package com.naeemnoman.serialno3.userprofileregestration_dipti_amad_l4_04_17

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class UserProfileViewModel_04_17(application: Application) : AndroidViewModel(application) {
    private val repository: UserProfileRepository_04_17

    init {
        val userProfileDao = UserDatabase_04_17.getDatabase(application).userProfileDao()
        repository = UserProfileRepository_04_17(userProfileDao)
    }

    fun getUserProfiles(): LiveData<List<UserProfile_04_17>> {
        return repository.getUserProfiles()
    }

    fun insertUserProfile(userProfile: UserProfile_04_17) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.insert(userProfile)
        }
    }

    fun updateUserProfile(userProfile: UserProfile_04_17) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.update(userProfile)
        }
    }

    fun deleteUserProfile(userProfile: UserProfile_04_17) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.delete(userProfile)
        }
    }
}