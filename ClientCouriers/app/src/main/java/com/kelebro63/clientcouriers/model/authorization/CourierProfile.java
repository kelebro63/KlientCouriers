package com.kelebro63.clientcouriers.model.authorization;


import com.kelebro63.clientcouriers.model.CourierStatus;

/**
 * Created by dtx12 on 24.09.2015.
 */
public class CourierProfile {
    private int id;
    private String name;
    private String phone;
    private String avatarUrl;
    private String email;
    private int debt;
    private int compensation;
    private int due;
    private String status;
    private int ordersTotal;
    private float rating;
    private String cardMask;
    private int distance;

    public int getDistanceInKm() {
        return (int) (distance / 1000f);
    }

    public String getCardMask() {
        return cardMask;
    }

    public int getOrdersTotal() {
        return ordersTotal;
    }

    public float getRating() {
        return rating;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public String getEmail() {
        return email;
    }

    public int getDebt() {
        return debt;
    }

    public int getCompensation() {
        return compensation;
    }

    public int getDue() {
        return due;
    }

    public boolean isOnline() {
        return CourierStatus.ONLINE.equals(status);
    }
}
