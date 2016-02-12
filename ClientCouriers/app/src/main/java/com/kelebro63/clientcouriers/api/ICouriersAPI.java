package com.kelebro63.clientcouriers.api;

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
    @POST("/couriers/authentication/sms")
    Observable<AuthenticationResult> authorize(@Field("phone") String phone, @Field("sms_code") String smsCode);


}