package com.example.eirebookingmobileapplication.LoginPages;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.eirebookingmobileapplication.MenuFragments.HomeFragment;
import com.example.eirebookingmobileapplication.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginFormActivity extends AppCompatActivity {
    EditText uEmail;
    EditText uPassword;
    Button uLoginBtn;
    ProgressBar progressBarLogin;

    //Part of Firebase Class
    FirebaseAuth fAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_login_form);
        getSupportActionBar().setTitle("Login");

        //Objects from GUI
        uEmail = findViewById(R.id.email);
        uPassword = findViewById(R.id.password);
        uLoginBtn = findViewById(R.id.loginBtn);
        progressBarLogin = findViewById(R.id.progressBar2);

        fAuth = FirebaseAuth.getInstance();

        uLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = uEmail.getText().toString();
                String password = uPassword.getText().toString();

                // Make fields required
                if (TextUtils.isEmpty(email)) {
                    uEmail.setError("Username is Required.");
                    return;
                }

                if (TextUtils.isEmpty(password)) {
                    uPassword.setError("Password is Required.");
                    return;
                }

                // Progress bar so the user knows that the app is Loading
                progressBarLogin.setVisibility(View.VISIBLE);

                //Authenticate the User
                fAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    //Check if login was successful or not
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(LoginFormActivity.this, "You are Logged in!", Toast.LENGTH_SHORT).show();
                            //If Login is successful, send user to Home Page
                            startActivity(new Intent(getApplicationContext(), HomeFragment.class));
                        }else{
                            Toast.makeText(LoginFormActivity.this, "Something went wrong!" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }

                    }
                });

            }
        });
    }
}
