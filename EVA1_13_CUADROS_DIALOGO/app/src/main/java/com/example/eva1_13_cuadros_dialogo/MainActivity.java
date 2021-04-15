package com.example.eva1_13_cuadros_dialogo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //EVENTOS CLICK
    public void onClickCDSistema(View v){
        new AlertDialog.Builder(this).setTitle("Cuadro de dialogo de Android").setMessage("Hola mundo").setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(), "BOTON OK", Toast.LENGTH_SHORT).show();
            }
        })
                .setNegativeButton("No",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "BOTON NO", Toast.LENGTH_SHORT).show();
                            }
                        })
                .setNeutralButton("Cancel",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "BOTON CANCEL", Toast.LENGTH_SHORT).show();
                            }
                        })
                .show();

    }
    public void onClickCDCustom(View v){
        Dialog dlMiCuadroDialogo = new Dialog (this);
        //ASIGNAR LAYOUT
        dlMiCuadroDialogo.setContentView(R.layout.cuadro_dialogo);
        //VINCULAR LOS WIDGETS
        TextView txtVwTitulo;
        EditText editTxtDatos;
        Button btnAccion;
        txtVwTitulo = dlMiCuadroDialogo.findViewById(R.id.txtVwTitulo);
        editTxtDatos = dlMiCuadroDialogo.findViewById(R.id.editTxtDatos);
        btnAccion= dlMiCuadroDialogo.findViewById(R.id.btnAccion);
        txtVwTitulo.setText("ESTE ES UN CUADRO DE DIALOGO PERSONALISADO");
        btnAccion.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(), editTxtDatos.getText().toString(), Toast.LENGTH_SHORT).show();
                        dlMiCuadroDialogo.dismiss();
                    }
                }
        );
        dlMiCuadroDialogo.show();
    }
}