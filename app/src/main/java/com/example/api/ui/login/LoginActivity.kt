package com.example.api.ui.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.api.DAO.Repository
import com.example.api.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    private lateinit var loginViewModel: LoginViewModel
    private lateinit var database: Repository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

//        loginViewModel = ViewModelProviders.of(this, LoginViewModelFactory(database)).get(LoginViewModel::class.java)
//
//        loginViewModel.text.observe(this, Observer {
//            textView.text = it
//        })


    }
}
