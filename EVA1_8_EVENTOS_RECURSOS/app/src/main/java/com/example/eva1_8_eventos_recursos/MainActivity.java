package com.example.eva1_8_eventos_recursos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
implements RadioGroup.OnCheckedChangeListener {
    TextView txtVwNombre, txtVwApellido;
    EditText txtNombre, txtApellido;
    RadioGroup rdGrpIdioma;
    RadioButton rdBtnEs, rdBtnIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtVwNombre = findViewById(R.id.txtVwNombre);
        txtVwApellido = findViewById(R.id.txtVwApellido);
        txtNombre = findViewById(R.id.txtNombre);
        txtApellido = findViewById(R.id.txtApellido);
        rdGrpIdioma = findViewById(R.id.rdGrpIdioma);
        rdBtnEs = findViewById(R.id.rdBtnEs);
        rdBtnIn = findViewById(R.id.rdBtnIn);
        rdGrpIdioma.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int i) {
        if (i== R.id.rdBtnEs){
            txtVwNombre.setText(R.string.txt_vw_nom);
            txtNombre.setHint(R.string.txt_nom);
            txtVwApellido.setText(R.string.txt_vw_ape);
            txtApellido.setHint(R.string.txt_vw_ape);
            rdBtnEs.setText(R.string.rd_btn_es);
            rdBtnIn.setText(R.string.rd_btn_in);

        } else{
            txtVwNombre.setText(R.string.txt_vw_nom_en);
            txtNombre.setHint(R.string.txt_nom_en);
            txtVwApellido.setText(R.string.txt_vw_ape_en);
            txtApellido.setHint(R.string.txt_vw_ape_en);
            rdBtnEs.setText(R.string.rd_btn_es_en);
            rdBtnIn.setText(R.string.rd_btn_in_en);

        }
    }
}