package com.kelebro63.clientcouriers;

import android.app.Application;
import android.content.Context;

import com.kelebro63.clientcouriers.di.components.AppComponent;
import com.kelebro63.clientcouriers.di.components.DaggerAppComponent;
import com.kelebro63.clientcouriers.di.modules.AppModule;

public class MyApp extends Application {

    private AppComponent appComponent;

    public static AppComponent getAppComponent(Context context) {
        return ((MyApp) context.getApplicationContext()).appComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        if (appComponent == null) {
            appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
        }
    }
}
