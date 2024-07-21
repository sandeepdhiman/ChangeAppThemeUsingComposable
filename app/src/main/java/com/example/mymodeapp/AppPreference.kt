package com.example.mymodeapp

import android.content.Context

object AppPreference {

    fun getSharedPreference(context: Context) = context.getSharedPreferences(Contants.preferenceName, Context.MODE_PRIVATE)

    fun putString(context: Context, key: String, value: ThemeName) {
        getSharedPreference(context).edit().putString(key, value.toString()).apply()

    }

    fun getString(context: Context, key: String) = getSharedPreference(context).getString(key, ThemeName.LIGHT.toString())


}