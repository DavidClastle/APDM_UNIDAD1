package com.example.eva2_5_extras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Secundary extends AppCompatActivity {

    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundary);
        intent = getIntent();
        String sNom = intent.getStringExtra("NOMBRE");
        Double dSal = intent.getDoubleExtra("SALARIO",0.0);
        boolean bInfo = intent.getBooleanExtra("INFO",false);
        int  IEstado = intent.getIntExtra("ESTADO_CIVIL",0);
        TextView textView;
        textView = findViewById(R.id.textViewDatos);
        textView.append("Nombre: \n");
        textView.append(sNom + "\n" );
        textView.append("Salario: \n");
        textView.append(dSal + "\n" );
        textView.append("Información: \n");
        textView.append(bInfo + "\n" );
        if(bInfo)
            textView.append("Con informacion");
         else
            textView.append("Con informacion");

        textView.append("Estado civil: \n");
        textView.append(IEstado + "\n" );
    }

    public void onClickClose(View v){
        finish();

    }

}