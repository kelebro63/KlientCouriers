package com.kelebro63.clientcouriers;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.kelebro63.clientcouriers.api.ICouriersAPI;
import com.kelebro63.clientcouriers.base.BaseSubscriber;
import com.kelebro63.clientcouriers.di.components.DaggerActivityComponent;
import com.kelebro63.clientcouriers.di.modules.ActivityModule;
import com.kelebro63.clientcouriers.model.OrderResult;
import com.kelebro63.clientcouriers.model.authorization.AuthenticationResult;
import com.kelebro63.clientcouriers.prefs.Prefs;
import com.kelebro63.clientcouriers.views.PhoneFormatter;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    private List<Subscription> subscriptions = new ArrayList<>();

    @Inject
    public ICouriersAPI serverApi;

    @Inject
    PhoneFormatter phoneFormatter;


    Prefs prefs;

    @Nullable
    @Bind(R.id.btnAuth)
    Button authenticate;

    @Nullable
    @Bind(R.id.btnSendSMS)
    Button sumToTransfer;

    @Nullable
    @Bind(R.id.btnCreateOrder)
    Button createOrder;

    @Nullable
    @Bind(R.id.etPass)
    EditText etPass;

    @Nullable
    @Bind(R.id.etPhone)
    EditText etPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupActivityComponent();
        ButterKnife.bind(this);
        etPhone.addTextChangedListener(phoneFormatter);
    }



    @OnClick(R.id.btnAuth)
    void getKey() {
        getKey(etPhone.getText().toString(), new BaseSubscriber<Object>() {

            @Override
            public void onStartImpl() {
                String t = "";
            }

            @Override
            public void onCompletedImpl() {
                Toast.makeText(MainActivity.this, "запрос на авторизацию прошел", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onErrorImpl(Throwable e) {

            }

            @Override
            public void onNextImpl(Object result) {
                String t = "";
            }
        });
    }



    @OnClick(R.id.btnSendSMS)
    void authenticate() {
        authorize(etPhone.getText().toString(), etPass.getText().toString(), new BaseSubscriber<AuthenticationResult>() {

            @Override
            public void onStartImpl() {
                String t = "";
            }

            @Override
            public void onCompletedImpl() {
                Toast.makeText(MainActivity.this, "авторизовались", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onErrorImpl(Throwable e) {

            }

            @Override
            public void onNextImpl(AuthenticationResult result) {
                Prefs prefs = new Prefs(MainActivity.this);
                prefs.setSessionKey(result.getSessionKey());
            }
        });
    }

    @OnClick(R.id.btnCreateOrder)
    void createOrder() {
        createOrder(9, "cash",
                "тестовый заказ, не берите его пожалуйста",
                5000,
                "Тестовый пользователь, разработчик приложения",
                "+7(927)029-51-15",
                "56.34601",
                "43.87218",
                "Тольятти, Подстепки, ",
                "Тестовый пользователь, разработчик приложения",
                "+7(927)029-51-15",
                "56.34601",
                "43.87218",
                "Тольятти, Подстепки, ",
                "тестовый заказ, не берите его пожалуйста",

                new BaseSubscriber<OrderResult>() {

            @Override
            public void onStartImpl() {
                String t = "";
            }

            @Override
            public void onCompletedImpl() {
                Toast.makeText(MainActivity.this, "заявка создана!", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onErrorImpl(Throwable e) {

            }

            @Override
            public void onNextImpl(OrderResult result) {
                String t = "";
            }
        });
    }

    public void getKey(String phone, Subscriber<Object> subscriber) {
        subscribe(serverApi.requestCode(phone), subscriber);
    }

    public void authorize(String phone, String sms, Subscriber<AuthenticationResult> subscriber) {
        subscribe(serverApi.authorize(phone, sms), subscriber);
    }

    public void createOrder(int templateId, String paymentType, String shopping_info, int maxPrice,
                            String name_A, String phone_A, String latitude,String longitude, String locationDescription_A,
                            String name_B, String phone_B, String latitude_B,String longitude_B,
                            String locationDescription_B,String comment, Subscriber<OrderResult> subscriber) {
        subscribe(serverApi.createOrder(templateId, paymentType, shopping_info, maxPrice,name_A,
                 phone_A, latitude,longitude, locationDescription_A,
                 name_B, phone_B, latitude_B,longitude_B, locationDescription_B, comment), subscriber);
    }

    private void subscribe(Observable observable, Subscriber subscriber) {
        subscriptions.add(observable
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber));
    }

    public void setupActivityComponent() {
        DaggerActivityComponent.builder().appComponent(MyApp.getAppComponent(this)).activityModule(new ActivityModule(this)).build().inject(this);
    }


}
