package com.example.androidtraining2.features.login.data.local

import android.content.Context

class LoginXmlLocalDataSource (private val context:Context) {

    val sharedPref = context.getSharedPreferences("username", Context.MODE_PRIVATE)
    private val keyUsername = "key_username"
    fun saveUsername(username: String){
        val editor = sharedPref.edit()
        editor.putString(keyUsername, username)
        editor.commit()
    }

    fun deleteUsername(){
        val editor = sharedPref.edit()
        editor.remove(keyUsername)
        editor.commit()
    }

    fun getUsername():String?{
        return sharedPref.getString(keyUsername, null)
    }
}