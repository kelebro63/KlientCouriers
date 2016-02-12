package com.kelebro63.clientcouriers.di.modules;


import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.kelebro63.clientcouriers.App;
import com.kelebro63.clientcouriers.BuildConfig;
import com.kelebro63.clientcouriers.R;
import com.kelebro63.clientcouriers.api.ICouriersAPI;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Response;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit.RestAdapter;
import retrofit.client.OkClient;
import retrofit.converter.GsonConverter;


@Module
public class AppModule {
    private final App app;

    public AppModule(App app) {
        this.app = app;
    }



    @Singleton
    @Provides
    OkHttpClient provideClient() {
        OkHttpClient client = new OkHttpClient();
        client.setConnectTimeout(15, TimeUnit.SECONDS);
        client.setReadTimeout(15, TimeUnit.SECONDS);
        client.setWriteTimeout(15, TimeUnit.SECONDS);
        return client;
    }

    @Singleton
    @Provides
    ICouriersAPI provideAPI(OkHttpClient client) {
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();
        RestAdapter adapter = new RestAdapter.Builder().setClient(new OkClient(client))
                .setEndpoint(app.getString(R.string.endpoint))
                .setLogLevel(RestAdapter.LogLevel.FULL)
//                .setRequestInterceptor(requestFacade -> {
//                    if (prefs.isLoggedIn()) {
//                        requestFacade.addHeader("Authorization", String.format("token %s", prefs.getSessionKey()));
//                    }
//                })
            .setConverter(new GsonConverter(gson)).build();
        return adapter.create(ICouriersAPI.class);
    }

    @Singleton
    @Provides
    IPrefs providePrefs() {
        return new Prefs(app);
    }
}
