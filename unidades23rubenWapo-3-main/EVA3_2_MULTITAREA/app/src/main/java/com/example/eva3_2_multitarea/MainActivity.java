package com.example.eva3_2_multitarea;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread hilo = new Thread(){

            public void run(){
                super.run();
                for(int i = 0;i < 10;i++)
                    try {
                        Thread.sleep(1000);
                        Log.wtf("hilo main", "i: " + i);
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }

            }
        };

        hilo.start();
        new miElote().start();
        new Thread(new paCorrer()).start();;
    }
}

class miElote extends Thread{

    public void run(){
        super.run();
        for(int i = 0;i < 10;i++)
            try {
                Thread.sleep(1000);
                Log.wtf("hilo main", "i: " + i);
            } catch (InterruptedException e){
                e.printStackTrace();
            }

    }
}

class paCorrer implements Runnable{


    @Override
    public void run() {
        System.out.print("aaaa");
    }
}