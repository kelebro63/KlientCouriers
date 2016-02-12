package com.kelebro63.clientcouriers.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Kelebro63 on 12.02.2016.
 */
public class OrderResult {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("template")
    @Expose
    private Template template;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("order_state")
    @Expose
    private String orderState;
    @SerializedName("shipping_state")
    @Expose
    private String shippingState;
    @SerializedName("completion_percent")
    @Expose
    private Integer completionPercent;
    @SerializedName("point_a")
    @Expose
    private PointA pointA;
    @SerializedName("point_b")
    @Expose
    private PointB pointB;
    @SerializedName("shopping_info")
    @Expose
    private ShoppingInfo shoppingInfo;
    @SerializedName("comment")
    @Expose
    private String comment;
    @SerializedName("payment_type")
    @Expose
    private String paymentType;
    @SerializedName("created_at")
    @Expose
    private Integer createdAt;
    @SerializedName("delivery_est")
    @Expose
    private Integer deliveryEst;
    @SerializedName("billing_start_time")
    @Expose
    private Integer billingStartTime;
    @SerializedName("billing_end_time")
    @Expose
    private Integer billingEndTime;
    @SerializedName("status_description")
    @Expose
    private String statusDescription;
    @SerializedName("cancel_reason")
    @Expose
    private String cancelReason;
    @SerializedName("delivery_est_price")
    @Expose
    private Integer deliveryEstPrice;
    @SerializedName("billed_base_price")
    @Expose
    private Integer billedBasePrice;
    @SerializedName("billed_duration_price")
    @Expose
    private Integer billedDurationPrice;
    @SerializedName("billed_shopping_price")
    @Expose
    private Integer billedShoppingPrice;
    @SerializedName("debt")
    @Expose
    private String debt;
    @SerializedName("compensation")
    @Expose
    private Integer compensation;
    @SerializedName("due")
    @Expose
    private Integer due;
    @SerializedName("courier_preview")
    @Expose
    private CourierPreview courierPreview;
    @SerializedName("client_preview")
    @Expose
    private ClientPreview clientPreview;
    @SerializedName("client_check")
    @Expose
    private ClientCheck clientCheck;
    @SerializedName("courier_check")
    @Expose
    private CourierCheck courierCheck;
    @SerializedName("client_comment")
    @Expose
    private String clientComment;
    @SerializedName("courier_comment")
    @Expose
    private String courierComment;
    @SerializedName("admin_comment")
    @Expose
    private String adminComment;

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
     * The template
     */
    public Template getTemplate() {
        return template;
    }

    /**
     *
     * @param template
     * The template
     */
    public void setTemplate(Template template) {
        this.template = template;
    }

    /**
     *
     * @return
     * The state
     */
    public String getState() {
        return state;
    }

    /**
     *
     * @param state
     * The state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     *
     * @return
     * The orderState
     */
    public String getOrderState() {
        return orderState;
    }

    /**
     *
     * @param orderState
     * The order_state
     */
    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    /**
     *
     * @return
     * The shippingState
     */
    public String getShippingState() {
        return shippingState;
    }

    /**
     *
     * @param shippingState
     * The shipping_state
     */
    public void setShippingState(String shippingState) {
        this.shippingState = shippingState;
    }

    /**
     *
     * @return
     * The completionPercent
     */
    public Integer getCompletionPercent() {
        return completionPercent;
    }

    /**
     *
     * @param completionPercent
     * The completion_percent
     */
    public void setCompletionPercent(Integer completionPercent) {
        this.completionPercent = completionPercent;
    }

    /**
     *
     * @return
     * The pointA
     */
    public PointA getPointA() {
        return pointA;
    }

    /**
     *
     * @param pointA
     * The point_a
     */
    public void setPointA(PointA pointA) {
        this.pointA = pointA;
    }

    /**
     *
     * @return
     * The pointB
     */
    public PointB getPointB() {
        return pointB;
    }

    /**
     *
     * @param pointB
     * The point_b
     */
    public void setPointB(PointB pointB) {
        this.pointB = pointB;
    }

    /**
     *
     * @return
     * The shoppingInfo
     */
    public ShoppingInfo getShoppingInfo() {
        return shoppingInfo;
    }

    /**
     *
     * @param shoppingInfo
     * The shopping_info
     */
    public void setShoppingInfo(ShoppingInfo shoppingInfo) {
        this.shoppingInfo = shoppingInfo;
    }

    /**
     *
     * @return
     * The comment
     */
    public String getComment() {
        return comment;
    }

    /**
     *
     * @param comment
     * The comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     *
     * @return
     * The paymentType
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     *
     * @param paymentType
     * The payment_type
     */
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    /**
     *
     * @return
     * The createdAt
     */
    public Integer getCreatedAt() {
        return createdAt;
    }

    /**
     *
     * @param createdAt
     * The created_at
     */
    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    /**
     *
     * @return
     * The deliveryEst
     */
    public Integer getDeliveryEst() {
        return deliveryEst;
    }

    /**
     *
     * @param deliveryEst
     * The delivery_est
     */
    public void setDeliveryEst(Integer deliveryEst) {
        this.deliveryEst = deliveryEst;
    }

    /**
     *
     * @return
     * The billingStartTime
     */
    public Integer getBillingStartTime() {
        return billingStartTime;
    }

