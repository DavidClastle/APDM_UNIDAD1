package com.example.eva3_19_mediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    MediaPlayer media;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        media = MediaPlayer.create(this,R.raw.acdc_back_in_black);
    }

    @Override
    protected void onResume() {
        super.onResume();
        if(media != null)
            media.start();
    }
}