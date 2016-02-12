package com.kelebro63.clientcouriers.di.components;

import com.kelebro63.clientcouriers.api.ICouriersAPI;
import com.kelebro63.clientcouriers.di.modules.AppModule;

import javax.inject.Singleton;

import dagger.Component;


@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
    ICouriersAPI api();
}
