package com.example.eva3_5_hilos_vs_gui;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView etiqueta;
    Thread t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etiqueta = findViewById(R.id.etiq);
        Runnable run = new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (true){

                    try {
                        Thread.sleep(1000);
                        etiqueta.append("i = " + i);
                        Log.wtf( "runneable","i = " + i);
                    } catch (InterruptedException e){
                        e.printStackTrace();
                        break;
                    }
                    i++;
                }
            }
        };
        Thread t =new Thread(run);
        t.start();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        t.interrupt();
    }
}