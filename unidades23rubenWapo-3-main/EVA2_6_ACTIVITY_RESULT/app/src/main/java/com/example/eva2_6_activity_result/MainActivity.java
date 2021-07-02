package com.example.eva2_6_activity_result;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    final int codigo_sec = 1000;
    final int CODIGO_CONTACTO = 2000;
    final int CODIGO_IMG = 3000;
    Button btnInitSec;
    Intent intent,intentCont,intentImg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intent = new Intent(this,secundaria.class);
        intentCont = new Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI);
        intentImg = new Intent(Intent.ACTION_PICK, Uri.parse("content://media/external/images/media"));
    }

    @Override
    protected void onStart() {
        super.onStart();
        btnInitSec = findViewById(R.id.btnEnviar);
        btnInitSec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            intent.putExtra("DATOS","Información enviada desde el principal");
                startActivityForResult(intent,codigo_sec);

            }
        });
    }

    public void OnClickCont(View v){
        if(v.getId() == R.id.buttonCont)
            startActivityForResult(intentCont,CODIGO_CONTACTO);
        else
            startActivityForResult(intentImg,CODIGO_IMG);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){
            case codigo_sec:
                if(resultCode== Activity.RESULT_OK){
                    Toast.makeText(this,data.getStringExtra("VALOR"),Toast.LENGTH_LONG).show();

                }
                break;
            case CODIGO_CONTACTO:
                if(resultCode == Activity.RESULT_OK){
                    String returnData = data.getDataString();
                    Toast.makeText(this,returnData,Toast.LENGTH_LONG);

                }
            case CODIGO_IMG:
                if(resultCode == Activity.RESULT_OK){
                    String returnData = data.getDataString();
                    Toast.makeText(this,returnData,Toast.LENGTH_LONG);

                }

                break;
            default:

        }

    }
}