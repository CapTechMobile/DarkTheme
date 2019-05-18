package com.captechventures.darktheme.fragment

import android.os.Bundle
import androidx.preference.ListPreference
import androidx.preference.PreferenceFragmentCompat
import com.captechventures.darktheme.R
import com.captechventures.darktheme.util.ThemeHelper

class SettingsFragment : PreferenceFragmentCompat() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        addPreferencesFromResource(R.xml.preferences)

        val themePref = findPreference<ListPreference>("themePref");

        if (themePref != null) {
            themePref.setOnPreferenceChangeListener({ preference, newValue ->
                val themeOption = newValue as String
                ThemeHelper.applyTheme(themeOption)
                true
            });
        }
    }


}
