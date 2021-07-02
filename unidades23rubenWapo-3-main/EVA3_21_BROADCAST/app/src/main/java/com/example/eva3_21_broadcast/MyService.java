package com.example.eva3_21_broadcast;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
    Thread hilo;

    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onStart(Intent intent, int startId) {
        super.onStart(intent, startId);
        hilo = new Thread(){
            @Override
            public void run() {
                super.run();
                while (true) {
                    try {
                        Thread.sleep(1000);
                        Intent intent;
                        intent = new Intent("my");
                        intent.putExtra("Mensaje","holo");
                        sendBroadcast(intent);


                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        break;
                    }
                }
            }
        };
        hilo.start();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Intent intent;
        intent = new Intent("my");
        intent.putExtra("Mensaje","onCreate");
        sendBroadcast(intent);

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        hilo.interrupt();
        Intent intent;
        intent = new Intent("my");
        intent.putExtra("Mensaje","Destroy");
        sendBroadcast(intent);


    }
}