package com.kelebro63.clientcouriers.model.authorization;

/**
 * Created by dtx12 on 23.09.2015.
 */
public class AuthenticationResult {
    private String sessionKey;
    private User user;

    public String getSessionKey() {
        return sessionKey;
    }

    public User getUser() {
        return user;
    }
}
