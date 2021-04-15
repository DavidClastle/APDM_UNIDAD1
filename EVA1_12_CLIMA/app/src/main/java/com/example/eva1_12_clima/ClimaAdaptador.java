package com.example.eva1_12_clima;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ClimaAdaptador extends ArrayAdapter<Clima> {
    private final Context context;
    private Context contexto;
    private int layout;
    private Clima[] cCiudades;

    public ClimaAdaptador(@NonNull Context context, int resource, @NonNull Clima[] objects) {
        super(context, resource, objects);
        this.context= context;
        this.layout= resource;
        this.cCiudades= objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
       //FILA NO EXISTA
        if(convertView==null){//primera vez
            convertView=((Activity)context).getLayoutInflater().inflate(layout,parent,false);
        }

        else {//FILA EXISTA


        }
        ImageView imgVwClima;
        TextView txtVwCd, txtVwTemp, txtVwDesc;
        imgVwClima= convertView.findViewById(R.id.imgVwClima);
        txtVwCd=  convertView.findViewById(R.id.txtVwCd);
        txtVwTemp=  convertView.findViewById(R.id.txtVWTemp);
        txtVwDesc=  convertView.findViewById(R.id.txtVwDesc);
        imgVwClima.setImageResource(cCiudades[position].getImagen());
        txtVwCd.setText(cCiudades[position].getCiudad());
        txtVwTemp.setText(cCiudades[position].getTemp()+"C");
        txtVwDesc.setText(cCiudades[position].getDesc());



        return super.getView(position, convertView, parent);
    }
}
