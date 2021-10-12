package com.example.eirebookingmobileapplication.MenuFragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import com.example.eirebookingmobileapplication.MenuMainActivity;
import com.example.eirebookingmobileapplication.R;

public class BookingDetailsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_booking_details);
        getSupportActionBar().setTitle("Booking Details");

    }
}