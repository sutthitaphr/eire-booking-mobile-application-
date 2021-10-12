package com.example.eirebookingmobileapplication.SettingsPages;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.eirebookingmobileapplication.R;

public class BookingHistoryActivity  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_settings_booking_history);
        getSupportActionBar().setTitle("Booking History");

    }
}
