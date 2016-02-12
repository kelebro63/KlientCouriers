package com.kelebro63.clientcouriers.di.components;

import com.kelebro63.clientcouriers.MainActivity;
import com.kelebro63.clientcouriers.di.modules.ActivityModule;
import com.kelebro63.clientcouriers.di.qualifiers.PerActivity;

import dagger.Component;


@PerActivity
@Component(dependencies = {AppComponent.class}, modules = {ActivityModule.class})
public interface ActivityComponent {
    void inject(MainActivity activity);
}
