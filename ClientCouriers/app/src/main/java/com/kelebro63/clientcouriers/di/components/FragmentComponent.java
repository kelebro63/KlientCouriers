package com.kelebro63.clientcouriers.di.components;

import com.kelebro63.clientcouriers.di.modules.FragmentModule;
import com.kelebro63.clientcouriers.di.qualifiers.PerFragment;

import dagger.Component;

@PerFragment
@Component(dependencies = {AppComponent.class}, modules = {FragmentModule.class})
public interface FragmentComponent {
}
