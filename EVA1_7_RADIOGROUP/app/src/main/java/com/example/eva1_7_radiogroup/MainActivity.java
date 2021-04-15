package com.example.eva1_7_radiogroup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup Smash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Smash= findViewById(R.id.Smash);
        //ASIGNAR EL LISTENER
        Smash.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override //Radio group que genera el evento, GENERA EL EVENTO DEL RADIOBUTTON SELECCIONADO
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
            //TOAST INDICANDO CUAL RADIOBUTTON ES SELECCIONADO
              /*  switch (i){
                    case R.id.radioButton:
                        Toast.makeText(getApplicationContext(), "MARIO", Toast.LENGTH_SHORT).show();
                        break;
                     case R.id.radioButton2;
                         Toast.makeText(getApplicationContext(), "DK", Toast.LENGTH_SHORT).show();
                    case R.id.radioButton3:
                        Toast.makeText(getApplicationContext(), "Samus", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioButton4;
                        Toast.makeText(getApplicationContext(), "Ness", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioButton5:
                        Toast.makeText(getApplicationContext(), "Jigglypuff", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioButton6;
                        Toast.makeText(getApplicationContext(), "Cloud", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                }
            }
        }); */
                RadioButton rdBtnSel;
                rdBtnSel= findViewById(i); //Radiobutton seleccionado
                Toast.makeText(getApplicationContext(), rdBtnSel.getText(), Toast.LENGTH_SHORT).show();
    }
}
    }}
