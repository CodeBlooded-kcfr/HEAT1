package com.example.lupepages;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Customer_services extends AppCompatActivity {

    ListView listView;
    List list = new ArrayList();
    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_services);
        getSupportActionBar().setTitle("Customer Services");

        listView = (ListView)findViewById(R.id.list_view);

        list.add("Edwards Scissor Hands: Aesthetics");
        list.add("The Cut: Aesthetics");
        list.add("Gena's Beautyshop: Beauty ");
        list.add("Makeup by Mady: Beauty");
        list.add("Mike's Shoe Service: Cleaning");
        list.add("Molly the Maid: Cleaning");
        list.add("Sweet Tooth Treats: Culinary");
        list.add("Meals by Mel: Culinary");
        list.add("Sincerely DP: Entertainment");
        list.add("DJ Nick: Entertainment");
        list.add("Lion Looks: Fashion");
        list.add("UrbanWear: Fashion");
        list.add("Workouts with Wendy: Health");
        list.add("Tony's Meal Prep: Health");
        list.add("Clips by Chris: Photography");
        list.add("Snap it to Me: Photography");

        adapter = new ArrayAdapter(Customer_services. this, android.R.layout.simple_list_item_1,list);
        listView.setAdapter(adapter);

    }
}
