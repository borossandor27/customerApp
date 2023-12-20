package com.example.customerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
/* -- Forrás: https://abhiandroid.com/ui/listview#gsc.tab=0 */
public class MainActivity extends AppCompatActivity {
    ListView simpleList;
    String countryList[] = {"India", "China", "Australia", "Portugle", "America", "NewZealand"};
    int flags[] = {R.drawable.india, R.drawable.china, R.drawable.australia, R.drawable.portugle, R.drawable.america, R.drawable.newzealand};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    private void init(){
        simpleList = (ListView) findViewById(R.id.listView);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), countryList, flags);
        simpleList.setAdapter(customAdapter);
    }
}