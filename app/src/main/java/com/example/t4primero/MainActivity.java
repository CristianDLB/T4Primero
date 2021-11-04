package com.example.t4primero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button boton = findViewById(R.id.btnDetalle1);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Pasando a Entrenador
                Intent intent= new Intent(getApplicationContext(),Entrenador.class);
                startActivity(intent);
            }
        });


        Button boton2 = findViewById(R.id.crear);
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Pasando a Crear Pokemons
                Intent intent= new Intent(getApplicationContext(),CrearPoke.class);
                startActivity(intent);
            }
        });


        Button boton3 = findViewById(R.id.mostrarPoke);
        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Pasando A Mostrar Pokemons
                Intent intent= new Intent(getApplicationContext(),MostrarPokes.class);
                startActivity(intent);
            }
        });





    }
}