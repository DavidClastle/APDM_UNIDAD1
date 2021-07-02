package com.example.eva3_4_detener_hilos_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    Thread inf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inf = new Thread(){
            public void run(){
                super.run();
                int i = 0;
                while (true){
                    Log.wtf("Hilo inf","" + i);

                    try {
                        Thread.sleep(500);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                        break;
                    }
                    i++;
                }
            }
        };
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        inf.interrupt();
    }
}