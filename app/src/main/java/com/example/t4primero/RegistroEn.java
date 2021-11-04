package com.example.t4primero;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.t4primero.entites.repositorio;
import com.example.t4primero.servicios.Services;
import com.google.gson.Gson;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RegistroEn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_en);

        Button boton3 = findViewById(R.id.registrar);
        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl("https://upn.lumenes.tk/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();

                Services servicio = retrofit.create(Services.class);
                repositorio re = new repositorio();

                EditText input = findViewById(R.id.nombreEn);
                String valor = String.valueOf(input.getText());
                re.setNombre(valor);

                EditText input2 = findViewById(R.id.puebloEn);
                String valor2 = String.valueOf(input2.getText());
                re.setPueblo(valor2);

                EditText input3 = findViewById(R.id.imagenEn);
                String valor3 = String.valueOf(input3.getText());
                re.setImagen(valor3);

                 /*
                re.setNombre("David L");
                re.setPueblo("Pueblo 1");
                re.setImagen("https://imgur.com/z0047Zm");
                */

                servicio.create(re).enqueue(new Callback<repositorio>() {
                    @Override
                    public void onResponse(Call<repositorio> call, Response<repositorio> response) {
                        Log.i("MAIN",new Gson().toJson(response.body()));
                    }

                    @Override
                    public void onFailure(Call<repositorio> call, Throwable t) {
                        Log.e("MAIN","No exite Comunicacion API");
                    }
                });

            }
        });


    }
}