package com.example.t4primero;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.t4primero.entites.reposPokes;
import com.example.t4primero.servicios.Services;
import com.google.gson.Gson;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CrearPoke extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_poke);

        Button botonCrear = findViewById(R.id.regPokes);
        botonCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl("https://upn.lumenes.tk/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();

                Services servicio = retrofit.create(Services.class);
                reposPokes rePo = new reposPokes();

                EditText in = findViewById(R.id.namePoke);
                String val = String.valueOf(in.getText());
                rePo.setNombrePoke(val);

                EditText in2 = findViewById(R.id.tipoPoke);
                String val2 = String.valueOf(in2.getText());
                rePo.setTipoPoke(val2);

                EditText in3 = findViewById(R.id.imagenPoke);
                String val3 = String.valueOf(in3.getText());
                rePo.setTipoPoke(val3);

                EditText in4 = findViewById(R.id.latPoke);
                Number val4 = Integer.parseInt(String.valueOf(in4.getText()));
                rePo.setLatitud(val4);

                EditText in5 = findViewById(R.id.longPoke);
                Number val5 = Integer.parseInt(String.valueOf(in4.getText()));
                rePo.setLatitud(val5);

                servicio.CrearPokes(rePo).enqueue(new Callback<reposPokes>() {
                    @Override
                    public void onResponse(Call<reposPokes> call, Response<reposPokes> response) {
                        Log.i("MAIN",new Gson().toJson(response.body()));
                    }

                    @Override
                    public void onFailure(Call<reposPokes> call, Throwable t) {
                        Log.e("MAIN","No exite Comunicacion API");
                    }
                });

            }
        });




    }
}