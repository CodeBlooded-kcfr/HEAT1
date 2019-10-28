package com.example.lupepages;
/*
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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
*/

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.text.style.TtsSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Customer_Signup extends AppCompatActivity {
    DatabaseHelper2 myDb2;
    EditText editID, editFull_Name, editEmail, editPassword, editZip_Code;
    Button btnAddData, btnViewData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer__signup);
        getSupportActionBar().setTitle("Customer Sign Up");
        myDb2 = new DatabaseHelper2(this);

        editFull_Name = (EditText)findViewById(R.id.editText_full_name);
        editEmail = (EditText)findViewById(R.id.editText_email);
        editPassword =  (EditText)findViewById(R.id.editText_password);
        editZip_Code = (EditText)findViewById(R.id.editText_zip_code);
        btnAddData = (Button)findViewById(R.id.button_add);
        btnViewData = (Button)findViewById(R.id.button_view);
        AddData();
        viewData();
    }

    public void AddData(){
        btnAddData.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        boolean isInserted = myDb2.insertData(editFull_Name.getText().toString(),
                                editEmail.getText().toString(),
                                editPassword.getText().toString(),
                                editZip_Code.getText().toString() );

                        if (isInserted = true)
                            Toast.makeText(Customer_Signup.this, "Data Added", Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(Customer_Signup.this, "Data Not Added", Toast.LENGTH_LONG).show();
                    }
                }
        );
    }

    public void viewData() {
        btnViewData.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        Cursor results = myDb2.getViewData();
                        if(results.getCount() == 0) {
                            showData("Error", "Unsuccessful");
                            return;
                        }
                        StringBuffer buffer = new StringBuffer();
                        while(results.moveToNext()) {
                            buffer.append(" ID: " + ((Cursor) results).getString(0) + "\n}");
                            buffer.append(" Full Name: " + results.getString(1) + "\n}");
                            buffer.append(" Email: " + results.getString(2) + "\n}");
                            buffer.append(" Password: " + results.getString(3) + "\n}");
                            buffer.append(" Company Name: " + results.getString(4) + "\n}");
                            buffer.append(" Zip Code: " + results.getString(5) + "\n\n");

                            ;                        }

                        showData("Data", buffer.toString());

                    }
                }
        );
    }

    public void showData(String title, String message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        boolean b = true;
        if (b) return true;
        else return false;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        return false;
    }

    public void login_button(View view) {

        startActivity(new Intent(getApplicationContext(),Login.class));
    }

}
