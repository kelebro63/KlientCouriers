package com.kelebro63.clientcouriers.model.authorization;

/**
 * Created by dtx12 on 24.09.2015.
 */
public class User {
    private int id;
    private CourierProfile courierProfile;

    public int getId() {
        return id;
    }

    public CourierProfile getCourierProfile() {
        return courierProfile;
    }

    public void setCourierProfile(CourierProfile courierProfile) {
        this.courierProfile = courierProfile;
    }
}
