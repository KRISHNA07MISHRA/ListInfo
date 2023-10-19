package com.example.listinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView listview;

Spinner spinner;

AutoCompleteTextView autoCompleteTextView;
ArrayList<String> ListName = new ArrayList<>();

ArrayList<String> Idinfo = new ArrayList<>();

ArrayList<String> languagelist = new ArrayList<>();


// here we create arraylis

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // here we find out the id of listview
        listview = findViewById(R.id.listview);
        spinner = findViewById(R.id.spinner);
        autoCompleteTextView = findViewById(R.id.language);
        ListName.add("krishna");
        ListName.add("shyam");
        ListName.add("radha");
        ListName.add("varsha");
        ListName.add("shalini");
        ListName.add("rajan");
        ListName.add("sajan");

        ArrayAdapter<String> AdapterName = new ArrayAdapter<>(getApplication(),android.R.layout.simple_list_item_1,ListName);

        listview.setAdapter(AdapterName);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i == 0){
                    Toast.makeText(MainActivity.this,"Clicked first element",Toast.LENGTH_SHORT).show();
                }
            }
        });


        Idinfo.add("adhar card");
        Idinfo.add("votar card");
        Idinfo.add("diver lience");
        Idinfo.add("rasan card");
        Idinfo.add("pan card");

        ArrayAdapter<String> Idadapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,Idinfo);
        spinner.setAdapter(Idadapter);


        languagelist.add("c++");
        languagelist.add("c");
        languagelist.add("java");
        languagelist.add("kotlin");
        languagelist.add("c#");

        ArrayAdapter<String> lanadapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,languagelist);
        autoCompleteTextView.setAdapter(lanadapter);
        autoCompleteTextView.setThreshold(1);
    }
}