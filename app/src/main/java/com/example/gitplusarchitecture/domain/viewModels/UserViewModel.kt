package com.example.gitplusarchitecture.domain.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.gitplusarchitecture.data.models.User

class UserViewModel : ViewModel() {

    private var _user: MutableLiveData<User> = MutableLiveData()
    val user:LiveData<User> = _user;

    fun authorization() {
        TODO("Not yet implemented")
    }

    fun logOut() {
        TODO("Not yet implemented")
    }
}