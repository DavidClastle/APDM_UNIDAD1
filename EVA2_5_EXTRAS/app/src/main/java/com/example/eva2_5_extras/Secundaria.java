package com.example.eva2_5_extras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class Secundaria extends AppCompatActivity {
    Intent intent;
    TextView txtVwDatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);
        intent= getIntent();
       String sNom= intent.getStringExtra("NOMBRE");
       double dSal= intent.getDoubleExtra("SALARIO",0.0);
       boolean bInfo= intent.getBooleanExtra("INFO",false);
       int iEstado = intent.getIntExtra("ESTADO_CIVIL",0);
        TextView txtVwDatos;
        txtVwDatos= findViewById(R.id.txtVwDatos);
        txtVwDatos.append("Nombre ");
        txtVwDatos.append(sNom);
        txtVwDatos.append("Salario ");
        txtVwDatos.append(dSal+"");
        txtVwDatos.append("Informacion ");
        if(bInfo )
            txtVwDatos.append("Con información");
        else
            txtVwDatos.append("Sin información");
       //RadioButton rdTemp= findViewById(iEstado);
        txtVwDatos.append("Estado civil:");
        //txtVwDatos.append(rdTemp.getText());


    }
    public void onClickSal(View v){
    finish();
    }
}