package com.example.eva2_7_bundles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Secundaria extends AppCompatActivity {

    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);
        intent = getIntent();
        Bundle bundle = intent.getExtras();

        Toast.makeText(this,bundle.getString("MENSAJE") + " " +
                bundle.getInt("EDAD") + " " + bundle.getBoolean("EMPLEADO"),Toast.LENGTH_LONG).show();

    }


}