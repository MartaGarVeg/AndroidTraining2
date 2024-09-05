package com.example.androidtraining2.features.login.data.local

import android.content.Context

class LoginXmlLocalDataSource (private val context:Context) {

    val sharedPref = context.getSharedPreferences("username", Context.MODE_PRIVATE)

    fun saveUsername(username: String){
        val editor = sharedPref.edit()
        editor.putString("key_username", username)
        editor.commit()
    }

    fun deleteUsername(){
        val editor = sharedPref.edit()
        editor.remove("key_username")
        editor.commit()
    }
}