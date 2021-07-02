package com.example.eva3_17_clima;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ClimaAdaptador extends ArrayAdapter<Clima> {
    private Context context;
    private int layout;

    private List<Clima> cCiudades;

    public ClimaAdaptador(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        this.context = context;
        this.layout = resource;
        this.cCiudades = objects;
    }

    //

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView==null) {
            convertView = ((Activity)context).getLayoutInflater().inflate(layout,parent,false);
        }

        ImageView imgVwClima;
        TextView txtVwCd,txtVwTemp,txtVwDesc;
        imgVwClima = convertView.findViewById(R.id.imgVwClima);
        txtVwCd = convertView.findViewById(R.id.txtVwCd);
        txtVwDesc = convertView.findViewById(R.id.txtVwDesc);
        txtVwTemp = convertView.findViewById(R.id.txtVwTemp);
        Clima climaCiudad = cCiudades.get(position);
        txtVwCd.setText(climaCiudad.getCiudad());
        imgVwClima.setImageResource(climaCiudad.getImagen());
        txtVwTemp.setText(climaCiudad.getTemp()+" ° C");
        txtVwDesc.setText(climaCiudad.getDesc());

        return convertView;
    }
}
