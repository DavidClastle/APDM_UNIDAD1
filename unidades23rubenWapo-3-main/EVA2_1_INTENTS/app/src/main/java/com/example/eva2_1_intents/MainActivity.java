package com.example.eva2_1_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String tel = "tel:5555";
    Intent intel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void onClickBtn1(View v){
        intel = new Intent(Intent.ACTION_DIAL, Uri.parse(tel));
        startActivity(intel);

    }

    public  void onClickBtn2(View v){
        intel = new Intent(Intent.ACTION_CALL, Uri.parse(tel));
        startActivity(intel);


    }
}