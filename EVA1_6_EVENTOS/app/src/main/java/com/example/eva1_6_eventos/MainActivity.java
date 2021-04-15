package com.example.eva1_6_eventos;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
        Button btnListener;
        Button btnClaseAnonima;
        Button btnPorClase;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnListener= findViewById(R.id.btnListener);
        btnClaseAnonima= findViewById(R.id.btnClaseAnonima);
        btnPorClase= findViewById(R.id.btnPorClase);


        btnListener.setOnClickListener(this);
        btnClaseAnonima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "EVENTO POR CLASE ANONIMA", Toast.LENGTH_LONG).show();
            }
        });
        MiClaseOnClick objClick= new MiClaseOnClick();
        objClick.setContext(this);
        btnPorClase.setOnClickListener(objClick);

    }
    //USANDO PROPIEDAD ANDROID.ONCLICK DEL WIDGET
    //public void NOMBREDELMETODO(View arg){}
    public void miClick(View arg){
        //MOSTRAR UN MENSAJE TOAST
        Toast.makeText(this, "EVENTO ONCLICK CON XML", Toast.LENGTH_LONG).show();

    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "EVENTO POR LISTENER", Toast.LENGTH_SHORT).show();
    }
}
