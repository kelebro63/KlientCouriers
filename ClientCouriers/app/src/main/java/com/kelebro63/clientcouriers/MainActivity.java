package com.kelebro63.clientcouriers;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

import butterknife.Bind;

public class MainActivity extends AppCompatActivity {


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
    }


}
