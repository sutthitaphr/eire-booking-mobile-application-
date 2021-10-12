package com.example.eirebookingmobileapplication.LoginPages;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.eirebookingmobileapplication.R;

public class LoginMainActivity extends AppCompatActivity{

    private Button loginButton;
    private Button registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_login);
        getSupportActionBar().setTitle("Login/Register");

        loginButton = (Button) findViewById(R.id.login_button);
        registerButton = (Button) findViewById(R.id.register_button);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLoginFormActivity();
            }
        });

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRegisterFormActivity();
            }
        });
    }

    public void openLoginFormActivity() {
        Intent intent = new Intent(this, LoginFormActivity.class);
        startActivity(intent);
    }

    public void openRegisterFormActivity() {
        Intent intent = new Intent(this, RegisterFormActivity.class);
        startActivity(intent);
    }
}
