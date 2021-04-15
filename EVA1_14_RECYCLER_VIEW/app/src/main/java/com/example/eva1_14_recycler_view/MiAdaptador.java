package com.example.eva1_14_recycler_view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MiAdaptador extends RecyclerView.Adapter<MiAdaptador.ViewHolder> {
    private String [] aDatos;

    public MiAdaptador(String[] aDatos) {
        this.aDatos = aDatos;
    }
    //VIEW HOLDER REPRESENTA UN ITEM DE LA LISTA
    //EVENTOS Y METODOS DE CADA WIDGET

    public static class ViewHolder extends RecyclerView.ViewHolder{
        final TextView txtVwFila;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtVwFila= itemView.findViewById(R.id.txtVwFila);
        }
        public TextView getTxtVwFila(){
            return txtVwFila;

        }
    }
    //CREA LA PANTALLA Y LOS OBJETOS DE TIPO VIEWHOLDER
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.texto_fila,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.getTxtVwFila().setText(aDatos[position]);
    }



    @Override
    public int getItemCount() {
        return aDatos.length;
    }
}
