package com.mycompany.biblioteca.java;

public class Libro extends Publicacion {
    public String autor;
    public int numeroPaginas;

    public Libro(String titulo, int anioPublicacion, String autor, int numeroPaginas) {
        super(titulo, anioPublicacion);
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numeroPaginas);
    }
}
