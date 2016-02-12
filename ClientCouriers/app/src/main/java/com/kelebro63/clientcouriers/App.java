package com.kelebro63.clientcouriers;

import android.app.Application;
import android.content.Context;

import com.crashlytics.android.Crashlytics;

import io.fabric.sdk.android.Fabric;
import ru.aipmedia.couriers.di.components.AppComponent;
import ru.aipmedia.couriers.di.components.DaggerAppComponent;
import ru.aipmedia.couriers.di.modules.AppModule;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

public class App extends Application {

    private AppComponent appComponent;

    public static AppComponent getAppComponent(Context context) {
        return ((App) context.getApplicationContext()).appComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        if (appComponent == null) {
            appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
        }
    }
}
