package com.example.api.ui.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.api.DAO.Repository

class LoginViewModel(val database: Repository): ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This is login user Activity"
    }

    val text: LiveData<String> = _text
}