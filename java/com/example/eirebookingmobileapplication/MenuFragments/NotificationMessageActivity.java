package com.example.eirebookingmobileapplication.MenuFragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.eirebookingmobileapplication.R;

public class NotificationMessageActivity extends AppCompatActivity {

    private Button checkButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notification_message);
        getSupportActionBar().setTitle("Notification Message");

        TextView textView = findViewById(R.id.notify_text);

        String message = getIntent().getStringExtra("Notification message");
        textView.setText(message);

        checkButton = (Button) findViewById(R.id.check_button);
        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCouponActivity();
            }
        });
    }
    public void openCouponActivity() {
        Intent intent = new Intent(this, CouponActivity.class);
        startActivity(intent);
    }
}