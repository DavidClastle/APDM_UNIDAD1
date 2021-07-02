package com.example.eva2_2_intentos_implicitos;

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
                //ACCION Y DATOS
                //ACTIVIDAD DE ORIGEN(context),CLASE DE LA ACTIVITY DESTINO
            intent = new Intent(this, OtraActivity.class);
    }

    public void onClick(View view){
        startActivity(intent);
    }
}