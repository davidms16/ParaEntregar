package com.example.contador_para_entregar.PracticasGuiadas;

public class Equipos {
    public final String nombre;
    public final int imagen;

    public Equipos(String nombre, int imagen) {
        this.nombre = nombre;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public int getImagen() {
        return imagen;
    }
}
