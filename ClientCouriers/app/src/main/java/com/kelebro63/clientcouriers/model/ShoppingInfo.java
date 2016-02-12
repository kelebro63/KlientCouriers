package com.kelebro63.clientcouriers.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Kelebro63 on 12.02.2016.
 */
public class ShoppingInfo {

    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("maximum_price")
    @Expose
    private Integer maximumPrice;

    /**
     *
     * @return
     * The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     * The maximumPrice
     */
    public Integer getMaximumPrice() {
        return maximumPrice;
    }

    /**
     *
     * @param maximumPrice
     * The maximum_price
     */
    public void setMaximumPrice(Integer maximumPrice) {
        this.maximumPrice = maximumPrice;
    }

}
