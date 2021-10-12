package com.example.eirebookingmobileapplication.PaymentsPages;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.eirebookingmobileapplication.R;

public class PaymentActivity extends AppCompatActivity {
    private Button payButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.booking_payment);
        getSupportActionBar().setTitle("Payment");

        payButton = (Button) findViewById(R.id.pay_button);
        payButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSuccessfulPaymentActivity();
            }
        });
    }

    public void openSuccessfulPaymentActivity() {
        Intent intent = new Intent(this, SuccessfulPaymentActivity.class);
        startActivity(intent);
    }
}
