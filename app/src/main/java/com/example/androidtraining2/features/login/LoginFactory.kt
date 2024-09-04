package com.example.androidtraining2.features.login

import com.example.androidtraining2.features.login.data.LoginDataRepository
import com.example.androidtraining2.features.login.data.remote.LoginMockRemoteDataSource
import com.example.androidtraining2.features.login.domain.LoginRepository
import com.example.androidtraining2.features.login.domain.SignInUseCase
import com.example.androidtraining2.features.login.presentation.LoginViewModel

class LoginFactory {

    private val loginMockRemoteDataSource: LoginMockRemoteDataSource = provideLoginRemoteDataSource()
    private val loginRepository: LoginRepository =provideLoginDataRepository()
    private val signInUseCase : SignInUseCase = provideSignInUseCase()

    fun provideLoginViewModel() : LoginViewModel{
        return LoginViewModel(signInUseCase)
    }
    private fun provideLoginRemoteDataSource(): LoginMockRemoteDataSource{
        return LoginMockRemoteDataSource()
    }

    private fun provideLoginDataRepository(): LoginDataRepository{
        return LoginDataRepository(loginMockRemoteDataSource)
    }

    fun provideSignInUseCase() : SignInUseCase{
        return SignInUseCase(loginRepository)
    }
}