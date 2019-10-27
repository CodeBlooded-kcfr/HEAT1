package com.example.lupepages;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


import androidx.appcompat.app.AppCompatActivity;



public class SplashScreen extends AppCompatActivity {
    private static final int SPLASH_DELAY = 300;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       startActivity(new Intent( this, MainActivity.class));
        finish();
    }
}
