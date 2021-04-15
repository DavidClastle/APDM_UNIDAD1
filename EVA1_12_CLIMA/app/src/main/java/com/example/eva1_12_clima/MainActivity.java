package com.example.eva1_12_clima;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    Clima[] aClimaCd= {
            new Clima(R.drawable.sunny,"Chihuahua",28,"Despejado con viento"),
            new Clima(R.drawable.atmospher,"Delicias",25,"Simon"),
            new Clima(R.drawable.cloudy,"Camargo",32,"Nublado bonito"),
            new Clima(R.drawable.tornado,"Saucillo",28,"Aguas que te vas"),
            new Clima(R.drawable.snow,"Meoqui",18,"Nevado en chihuahua?"),
            new Clima(R.drawable.thunderstorm,"Jimenez",20,"Que te caiga el rayo pa ser flash"),
            new Clima(R.drawable.rainy,"Juarez",26,"Como siempre"),
            new Clima(R.drawable.light_rain,"Casas Grandes",30,"DELI DELI"),
            new Clima(R.drawable.cloudy,"Madera",15,"Madera deberia llamarse Diamante"),
            new Clima(R.drawable.sunny,"Conchos",27,"Despejado con viento"),


    };
    ListView listVWClima;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onStart() {
        super.onStart();
        listVWClima = findViewById(R.id.lstVwClima);
        listVWClima.setAdapter(new ClimaAdaptador(this,R.layout.mi_lista_clima,aClimaCd));
    }
}