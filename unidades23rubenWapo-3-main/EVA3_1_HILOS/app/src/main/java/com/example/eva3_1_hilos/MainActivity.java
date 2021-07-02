package com.example.eva3_1_hilos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for(int i = 0;i < 10;i++)
            try {
                Thread.sleep(1000);
                Log.wtf("hilo main", "i: " + i);
            } catch (InterruptedException e){
                e.printStackTrace();
            }

    }
}