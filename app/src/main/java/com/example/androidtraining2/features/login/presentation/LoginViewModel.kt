package com.example.androidtraining2.features.login.presentation

import androidx.lifecycle.ViewModel
import com.example.androidtraining2.features.login.domain.SignInUseCase
import kotlinx.coroutines.newSingleThreadContext

class LoginViewModel(private val signInUseCase: SignInUseCase) : ViewModel (){

    fun validateClicked(userName : String, password: String):Boolean{
     return signInUseCase.invoke(userName,password)
    }
}