package com.example.eva2_6_activity_result;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class secundaria extends AppCompatActivity {
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);
        //intent = new Intent();
        intent = getIntent();
        Toast.makeText(this,intent.getStringExtra("DATOS"),Toast.LENGTH_LONG).show();
    }


    public void onClickSec(View v){
        intent.putExtra("VALOR","HOLAMUNDO");
        setResult(Activity.RESULT_OK,intent);
        finish();
    }

    public void onClickCancel(View v){
        setResult(Activity.RESULT_CANCELED);
        finish();
    }
}