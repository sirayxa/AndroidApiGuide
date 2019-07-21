package com.example.android.apiguides;

import android.app.Application;
import android.content.Context;

public class ApiGuideApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        final Context appContext = getApplicationContext();
        DataModel.getDataModel().init(appContext);
    }
}
