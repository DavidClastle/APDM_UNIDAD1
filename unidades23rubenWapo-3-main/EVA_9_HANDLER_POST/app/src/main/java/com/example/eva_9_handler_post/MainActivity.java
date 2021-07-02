package com.example.eva_9_handler_post;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtMostrar;
    Thread hilo;
    Handler handler = new Handler();
    Runnable background = new Runnable(){
        @Override
        public void run() {
            while (true){
                try {
                    Thread.sleep(1000);
                    handler.post(fore);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    break;
                }

            }

        }
    };

    Runnable fore = new Runnable() {
        @Override
        public void run() {
            txtMostrar.setText("Hola muundo");
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtMostrar = findViewById(R.id.txt);

        hilo = new Thread(background);
        hilo.start();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        hilo.interrupt();
    }
}