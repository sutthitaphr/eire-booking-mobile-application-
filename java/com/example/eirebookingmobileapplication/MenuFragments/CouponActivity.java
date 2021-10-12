package com.example.eirebookingmobileapplication.MenuFragments;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.eirebookingmobileapplication.R;

public class CouponActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_coupon);
        getSupportActionBar().setTitle("Coupon");

    }
}
