package com.example.eva2_7_bundles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intent = new Intent(this,Secundaria.class);
    }

    public void OnMain(View v){
        Bundle bundle = new Bundle();
        bundle.putString("MENSAJE","HOLA MUNDO");
        bundle.putInt("EDAD",1000);
        bundle.putBoolean("EMPLEADO",true);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}