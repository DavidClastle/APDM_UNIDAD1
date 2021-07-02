package com.example.eva1_2_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static final String TEL= "tel:555";
    Intent inTel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void OnClickDial (View v){
        inTel= new Intent(Intent.ACTION_DIAL, Uri.parse(TEL));
        startActivity(inTel);


    }
    public void OnClickCall (View v){
        inTel= new Intent(Intent.ACTION_CALL, Uri.parse(TEL));
        startActivity(inTel);

    }
    public void OnClickCont (View v){
        String sData = "content://contacts/people";
        inTel= new Intent(Intent.ACTION_VIEW, Uri.parse(sData));
        startActivity(inTel);

    }
    public void OnClickNavegar (View v){
        String sData = "http://www.wikipedia.org";
        Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse(sData));
        startActivity(intent)

    }
}