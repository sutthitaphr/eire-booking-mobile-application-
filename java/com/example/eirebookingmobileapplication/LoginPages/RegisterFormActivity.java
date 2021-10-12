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
import com.example.eirebookingmobileapplication.MenuMainActivity;
import com.example.eirebookingmobileapplication.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegisterFormActivity<auth> extends AppCompatActivity {

    //Variables 
    EditText uFirstName;
    EditText uLastName;
    EditText uEmail;
    EditText uPassword;
    EditText uConfirmPassword;
    Button uRegisterBtn;
    ProgressBar progressBar;

    //Part of Firebase authentication 
    FirebaseAuth fAuth;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_login_register);
        getSupportActionBar().setTitle("Register");

        //Objects from GUI 
        uFirstName = findViewById(R.id.FirstName);
        uLastName = findViewById(R.id.LastName);
        uEmail = findViewById(R.id.Email);
        uPassword = findViewById(R.id.Password);
        uConfirmPassword = findViewById(R.id.ConfirmPassword);
        uRegisterBtn = findViewById(R.id.registerBtn);
        progressBar = findViewById(R.id.progressBar);

        //Part of Firebase authentication 
        fAuth = FirebaseAuth.getInstance();

        /**Check if user is already logged in 
         if(fAuth.getCurrentUser() != null){
         startActivity(new Intent(getApplicationContext(), HomeFragment.class));
         finish();
         }
         */

        //RegisterBtn On Click Action 
        uRegisterBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String firstName = uFirstName.getText().toString();
                String lastName = uLastName.getText().toString();
                String email = uEmail.getText().toString();
                String password = uPassword.getText().toString();
                String confirmPassword = uConfirmPassword.getText().toString();

                // Make fields required 
                if (TextUtils.isEmpty(firstName)) {
                    uFirstName.setError("First Name is Required.");
                    return;
                }

                if (TextUtils.isEmpty(lastName)) {
                    uLastName.setError("Last Name is Required.");
                    return;
                }
                if (TextUtils.isEmpty(email)) {
                    uEmail.setError("Email is Required.");
                    return;
                }
                if (TextUtils.isEmpty(password)) {
                    uPassword.setError("Password is Required.");
                    return;
                }
                if(password.length() < 6){
                    uPassword.setError("Password must have at least 6 characters");
                }
                if (TextUtils.isEmpty(confirmPassword)) {
                    uConfirmPassword.setError("Please Confirm your Password");
                    return;
                }

                // Progress bar so the user knows that the app is Loading 
                progressBar.setVisibility(View.VISIBLE);

                //Register User in Firebase 
                fAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    //Check if registration task was successful or not 
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(RegisterFormActivity.this, "Your Account Has Been Successfully Created!", Toast.LENGTH_SHORT).show();
                            //If User account is created, send user to the Home Page 
                            startActivity(new Intent(getApplicationContext(), HomeFragment.class));
                        }else {
                            Toast.makeText(RegisterFormActivity.this, "Something went wrong!" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }

                    }
                });

            }

        });

    }
} 

 