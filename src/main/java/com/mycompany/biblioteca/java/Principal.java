package com.mycompany.biblioteca.java;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear una Publicación
        System.out.println("Ingrese los datos de la Publicación:");
        System.out.print("Título: ");
        String tituloPublicacion = scanner.nextLine();
        System.out.print("Año de publicación: ");
        int anioPublicacion = Integer.parseInt(scanner.nextLine());
        Publicacion publicacion = new Publicacion(tituloPublicacion, anioPublicacion);

        // Crear un Libro
        System.out.println("\nIngrese los datos del Libro:");
        System.out.print("Título: ");
        String tituloLibro = scanner.nextLine();
        System.out.print("Año de publicación: ");
        int anioLibro = Integer.parseInt(scanner.nextLine());
        System.out.print("Autor: ");
        String autorLibro = scanner.nextLine();
        System.out.print("Número de páginas: ");
        int paginasLibro = Integer.parseInt(scanner.nextLine());
        Libro libro = new Libro(tituloLibro, anioLibro, autorLibro, paginasLibro);

        // Crear una Revista
        System.out.println("\nIngrese los datos de la Revista:");
        System.out.print("Título: ");
        String tituloRevista = scanner.nextLine();
        System.out.print("Año de publicación: ");
        int anioRevista = Integer.parseInt(scanner.nextLine());
        System.out.print("Número de revista: ");
        int numeroRevista = Integer.parseInt(scanner.nextLine());
        System.out.print("Nombre de revista: ");
        String nombreRevista = scanner.nextLine();
        Revista revista = new Revista(tituloRevista, anioRevista, numeroRevista, nombreRevista);

        // Mostrar la información
        System.out.println("\nInformación de la Publicación:");
        publicacion.mostrarInfo();
        System.out.println("\nInformación del Libro:");
        libro.mostrarInfo();
        System.out.println("\nInformación de la Revista:");
        revista.mostrarInfo();

    }
    
}
