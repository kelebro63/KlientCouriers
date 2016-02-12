package com.kelebro63.clientcouriers.model.authorization;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by dtx12 on 24.09.2015.
 */
public class User {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("client_profile")
    @Expose
    private ClientProfile clientProfile;
    @SerializedName("courier_profile")
    @Expose
    private CourierProfile courierProfile;

    /**
     *
     * @return
     * The id
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The clientProfile
     */
    public ClientProfile getClientProfile() {
        return clientProfile;
    }

    /**
     *
     * @param clientProfile
     * The client_profile
     */
    public void setClientProfile(ClientProfile clientProfile) {
        this.clientProfile = clientProfile;
    }

    /**
     *
     * @return
     * The courierProfile
     */
    public CourierProfile getCourierProfile() {
        return courierProfile;
    }

    /**
     *
     * @param courierProfile
     * The courier_profile
     */
    public void setCourierProfile(CourierProfile courierProfile) {
        this.courierProfile = courierProfile;
    }

}
