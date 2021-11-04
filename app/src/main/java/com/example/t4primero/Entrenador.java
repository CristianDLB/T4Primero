package com.example.t4primero;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.t4primero.adaptadores.detalleAdapter;
import com.example.t4primero.entites.repositorio;
import com.example.t4primero.servicios.Services;

import java.util.Arrays;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Entrenador extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrenador);

        final RecyclerView rv = findViewById(R.id.reclydetalle);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        /*

        Retrofit retrofit = new  Retrofit.Builder()
                .baseUrl("https://upn.lumenes.tk/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Services servicios=retrofit.create(Services.class);
        servicios.mostrarAll().enqueue(new Callback<List<repositorio>>() {
            @Override
            public void onResponse(Call<List<repositorio>> call, Response<List<repositorio>> response) {
                Log.i("MAIN",String.valueOf(response.code()));
                if(response.code()==200){
                    detalleAdapter adapter = new detalleAdapter(response.body());
                    rv.setAdapter(adapter);
                }
            }

            @Override
            public void onFailure(Call<List<repositorio>> call, Throwable t) {
                Log.i("MAIN","No existe comunicacion");
            }
        });
        */



        List<repositorio> datos2 = Arrays.asList(new repositorio("David","Pueblo 1"));
        detalleAdapter adapter = new detalleAdapter(datos2);
        rv.setAdapter(adapter);

        Button boton2 = findViewById(R.id.crearEntrenador);
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Pasando a Crear Entrenador
                Intent intent= new Intent(getApplicationContext(),RegistroEn.class);
                startActivity(intent);
            }
        });


    }
}