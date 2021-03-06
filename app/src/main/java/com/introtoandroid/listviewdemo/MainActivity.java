package com.introtoandroid.listviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.class_schedule);

        //String[] listItems = {"CSCI 230", "CSCI 490", "MUSC 101"};

        String[] listItems = getResources().getStringArray(R.array.class_schedule);

        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listItems);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l){

                Toast.makeText(getApplicationContext(), "Quick Click", Toast.LENGTH_SHORT).show();


            }
        });

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener(){

            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l){

                Toast.makeText(getApplicationContext(),"Long Click!", Toast.LENGTH_SHORT).show();


                return true;
            }
        });


    }
}
