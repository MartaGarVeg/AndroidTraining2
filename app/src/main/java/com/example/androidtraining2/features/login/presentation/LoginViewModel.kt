package com.example.androidtraining2.features.login.presentation

import androidx.lifecycle.ViewModel
import com.example.androidtraining2.features.login.domain.DeleteUsernameUseCase
import com.example.androidtraining2.features.login.domain.SaveUsernameUseCase
import com.example.androidtraining2.features.login.domain.SignInUseCase
import kotlinx.coroutines.newSingleThreadContext

class LoginViewModel(
    private val signInUseCase: SignInUseCase,
    private val saveUsernameUseCase: SaveUsernameUseCase,
    private val deleteUsernameUseCase: DeleteUsernameUseCase)
    : ViewModel (){

    fun validateClicked(userName : String, password: String, isRememberChecked: Boolean):Boolean{
        if (isRememberChecked){
            saveUsernameUseCase.invoke(userName)
        }
        else {
            deleteUsernameUseCase.invoke()
        }
     return signInUseCase.invoke(userName,password)
    }
}