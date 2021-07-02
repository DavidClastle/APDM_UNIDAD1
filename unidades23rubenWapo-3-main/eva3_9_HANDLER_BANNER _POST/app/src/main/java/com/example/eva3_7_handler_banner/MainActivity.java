package com.example.eva3_7_handler_banner;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    ImageView view;
    Thread hilo;
    int[] imgs;
    int c = 0;
    Handler manej = new Handler();
    Runnable fore = new Runnable() {
        @Override
        public void run() {
            view.setImageResource(imgs[c]);
            if (c < 3)
                c++;
            else
                c = 0;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view= findViewById(R.id.banner);

        hilo = new Thread(){
            @Override
            public void run() {
                super.run();

                while (true){
                    try {
                        Thread.sleep(1000);
                        Message ms = manej.obtainMessage();
                        manej.post(fore);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        imgs = new int[]{
            R.drawable.f1,
            R.drawable.f2,
            R.drawable.f3
        };
        hilo.start();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        hilo.interrupt();
    }
}