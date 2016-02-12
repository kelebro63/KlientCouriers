package com.kelebro63.clientcouriers.model.authorization;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Kelebro63 on 12.02.2016.
 */
public class ClientProfile {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("avatar_url")
    @Expose
    private String avatarUrl;
    @SerializedName("address")
    @Expose
    private Address address;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("card_mask")
    @Expose
    private String cardMask;
    @SerializedName("coupon_code")
    @Expose
    private String couponCode;
    @SerializedName("orders_total")
    @Expose
    private Integer ordersTotal;
    @SerializedName("rating")
    @Expose
    private String rating;
    @SerializedName("registration_date")
    @Expose
    private String registrationDate;
    @SerializedName("is_blocked")
    @Expose
    private Boolean isBlocked;

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
     * The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     *
     * @param phone
     * The phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     *
     * @return
     * The avatarUrl
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     *
     * @param avatarUrl
     * The avatar_url
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    /**
     *
     * @return
     * The address
     */
    public Address getAddress() {
        return address;
    }

    /**
     *
     * @param address
     * The address
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     *
     * @return
     * The email
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     * The email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return
     * The cardMask
     */
    public String getCardMask() {
        return cardMask;
    }

    /**
     *
     * @param cardMask
     * The card_mask
     */
    public void setCardMask(String cardMask) {
        this.cardMask = cardMask;
    }

    /**
     *
     * @return
     * The couponCode
     */
    public String getCouponCode() {
        return couponCode;
    }

    /**
     *
     * @param couponCode
     * The coupon_code
     */
    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    /**
     *
     * @return
     * The ordersTotal
     */
    public Integer getOrdersTotal() {
        return ordersTotal;
    }

    /**
     *
     * @param ordersTotal
     * The orders_total
     */
    public void setOrdersTotal(Integer ordersTotal) {
        this.ordersTotal = ordersTotal;
    }

    /**
     *
     * @return
     * The rating
     */
    public String getRating() {
        return rating;
    }

    /**
     *
     * @param rating
     * The rating
     */
    public void setRating(String rating) {
        this.rating = rating;
    }

    /**
     *
     * @return
     * The registrationDate
     */
    public String getRegistrationDate() {
        return registrationDate;
    }

    /**
     *
     * @param registrationDate
     * The registration_date
     */
    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    /**
     *
     * @return
     * The isBlocked
     */
    public Boolean getIsBlocked() {
        return isBlocked;
    }

    /**
     *
     * @param isBlocked
     * The is_blocked
     */
    public void setIsBlocked(Boolean isBlocked) {
        this.isBlocked = isBlocked;
    }

}
