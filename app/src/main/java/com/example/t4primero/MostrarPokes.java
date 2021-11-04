package com.example.t4primero;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.t4primero.adaptadores.AdapterPokes;
import com.example.t4primero.adaptadores.detalleAdapter;
import com.example.t4primero.entites.reposPokes;
import com.example.t4primero.entites.repositorio;

import java.util.Arrays;
import java.util.List;

public class MostrarPokes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_pokes);

        final RecyclerView rv = findViewById(R.id.reclyPokes);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(getApplicationContext()));





        List<reposPokes> dato25 = Arrays.asList(new reposPokes("Pikachu","Rlemapago",258698,365875),
                                                new reposPokes("Chamser","Fuego",698236,265874));
        AdapterPokes adapter23 = new AdapterPokes(dato25);
        rv.setAdapter(adapter23);


    }
}