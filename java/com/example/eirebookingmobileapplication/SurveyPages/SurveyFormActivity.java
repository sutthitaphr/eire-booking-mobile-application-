package com.example.eirebookingmobileapplication.SurveyPages;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.eirebookingmobileapplication.MenuFragments.NotificationMessageActivity;
import com.example.eirebookingmobileapplication.R;

public class SurveyFormActivity extends AppCompatActivity {
    private Button submitSurveyButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_survey_form);
        getSupportActionBar().setTitle("Survey Form");

        submitSurveyButton = (Button) findViewById(R.id.submitSurveyButton);
        submitSurveyButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openActivity_survey_message();

                String notify_message = "You have earned a Coupon!";
                NotificationCompat.Builder builder = new NotificationCompat.Builder(SurveyFormActivity.this)
                        .setSmallIcon(R.drawable.ic_notify_coupon)
                        .setContentTitle("Coupon Update")
                        .setContentText(notify_message)
                        .setAutoCancel(true);

                Intent intent = new Intent(SurveyFormActivity.this, NotificationMessageActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("Notification Message", notify_message);

                PendingIntent pendingIntent = PendingIntent.getActivity(SurveyFormActivity.this,0,intent,PendingIntent.FLAG_UPDATE_CURRENT);
                builder.setContentIntent(pendingIntent);

                NotificationManager manager = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
                manager.notify(0,builder.build());

            }
        });
    }
    public void openActivity_survey_message(){
        Intent intent = new Intent(this, SurveyMessageActivity.class);
        startActivity(intent);
    }
}
