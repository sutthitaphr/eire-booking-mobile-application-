package com.example.eirebookingmobileapplication.PaymentsPages;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.eirebookingmobileapplication.AccommodationsMainActivity;
import com.example.eirebookingmobileapplication.R;

public class SuccessfulPaymentActivity extends AppCompatActivity {

    private Button book_again_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.successful_booking);
        getSupportActionBar().setTitle("Successful Booking");

        book_again_button = (Button) findViewById(R.id.book_again_button);
        book_again_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAccommodationsMainActivity();
            }
        });
    }

    public void openAccommodationsMainActivity() {
        Intent intent = new Intent(this, AccommodationsMainActivity.class);
        startActivity(intent);
    }
}
