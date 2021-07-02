package com.example.myapplicatione;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = findViewById(R.id.txt);

        clase sincre = new clase();
        sincre.execute(10);
    }

    class clase extends AsyncTask<Integer,String,Void>{

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            txt.append("iniciando la tarea");
        }

        @Override
        protected void onPostExecute(Void s) {
            super.onPostExecute(s);
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);
            txt.append(values[0]);
        }

        @Override
        protected Void doInBackground(Integer... integers) {
            int limite = integers[0],
            time = integers[1];
            for (int i = 0 ; i < limite;i++){
                try {
                    Thread.sleep(1000);
                    publishProgress("i  = " + i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            return null;
        }
    }

}