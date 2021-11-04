package com.example.t4primero.servicios;

import com.example.t4primero.entites.reposPokes;
import com.example.t4primero.entites.repositorio;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Services {

    @GET("entrenador/N00026219")
    Call<List<repositorio>> mostrarAll();


    @POST("entrenador/N00026219")
    Call<repositorio> create(@Body repositorio respo);

//********************************************************************************
    @GET("pokemons/N00026219")
    Call<List<reposPokes>> mostrarPokes();

    @POST("pokemons/N00026219/crear")
    Call<reposPokes>CrearPokes(@Body reposPokes rePok);





}
