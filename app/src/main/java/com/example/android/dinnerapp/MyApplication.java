package com.example.android.dinnerapp;

import android.app.Application;

import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;

/**
 * Created by petr on 25-Nov-15.
 */
public class MyApplication extends Application {
    public Tracker mTracker;

    public void startTracking(){
        if (mTracker == null) {
            GoogleAnalytics googleAnalytics = GoogleAnalytics.getInstance(this);
            mTracker = googleAnalytics.newTracker(R.xml.track_app);
            googleAnalytics.enableAutoActivityReports(this);
        }
    }
    public Tracker getmTracker() {
        startTracking();
        return mTracker;
    }
}
