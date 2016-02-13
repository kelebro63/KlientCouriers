package com.kelebro63.clientcouriers.api;

import com.kelebro63.clientcouriers.model.OrderResult;
import com.kelebro63.clientcouriers.model.authorization.AuthenticationResult;

import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;
import rx.Observable;


public interface ICouriersAPI {
    @FormUrlEncoded
    @POST("/authentication/request_code")
    Observable<Object> requestCode(@Field("phone") String phone);

    @FormUrlEncoded
    @POST("/clients/authentication/sms")
    Observable<AuthenticationResult> authorize(@Field("phone") String phone, @Field("sms_code") String smsCode);

    @FormUrlEncoded
    @POST("/orders")
    Observable<OrderResult> createOrder(@Field("template_id") int templateId,  @Field("payment_type") String paymentType,
                                        @Field("shopping_info[description]") String shopping_info,
                                        @Field("shopping_info[maximum_price]") int max_price,
                                        @Field("point_a[name]") String name_A,
                                        @Field("point_a[phone]") String phone_A,
                                        @Field("point_a[latitude]") String latitude_A,
                                        @Field("point_a[longitude]") String longitude_A,
                                        @Field("point_a[location_description]") String locationDescription_A,
                                        @Field("point_b[name]") String name_B,
                                        @Field("point_b[phone]") String phone_B,
                                        @Field("point_b[latitude]") String latitude_B,
                                        @Field("point_b[longitude]") String longitude_B,
                                        @Field("point_b[location_description]") String locationDescription_B,
                                        @Field("comment") String comment

    );
}
