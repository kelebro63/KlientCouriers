package com.kelebro63.clientcouriers.prefs;


public interface IPrefs {



    String getSessionKey();

    void setSessionKey(String sessionKey);

    boolean isOnline();

    boolean isLoggedIn();
}
