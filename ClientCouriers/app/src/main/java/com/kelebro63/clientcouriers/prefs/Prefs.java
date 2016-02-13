package com.kelebro63.clientcouriers.prefs;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;

import com.google.gson.Gson;


public class Prefs implements IPrefs {
    private static final String SESSION_KEY = "session_key";

    private final SharedPreferences preferences;
    private final Gson gson;

    public Prefs(Context context) {
        preferences = PreferenceManager.getDefaultSharedPreferences(context);
        gson = new Gson();
    }

    @Nullable
    public String getSessionKey() {
        return preferences.getString(SESSION_KEY, null);
    }

    public void setSessionKey(String sessionKey) {
        preferences.edit().putString(SESSION_KEY, sessionKey).apply();
    }

    @Override
    public boolean isOnline() {
        return false;
    }


    public boolean isLoggedIn() {
        return getSessionKey() != null;
    }
}
