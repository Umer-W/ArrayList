package com.muhammadumer.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> friendList = new ArrayList<String>();
        friendList.add("musa");
        friendList.add("ali");
        friendList.add("Faizan");
        friendList.add("Qasim");
        friendList.add("usama");
        listView = findViewById(R.id.listView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1,friendList);


        listView.setAdapter(arrayAdapter);
    }
}