package com.example.eirebookingmobileapplication.SettingsPages;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import com.example.eirebookingmobileapplication.MenuFragments.CouponActivity;
import com.example.eirebookingmobileapplication.R;

public class SettingsMainActivity extends AppCompatActivity {

    private Button accountDetailsButton;
    private Button aboutUsButton;
    private Button policyButton;
    private Button bookingHistoryButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_settings_main);
        getSupportActionBar().setTitle("Settings");

        accountDetailsButton = (Button) findViewById(R.id.account_details_button);
        aboutUsButton = (Button) findViewById(R.id.about_us_button);
        policyButton = (Button) findViewById(R.id.policy_button);
        bookingHistoryButton = (Button) findViewById(R.id.booking_history_button);

        accountDetailsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAccountDetailsActivity();
            }
        });

        aboutUsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAboutUsActivity();
            }
        });

        policyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPrivacyPolicyActivity();
            }
        });

        bookingHistoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openBookingHistoryActivity();
            }
        });
    }

    public void openAccountDetailsActivity() {
        Intent intent = new Intent(this, AccountDetailsActivity.class);
        startActivity(intent);
    }

    public void openAboutUsActivity() {
        Intent intent = new Intent(this, AboutUsActivity.class);
        startActivity(intent);
    }

    public void openPrivacyPolicyActivity(){
        Intent intent = new Intent(this, PrivacyPolicyActivity.class);
        startActivity(intent);
    }

    public void openBookingHistoryActivity(){
        Intent intent = new Intent(this, BookingHistoryActivity.class);
        startActivity(intent);
    }
}
