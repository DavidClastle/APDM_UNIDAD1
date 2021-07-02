package com.example.eva2_5_extras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    EditText nom,ape;
    RadioButton casado,soltero,divorciado,no;
    Button enviar;
    CheckBox ch;
    Intent intent;
    RadioGroup radioGroup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        nom = findViewById(R.id.edtNombre);
        ape = findViewById(R.id.edtApe);
        soltero = findViewById(R.id.solteroBtn);
        divorciado = findViewById(R.id.divorciadoBtn);
        no = findViewById(R.id.sinBtn);
        casado = findViewById(R.id.casadoBtn);
        enviar = findViewById(R.id.enviarBtn);
        ch = findViewById(R.id.checkBox1);
        intent = new Intent(this,Secundary.class);
        radioGroup = findViewById(R.id.rGroup);
    }

    public void onClickMain(View v){
        intent.putExtra("NOMBRE",nom.getText().toString());
        Double dSalario = 0.0;
        dSalario =Double.parseDouble(ape.getText().toString());
        intent.putExtra("SALARIO",dSalario);
        intent.putExtra("INFO",ch.isChecked());
        intent.putExtra("ESTADO_CIVIL",radioGroup.getCheckedRadioButtonId())
        startActivity(intent);

    }
}