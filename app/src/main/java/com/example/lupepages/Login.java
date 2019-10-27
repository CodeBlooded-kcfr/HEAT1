package com.example.lupepages;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().setTitle("Login");

    }

    public void login_button(View view) {

        startActivity(new Intent(getApplicationContext(), Services.class));
    }

    public void login_button2(View view) {

        startActivity(new Intent(getApplicationContext(), Customer_services.class));
    }
}