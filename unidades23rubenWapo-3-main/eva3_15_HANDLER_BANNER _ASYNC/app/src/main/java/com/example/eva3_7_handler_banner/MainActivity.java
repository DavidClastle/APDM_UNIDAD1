package com.example.eva3_7_handler_banner;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.ImageView;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {


    ImageView view;
    SeekBar bar;
    int[] imgs;
    int speed;
    int c = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        speed = 250;
        bar = findViewById(R.id.seek);
        bar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){


            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                speed = 250 + progress*8;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        view= findViewById(R.id.banner);


        imgs = new int[]{
            R.drawable.f1,
            R.drawable.f2,
            R.drawable.f3
        };
        clase c = new clase();
        c.execute();
    }


    class clase extends AsyncTask<Integer,String,Void> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected void onPostExecute(Void s) {
            super.onPostExecute(s);
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);
            view.setImageResource(imgs[c]);
            if (c < 2)
                c++;
            else
                c = 0;
            //img.setImageBitmap(decscargar(values[0]));

        }

        @Override
        protected Void doInBackground(Integer... integers) {
            publishProgress("");
            while (true){
                try {
                    Thread.sleep(speed);
                    onProgressUpdate("");


                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}