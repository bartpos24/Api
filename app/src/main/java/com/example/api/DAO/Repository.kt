package com.example.api.DAO

import androidx.fragment.app.Fragment
import com.example.api.Model.User

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class Repository(fragment: Fragment) {
    private val dao: Dao

    init {
        val database = FarmDatabase.getInstance(fragment.requireContext())
        dao = database.dao()
    }

    fun addUser(user: User) {
        runBlocking {
            this.launch(Dispatchers.IO) {
                dao.addUser(user)
            }
        }
    }

}