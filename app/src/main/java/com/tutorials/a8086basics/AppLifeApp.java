package com.tutorials.a8086basics;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by Divyansh on 18-02-2018.
 */

public class AppLifeApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
