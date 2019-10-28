package com.example.lupepages;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button entbutton;
    private Button entbutton2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("HEAT");

        entbutton = (Button) findViewById(R.id.entbutton);
        entbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Entrepreneurs();
            }
        });
    }

    public void  Entrepreneurs() {
        Intent intent = new Intent(this, SignUp.class);
        startActivity(intent);

        entbutton2 = (Button) findViewById(R.id.entbutton2);
        entbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Customers();
            }
        });
   }

    public void  Customers() {
        Intent intent = new Intent(this, Customer_Signup.class);
        startActivity(intent);

    }
}
