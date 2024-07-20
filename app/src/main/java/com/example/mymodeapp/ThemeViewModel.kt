package com.example.mymodeapp

import android.content.res.Resources.Theme
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class ThemeViewModel: ViewModel() {
    private val _theme = MutableStateFlow(ThemeName.LIGHT)
    val theme: StateFlow<ThemeName> = _theme


    fun setTheme(theme: ThemeName) {
        viewModelScope.launch {
            _theme.emit(theme)
        }
    }
}