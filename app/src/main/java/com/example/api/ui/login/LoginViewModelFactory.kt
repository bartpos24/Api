package com.example.api.ui.login

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.api.DAO.Repository

class LoginViewModelFactory(private val database: Repository) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(LoginViewModel::class.java)) {
            return LoginViewModel(database) as T
        }
        throw IllegalArgumentException("Unknown viewmodel class")
    }
}