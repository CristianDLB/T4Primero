package com.example.t4primero.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.t4primero.R;
import com.example.t4primero.entites.repositorio;
import com.squareup.picasso.Picasso;

import java.util.List;


public class detalleAdapter extends RecyclerView.Adapter<detalleAdapter.VievHolder> {

    private List<repositorio>datos;

    public detalleAdapter(List<repositorio> datos) {
        this.datos = datos;
    }

    @Override
    public VievHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_detallentre,parent,false);
        return new VievHolder(view);
    }
    @Override
    public void onBindViewHolder(VievHolder holder, int position) {
        ImageView tvImagen = holder.itemView.findViewById(R.id.imageVi);
        TextView tvNombre = holder.itemView.findViewById(R.id.nombre);
        TextView tvPueblo = holder.itemView.findViewById(R.id.pueblo);
        repositorio repo = datos.get(position);
        tvNombre.setText(repo.getNombre());
        tvPueblo.setText(repo.getPueblo());
        //Picasso.get().load("https://imgur.com/z0047Zm").into(tvImagen);


    }
    @Override
    public int getItemCount() {
        return datos.size();
    }

    class VievHolder extends RecyclerView.ViewHolder{
        public VievHolder(View itemView) {
            super(itemView);
        }
    }

}
