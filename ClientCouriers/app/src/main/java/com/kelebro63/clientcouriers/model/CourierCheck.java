package com.kelebro63.clientcouriers.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Kelebro63 on 12.02.2016.
 */
public class CourierCheck {

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("price")
    @Expose
    private Integer price;

    /**
     *
     * @return
     * The title
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     * The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return
     * The price
     */
    public Integer getPrice() {
        return price;
    }

    /**
     *
     * @param price
     * The price
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

}
