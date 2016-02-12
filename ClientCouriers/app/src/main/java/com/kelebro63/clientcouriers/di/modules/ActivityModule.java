package com.kelebro63.clientcouriers.di.modules;


import com.kelebro63.clientcouriers.MainActivity;

import dagger.Module;

@Module
public class ActivityModule {

    private final MainActivity activity;

    public ActivityModule(MainActivity activity) {
        this.activity = activity;
    }

}
