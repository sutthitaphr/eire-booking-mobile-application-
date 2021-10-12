package com.example.eirebookingmobileapplication.SettingsPages;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.eirebookingmobileapplication.R;

public class PrivacyPolicyActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_settings_policy);
        getSupportActionBar().setTitle("Privacy Policy");

    }
}
