package com.kelebro63.clientcouriers.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Kelebro63 on 12.02.2016.
 */
public class Template {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("position")
    @Expose
    private Integer position;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("image_url")
    @Expose
    private String imageUrl;
    @SerializedName("icon_url")
    @Expose
    private String iconUrl;
    @SerializedName("icon_type")
    @Expose
    private String iconType;
    @SerializedName("requires_point_a")
    @Expose
    private Boolean requiresPointA;
    @SerializedName("requires_point_b")
    @Expose
    private Boolean requiresPointB;
    @SerializedName("requires_shopping_info")
    @Expose
    private Boolean requiresShoppingInfo;
    @SerializedName("shopping_info_placeholder")
    @Expose
    private String shoppingInfoPlaceholder;
    @SerializedName("shopping_info_type")
    @Expose
    private String shoppingInfoType;
    @SerializedName("comment_placeholder")
    @Expose
    private String commentPlaceholder;
    @SerializedName("base_price")
    @Expose
    private Integer basePrice;
    @SerializedName("per_minute")
    @Expose
    private Integer perMinute;
    @SerializedName("price_est")
    @Expose
    private Integer priceEst;
    @SerializedName("delivery_duration_est")
    @Expose
    private Integer deliveryDurationEst;
    @SerializedName("total_orders")
    @Expose
    private Integer totalOrders;

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
     * The position
     */
    public Integer getPosition() {
        return position;
    }

    /**
     *
     * @param position
     * The position
     */
    public void setPosition(Integer position) {
        this.position = position;
    }

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
     * The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The imageUrl
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     *
     * @param imageUrl
     * The image_url
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     *
     * @return
     * The iconUrl
     */
    public String getIconUrl() {
        return iconUrl;
    }

    /**
     *
     * @param iconUrl
     * The icon_url
     */
    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    /**
     *
     * @return
     * The iconType
     */
    public String getIconType() {
        return iconType;
    }

    /**
     *
     * @param iconType
     * The icon_type
     */
    public void setIconType(String iconType) {
        this.iconType = iconType;
    }

    /**
     *
     * @return
     * The requiresPointA
     */
    public Boolean getRequiresPointA() {
        return requiresPointA;
    }

    /**
     *
     * @param requiresPointA
     * The requires_point_a
     */
    public void setRequiresPointA(Boolean requiresPointA) {
        this.requiresPointA = requiresPointA;
    }

    /**
     *
     * @return
     * The requiresPointB
     */
    public Boolean getRequiresPointB() {
        return requiresPointB;
    }

    /**
     *
     * @param requiresPointB
     * The requires_point_b
     */
    public void setRequiresPointB(Boolean requiresPointB) {
        this.requiresPointB = requiresPointB;
    }

    /**
     *
     * @return
     * The requiresShoppingInfo
     */
    public Boolean getRequiresShoppingInfo() {
        return requiresShoppingInfo;
    }

    /**
     *
     * @param requiresShoppingInfo
     * The requires_shopping_info
     */
    public void setRequiresShoppingInfo(Boolean requiresShoppingInfo) {
        this.requiresShoppingInfo = requiresShoppingInfo;
    }

    /**
     *
     * @return
     * The shoppingInfoPlaceholder
     */
    public String getShoppingInfoPlaceholder() {
        return shoppingInfoPlaceholder;
    }

    /**
     *
     * @param shoppingInfoPlaceholder
     * The shopping_info_placeholder
     */
    public void setShoppingInfoPlaceholder(String shoppingInfoPlaceholder) {
        this.shoppingInfoPlaceholder = shoppingInfoPlaceholder;
    }

    /**
     *
     * @return
     * The shoppingInfoType
     */
    public String getShoppingInfoType() {
        return shoppingInfoType;
    }

    /**
     *
     * @param shoppingInfoType
     * The shopping_info_type
     */
    public void setShoppingInfoType(String shoppingInfoType) {
        this.shoppingInfoType = shoppingInfoType;
    }

    /**
     *
     * @return
     * The commentPlaceholder
     */
    public String getCommentPlaceholder() {
        return commentPlaceholder;
    }

    /**
     *
     * @param commentPlaceholder
     * The comment_placeholder
     */
    public void setCommentPlaceholder(String commentPlaceholder) {
        this.commentPlaceholder = commentPlaceholder;
    }

    /**
     *
     * @return
     * The basePrice
     */
    public Integer getBasePrice() {
        return basePrice;
    }

    /**
     *
     * @param basePrice
     * The base_price
     */
    public void setBasePrice(Integer basePrice) {
        this.basePrice = basePrice;
    }

    /**
     *
     * @return
     * The perMinute
     */
    public Integer getPerMinute() {
        return perMinute;
    }

    /**
     *
     * @param perMinute
     * The per_minute
     */
    public void setPerMinute(Integer perMinute) {
        this.perMinute = perMinute;
    }

    /**
     *
     * @return
     * The priceEst
     */
    public Integer getPriceEst() {
        return priceEst;
    }

    /**
     *
     * @param priceEst
     * The price_est
     */
    public void setPriceEst(Integer priceEst) {
        this.priceEst = priceEst;
    }

    /**
     *
     * @return
     * The deliveryDurationEst
     */
    public Integer getDeliveryDurationEst() {
        return deliveryDurationEst;
    }

    /**
     *
     * @param deliveryDurationEst
     * The delivery_duration_est
     */
    public void setDeliveryDurationEst(Integer deliveryDurationEst) {
        this.deliveryDurationEst = deliveryDurationEst;
    }

    /**
     *
     * @return
     * The totalOrders
     */
    public Integer getTotalOrders() {
        return totalOrders;
    }

    /**
     *
     * @param totalOrders
     * The total_orders
     */
    public void setTotalOrders(Integer totalOrders) {
        this.totalOrders = totalOrders;
    }

}

