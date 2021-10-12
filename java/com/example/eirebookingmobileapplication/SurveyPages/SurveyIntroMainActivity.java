package com.example.eirebookingmobileapplication.SurveyPages;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.eirebookingmobileapplication.R;

public class SurveyIntroMainActivity extends AppCompatActivity {
    private Button startSurveyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_survey_intro);
        getSupportActionBar().setTitle("Survey");

        startSurveyButton = (Button) findViewById(R.id.start_button);
        startSurveyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSurveyFormActivity();
            }
        });
    }

    public void openSurveyFormActivity() {
        Intent intent = new Intent(this, SurveyFormActivity.class);
        startActivity(intent);
    }
}
