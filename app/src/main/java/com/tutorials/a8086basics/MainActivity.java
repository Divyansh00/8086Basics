package com.tutorials.a8086basics;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;



public class MainActivity extends Activity {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button)findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openIntroduction8086();
            }
        });
        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTutorial();
            }
        });
        button3 = findViewById((R.id.button3));
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPrograms();
            }
        });
        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openQuestions();
            }
        });
        button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAboutUs();
            }
        });
        button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openChat();
            }
        });



        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            NotificationManager mNotificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
            NotificationChannel mChannel = new NotificationChannel(Constants.CHANNEL_ID,Constants.CHANNEL_NAME,NotificationManager.IMPORTANCE_HIGH);

            mChannel.setDescription(Constants.CHANNEL_DESCRIPTION);
            mChannel.enableLights(true);
            mChannel.setLightColor(Color.RED);
            mChannel.enableVibration(true);
            mChannel.setVibrationPattern(new long[]{100,200,300,400,500,400,300,200,400});

            mNotificationManager.createNotificationChannel(mChannel);
        }
    }
    public void openIntroduction8086(){
        Intent intent = new Intent(this,Introduction8086.class);
        startActivity(intent);
    }
    public void openTutorial(){
        Intent intent = new Intent(this,Tutorial.class);
        startActivity(intent);
    }
    public void openPrograms(){
        Intent intent = new Intent(this,Programs.class);
        startActivity(intent);
    }
    public void openQuestions(){
        Intent intent = new Intent(this,Questions.class);
        startActivity(intent);
    }
    public void openAboutUs(){
        Intent intent = new Intent(this,AboutUs.class);
        startActivity(intent);
    }
    public void openChat(){
        Intent intent = new Intent(this,Chat.class);
        startActivity(intent);
    }


}
