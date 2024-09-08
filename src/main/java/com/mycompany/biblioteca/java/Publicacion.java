package com.mycompany.biblioteca.java;

public class Publicacion {
    public String titulo;
    public int anioPublicacion;

    public Publicacion(String titulo, int anioPublicacion) {
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
    }

    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Año de publicación: " + anioPublicacion);
    }
}
