package com.example.eva2_6_on_activity_result;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    final int CODIGO_SECUN= 1000;
    Button btnInSecun;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intent= new Intent(this, Secundaria.class);
    }

    @Override
    protected void onStart() {
        super.onStart();
        btnInSecun = findViewById(R.id.btnInSecun);
        btnInSecun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(intent, CODIGO_SECUN);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode){
            case CODIGO_SECUN:
                if (resultCode== Activity.RESULT_OK){
                    Toast.makeText(this, data.getStringExtra("Valor"), Toast.LENGTH_LONG).show();
                }
                break;
            default:
        }

    }
}