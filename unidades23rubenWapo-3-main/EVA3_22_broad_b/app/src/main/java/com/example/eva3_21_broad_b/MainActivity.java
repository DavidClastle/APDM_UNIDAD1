package com.example.eva3_21_broad_b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        v = findViewById(R.id.eti);
        BroadcastReceiver b  = new Bro();
        IntentFilter filter = new IntentFilter("mime");
        registerReceiver(b,filter);
    }

    class Bro extends BroadcastReceiver{
        @Override
        public void onReceive(Context context, Intent intent) {
            v.append(intent.getStringExtra("mensa"));
        }
    }
}