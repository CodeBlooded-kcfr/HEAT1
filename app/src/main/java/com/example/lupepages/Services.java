package com.example.lupepages;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Services extends AppCompatActivity {

    private Button maesthetics_btn;
    private Button mbeauty_btn;
    private Button mcleaning_btn;
    private Button mculinary_btn;
    private Button mentertainment_btn;
    private Button mfashion_btn;
    private Button mHealth_btn;
    private Button mphotography_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);
        getSupportActionBar().setTitle("Services");

        maesthetics_btn = (Button) findViewById(R.id.aesthetics_btn);
        maesthetics_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Services.this,R.string.aesthetics_btn,Toast.LENGTH_SHORT).show();

            }
        });
        mbeauty_btn = (Button) findViewById(R.id.beauty_btn);
        mbeauty_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Services.this,R.string.beauty_btn,Toast.LENGTH_SHORT).show();

            }
        });
        mcleaning_btn = (Button) findViewById(R.id.cleaning_btn);
        mcleaning_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Services.this,R.string.cleaning_btn,Toast.LENGTH_SHORT).show();

            }
        });
        mculinary_btn = (Button) findViewById(R.id.culinary_btn);
        mculinary_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Services.this,R.string.culinary_btn,Toast.LENGTH_SHORT).show();

            }
        });
        mentertainment_btn = (Button) findViewById(R.id.entertainment_btn);
        mentertainment_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Services.this,R.string.entertainment_btn,Toast.LENGTH_SHORT).show();

            }
        });
        mfashion_btn = (Button) findViewById(R.id.fashion_btn);
        mfashion_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Services.this,R.string.fashion_btn,Toast.LENGTH_SHORT).show();

            }
        });
        mHealth_btn = (Button) findViewById(R.id.Health_btn);
        mHealth_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Services.this,R.string.Health_btn,Toast.LENGTH_SHORT).show();
            }
        });
        mphotography_btn = (Button) findViewById(R.id.photography_btn);
        mphotography_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Services.this,R.string.photography_btn,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
