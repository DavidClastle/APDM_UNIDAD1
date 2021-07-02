package com.example.eva3_6_handler_message;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView etiqueta;
    Thread t;

    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etiqueta = findViewById(R.id.ETIQ);
        handler = new Handler(){
            @Override
            public void handleMessage(@NonNull Message msg) {
                super.handleMessage(msg);
                String o = (String) msg.obj;
                int what = msg.what;
                etiqueta.append(what + " " + o);
            }
        }

        ;
        Runnable run = new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (true){

                    try {
                        Thread.sleep(1000);
                        Message mess = handler.obtainMessage(1000,"i = " + i);
                        handler.sendMessage(mess);
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