package com.example.lupepages;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Customer_Signup extends AppCompatActivity {

    private Button mDoneButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer__signup);
        getSupportActionBar().setTitle("Customer Sign Up");

        mDoneButton = (Button) findViewById(R.id.done_button);
        mDoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Customer_Signup.this, R.string.done_button, Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void login_button(View view) {

        startActivity(new Intent(getApplicationContext(),Login.class));
    }

}
