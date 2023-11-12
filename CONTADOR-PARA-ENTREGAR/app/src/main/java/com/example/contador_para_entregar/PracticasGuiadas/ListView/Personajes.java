package com.example.contador_para_entregar.PracticasGuiadas.ListView;

public class Personajes {
        private final String nombre;
        private final String equipo;
        private final int imagen;

        public Personajes(String nombre, String equipo, int imagen){
            this.imagen = imagen;
            this.nombre = nombre;
            this.equipo =  equipo;
        }

        public String getNombre() {
            return nombre;
        }

        public String getEquipo() {
            return equipo;
        }

        public int getImagen() {
            return imagen;
        }
}