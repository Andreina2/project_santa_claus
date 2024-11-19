package dev.andreina.project_santa_claus.views;

import java.util.Scanner;



//6 genero la clase ElfView, debido a que hay duplicado de codigo como el de homeview, se crea una clase abstracta View (herencia)
/* y luego coloco extends en public class ElfView extends View y en HomeView */
public class ElfView extends View {
    

    public static void index() {
        System.out.println("-----------------------------------------");
        System.out.println("Gestor de juguetes (Tip de sessión: Elfo)");
        System.out.println("1. Añadir juguete");
        System.out.println("2. Ver todos los juguetes");
        System.out.println("4. Cerrar sesión");
        System.out.println("Seleccione una opción:");

        int option = scanner.nextInt();

}

}
