package com.example.eva2_5_extras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    EditText txtNombre, txtSalario;
    RadioGroup rgEstado;
    CheckBox chInfo;

    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intent= new Intent(this,Secundaria.class);
    }

    @Override
    protected void onStart() {
        super.onStart();
        txtNombre = findViewById(R.id.txtNombre);
        txtSalario= findViewById(R.id.txtSalario);
        rgEstado = findViewById(R.id.rgEstado);
        chInfo = findViewById(R.id.chInfo);
    }

    public void onClick(View v){
        intent.putExtra("NOMBRE", txtNombre.getText().toString());
        Double dSalario= 0.0;
        dSalario= Double.parseDouble(txtSalario.getText().toString());
        intent.putExtra("SALARIO", dSalario);
        intent.putExtra("INFO",chInfo.isChecked());
        intent.putExtra("ESTADO_CIVIL",rgEstado.getCheckedRadioButtonId());



        startActivity(intent);
    }
}