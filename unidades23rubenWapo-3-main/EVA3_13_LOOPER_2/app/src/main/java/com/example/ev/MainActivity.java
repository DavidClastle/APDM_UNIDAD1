package com.example.ev;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txt;
    Handler handler = new Handler(Looper.myLooper()){
        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            txt.append((String)msg.obj+"");
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = findViewById(R.id.txt);
        hilo h = new hilo();
        h.ejecutartarea(new Runnable() {
            @Override
            public void run() {
                for (int i = 0;i < 10;i++) {
                    try {
                        Thread.sleep(1000);
                        Message mes = handler.obtainMessage(100,"scdgf");
                        handler.sendMessage(mes);
                        handler
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    Message mes = handler.obtainMessage(100,"fin");
                    handler.sendMessage(mes);
                }
            }
        }).ejecutartarea(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e){

                }
                Message mes = handler.obtainMessage(100,"fin");
                handler.sendMessage(mes);

            }
        });
    }


}

 class hilo extends HandlerThread{
    Handler handler;

    public hilo() {
        super("Background");
        handler = new Handler(getLooper());
    }

    public hilo ejecutartarea(Runnable tarea){
        handler.post(tarea);
        return this;

    }

}
