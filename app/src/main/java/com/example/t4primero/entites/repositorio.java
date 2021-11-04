package com.example.t4primero.entites;

public class repositorio {

    private String nombre;
    private String pueblo;
    private String imagen;

    public repositorio() {
    }

    public repositorio(String nombre, String pueblo) {
        this.nombre = nombre;
        this.pueblo = pueblo;
    }

    public repositorio(String nombre, String pueblo, String imagen) {
        this.nombre = nombre;
        this.pueblo = pueblo;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPueblo() {
        return pueblo;
    }

    public void setPueblo(String pueblo) {
        this.pueblo = pueblo;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
