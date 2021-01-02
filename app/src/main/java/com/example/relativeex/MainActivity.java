package com.example.relativeex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements

        AdapterView.OnItemSelectedListener {
    String[] phone= {"Moblie","Landline","AppLink","other"};
    String[] email= {"Business","Personal","Inmail","other"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spin= findViewById(R.id.spinner);
        spin.setOnItemSelectedListener(this);

        Spinner spin1= findViewById(R.id.spinner2);
        spin1.setOnItemSelectedListener(this);

        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,phone);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(aa);

        ArrayAdapter ab = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item,email);
        ab.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin1.setAdapter(ab);
    }

    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
        Toast.makeText(getApplicationContext(),phone[position], Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(),email[position], Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}