    /**
     *
     * @param billingStartTime
     * The billing_start_time
     */
    public void setBillingStartTime(Integer billingStartTime) {
        this.billingStartTime = billingStartTime;
    }

    /**
     *
     * @return
     * The billingEndTime
     */
    public Integer getBillingEndTime() {
        return billingEndTime;
    }

    /**
     *
     * @param billingEndTime
     * The billing_end_time
     */
    public void setBillingEndTime(Integer billingEndTime) {
        this.billingEndTime = billingEndTime;
    }

    /**
     *
     * @return
     * The statusDescription
     */
    public String getStatusDescription() {
        return statusDescription;
    }

    /**
     *
     * @param statusDescription
     * The status_description
     */
    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    /**
     *
     * @return
     * The cancelReason
     */
    public String getCancelReason() {
        return cancelReason;
    }

    /**
     *
     * @param cancelReason
     * The cancel_reason
     */
    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }

    /**
     *
     * @return
     * The deliveryEstPrice
     */
    public Integer getDeliveryEstPrice() {
        return deliveryEstPrice;
    }

    /**
     *
     * @param deliveryEstPrice
     * The delivery_est_price
     */
    public void setDeliveryEstPrice(Integer deliveryEstPrice) {
        this.deliveryEstPrice = deliveryEstPrice;
    }

    /**
     *
     * @return
     * The billedBasePrice
     */
    public Integer getBilledBasePrice() {
        return billedBasePrice;
    }

    /**
     *
     * @param billedBasePrice
     * The billed_base_price
     */
    public void setBilledBasePrice(Integer billedBasePrice) {
        this.billedBasePrice = billedBasePrice;
    }

    /**
     *
     * @return
     * The billedDurationPrice
     */
    public Integer getBilledDurationPrice() {
        return billedDurationPrice;
    }

    /**
     *
     * @param billedDurationPrice
     * The billed_duration_price
     */
    public void setBilledDurationPrice(Integer billedDurationPrice) {
        this.billedDurationPrice = billedDurationPrice;
    }

    /**
     *
     * @return
     * The billedShoppingPrice
     */
    public Integer getBilledShoppingPrice() {
        return billedShoppingPrice;
    }

    /**
     *
     * @param billedShoppingPrice
     * The billed_shopping_price
     */
    public void setBilledShoppingPrice(Integer billedShoppingPrice) {
        this.billedShoppingPrice = billedShoppingPrice;
    }

    /**
     *
     * @return
     * The debt
     */
    public String getDebt() {
        return debt;
    }

    /**
     *
     * @param debt
     * The debt
     */
    public void setDebt(String debt) {
        this.debt = debt;
    }

    /**
     *
     * @return
     * The compensation
     */
    public Integer getCompensation() {
        return compensation;
    }

    /**
     *
     * @param compensation
     * The compensation
     */
    public void setCompensation(Integer compensation) {
        this.compensation = compensation;
    }

    /**
     *
     * @return
     * The due
     */
    public Integer getDue() {
        return due;
    }

    /**
     *
     * @param due
     * The due
     */
    public void setDue(Integer due) {
        this.due = due;
    }

    /**
     *
     * @return
     * The courierPreview
     */
    public CourierPreview getCourierPreview() {
        return courierPreview;
    }

    /**
     *
     * @param courierPreview
     * The courier_preview
     */
    public void setCourierPreview(CourierPreview courierPreview) {
        this.courierPreview = courierPreview;
    }

    /**
     *
     * @return
     * The clientPreview
     */
    public ClientPreview getClientPreview() {
        return clientPreview;
    }

    /**
     *
     * @param clientPreview
     * The client_preview
     */
    public void setClientPreview(ClientPreview clientPreview) {
        this.clientPreview = clientPreview;
    }

    /**
     *
     * @return
     * The clientCheck
     */
    public ClientCheck getClientCheck() {
        return clientCheck;
    }

    /**
     *
     * @param clientCheck
     * The client_check
     */
    public void setClientCheck(ClientCheck clientCheck) {
        this.clientCheck = clientCheck;
    }

    /**
     *
     * @return
     * The courierCheck
     */
    public CourierCheck getCourierCheck() {
        return courierCheck;
    }

    /**
     *
     * @param courierCheck
     * The courier_check
     */
    public void setCourierCheck(CourierCheck courierCheck) {
        this.courierCheck = courierCheck;
    }

    /**
     *
     * @return
     * The clientComment
     */
    public String getClientComment() {
        return clientComment;
    }

    /**
     *
     * @param clientComment
     * The client_comment
     */
    public void setClientComment(String clientComment) {
        this.clientComment = clientComment;
    }

    /**
     *
     * @return
     * The courierComment
     */
    public String getCourierComment() {
        return courierComment;
    }

    /**
     *
     * @param courierComment
     * The courier_comment
     */
    public void setCourierComment(String courierComment) {
        this.courierComment = courierComment;
    }

    /**
     *
     * @return
     * The adminComment
     */
    public String getAdminComment() {
        return adminComment;
    }

    /**
     *
     * @param adminComment
     * The admin_comment
     */
    public void setAdminComment(String adminComment) {
        this.adminComment = adminComment;
    }

}
