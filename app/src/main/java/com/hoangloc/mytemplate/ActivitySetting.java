package com.hoangloc.mytemplate;

import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.EditTextPreference;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.SwitchPreference;
import android.widget.Toast;

public class ActivitySetting extends PreferenceActivity {
    CheckBoxPreference checkBoxPreference;
    SwitchPreference switchPreference;
    EditTextPreference editTextPreference;
    ListPreference listPreference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.activity_setting);
        checkBoxPreference = (CheckBoxPreference) findPreference("checkbox");
        checkBoxPreference.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            @Override
            public boolean onPreferenceClick(Preference preference) {
                if (checkBoxPreference.isChecked())
                    Toast.makeText(getBaseContext(),"Checkkkkkkk", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getBaseContext(),"Uncheckkkkkkk", Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        switchPreference = (SwitchPreference) findPreference("switchbox");
        switchPreference.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            @Override
            public boolean onPreferenceClick(Preference preference) {
                if (switchPreference.isChecked())
                    Toast.makeText(getBaseContext(),"Switch On", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getBaseContext(),"Switch Off", Toast.LENGTH_SHORT).show();
                return false;
            }
        });


        editTextPreference = (EditTextPreference) findPreference("editbox");
        editTextPreference.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            @Override
            public boolean onPreferenceChange(Preference preference, Object newValue) {
                Toast.makeText(getBaseContext(),newValue.toString(), Toast.LENGTH_SHORT).show();
                return true;
            }
        });

        listPreference = (ListPreference) findPreference("listbox");
        listPreference.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            @Override
            public boolean onPreferenceChange(Preference preference, Object newValue) {
                Toast.makeText(getBaseContext(), newValue.toString(), Toast.LENGTH_SHORT).show();
                return true;
            }
        });

    }
}
