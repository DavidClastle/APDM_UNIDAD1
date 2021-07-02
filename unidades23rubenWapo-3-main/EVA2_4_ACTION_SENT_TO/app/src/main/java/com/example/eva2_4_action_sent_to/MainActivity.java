package com.example.eva2_4_action_sent_to;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText tel,men;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tel = findViewById(R.id.edtNum);
        men = findViewById(R.id.edtMensaje);
        btn = findViewById(R.id.btnEnviar);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String te,msg;
                te = "smsTo: " + tel.getText();
                msg = men.getText().toString();
                Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse(te));
                intent.putExtra("sms_body",msg);
                startActivity(intent);

            }

        });
    }
}