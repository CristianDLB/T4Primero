package com.example.t4primero.entites;


public class reposPokes {

    private String nombrePoke;
    private String tipoPoke;
    private String imagenPoke;
    private Number latitud;
    private Number longitud;

    public reposPokes() {
    }

    public reposPokes(String nombrePoke, String tipoPoke, String imagenPoke, Number latitud, Number longitud) {
        this.nombrePoke = nombrePoke;
        this.tipoPoke = tipoPoke;
        this.imagenPoke = imagenPoke;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public reposPokes(String nombrePoke, String tipoPoke, Number latitud, Number longitud) {
        this.nombrePoke = nombrePoke;
        this.tipoPoke = tipoPoke;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public String getNombrePoke() {
        return nombrePoke;
    }

    public void setNombrePoke(String nombrePoke) {
        this.nombrePoke = nombrePoke;
    }

    public String getTipoPoke() {
        return tipoPoke;
    }

    public void setTipoPoke(String tipoPoke) {
        this.tipoPoke = tipoPoke;
    }

    public String getImagenPoke() {
        return imagenPoke;
    }

    public void setImagenPoke(String imagenPoke) {
        this.imagenPoke = imagenPoke;
    }

    public Number getLatitud() {
        return latitud;
    }

    public void setLatitud(Number latitud) {
        this.latitud = latitud;
    }

    public Number getLongitud() {
        return longitud;
    }

    public void setLongitud(Number longitud) {
        this.longitud = longitud;
    }
}
