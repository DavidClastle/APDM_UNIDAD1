package com.example.eva3_21_broadcast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView v;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        v = findViewById(R.id.txtA);
        intent = new Intent(this, MyService.class);
        BroadcastReceiver broad = new Bro();
        IntentFilter filt = new IntentFilter("my");
        registerReceiver(broad,filt);
    }

    public void iniciarE(View v){
        startService(intent);
    }


    public void detenerE(View v){
        stopService(intent);

    }

    class Bro extends BroadcastReceiver{

        @Override
        public void onReceive(Context context, Intent intent) {
            v.append(intent.getStringExtra(
                    "Mensaje"));


        }
    }

}