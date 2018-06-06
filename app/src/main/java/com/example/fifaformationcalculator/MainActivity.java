package com.example.fifaformationcalculator;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends Calculations {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        List<String> focus = new ArrayList<>();
        focus.add("3 at the back");
        focus.add("4 at the back");
        focus.add("5 at the back");
        Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);
        List<String> focus2 = new ArrayList<>();
        focus2.add("defensive");
        focus2.add("ultra defensive");
        focus2.add("park the bus");
        Spinner spinner3 = (Spinner) findViewById(R.id.spinner3);
        List<String> focus3 = new ArrayList<>();
        focus3.add("attacking");
        focus3.add("ultra attacking");
        focus3.add("all out attack");
        Spinner spinner4 = (Spinner) findViewById(R.id.spinner4);
        List<String> focus4 = new ArrayList<>();
        focus4.add("possession");
        focus4.add("counter attack");
        focus4.add("high pressure");
        focus4.add("long ball");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, focus);
        ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, focus2);
        ArrayAdapter<String> dataAdapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, focus3);
        ArrayAdapter<String> dataAdapter4 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, focus4);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dataAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dataAdapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);
        spinner2.setAdapter(dataAdapter2);
        spinner3.setAdapter(dataAdapter3);
        spinner4.setAdapter(dataAdapter4);
    }


    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();

        // Showing selected spinner item
        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
    }
    public void sendMessage(View view)
    {
        //Calculations calculate = new Calculations();
        Intent intent = new Intent(this, DisplayMessageActivity2.class);
        //EditText editText = (EditText) findViewById(R.id.spinner);
        String message = calculate() + info();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

}


