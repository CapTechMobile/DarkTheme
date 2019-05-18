package com.captechventures.darktheme

import android.app.Application
import androidx.preference.PreferenceManager
import com.captechventures.darktheme.util.ThemeHelper

class DarkThemeApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        val sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        val themePref = sharedPreferences.getString("themePref", ThemeHelper.DEFAULT_MODE)
        themePref?.let {
            ThemeHelper.applyTheme(it)
        }

    }

}