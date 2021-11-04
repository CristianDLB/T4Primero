package com.example.t4primero.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.t4primero.R;
import com.example.t4primero.entites.reposPokes;
import com.example.t4primero.entites.repositorio;

import java.util.List;

public class AdapterPokes extends RecyclerView.Adapter<AdapterPokes.VievHolder2>{

    private List<reposPokes> data;

    public AdapterPokes(List<reposPokes> data) {
        this.data = data;
    }

    @Override
    public VievHolder2 onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_detallepokes,parent,false);
        return new AdapterPokes.VievHolder2(view);
    }

    @Override
    public void onBindViewHolder( VievHolder2 holder, int position) {
        ImageView ImagenPoke = holder.itemView.findViewById(R.id.imagPoke);
        TextView tvNombrePo = holder.itemView.findViewById(R.id.nomPokess);
        TextView tvTipoPo = holder.itemView.findViewById(R.id.tiposPokess);
        TextView tvLatitud = holder.itemView.findViewById(R.id.latP);
        TextView tvLongitud = holder.itemView.findViewById(R.id.LongIP);


        reposPokes re = data.get(position);

        tvNombrePo.setText(re.getNombrePoke());
        tvTipoPo.setText(re.getTipoPoke());
        //tvLatitud.setText(re.getLatitud());
        //tvLongitud.setText(re.getLongitud());
        //Picasso.get().load("https://imgur.com/z0047Zm").into(tvImagen);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class VievHolder2 extends RecyclerView.ViewHolder{
        public VievHolder2(View itemView) {
            super(itemView);
        }
    }
}
