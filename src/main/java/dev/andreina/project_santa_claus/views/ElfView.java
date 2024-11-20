package dev.andreina.project_santa_claus.views;

import java.util.Scanner;

import dev.andreina.project_santa_claus.controllers.ToyController;



//6 genero la clase ElfView, debido a que hay duplicado de codigo como el de homeview, se crea una clase abstracta View (herencia)
/* y luego coloco extends en public class ElfView extends View y en HomeView */
public class ElfView extends View {
    
    private static final ToyController toycontroller = new ToyController(); //17 llamo la dependencia controller para poder usarlo

    public static void index() {
        System.out.println("-----------------------------------------");
        System.out.println("Gestor de juguetes (Tip de sessión: Elfo)");
        System.out.println("1. Añadir juguete");
        System.out.println("2. Ver todos los juguetes");
        System.out.println("4. Cerrar sesión");
        System.out.println("Seleccione una opción:");

        int option = scanner.nextInt();

        if (option== 4) closeSession(); //9 llamo el método closeSession()

        //11 opción 1 añadir juguete:
        if (option== 1) selectChild();; // 12 llamo el método selectChild()

    }

        //8 creo un metodo para cerrar sesión de elfo y que vaya a la vista principal HomeView:
        
        //NOTA: Tomar en cuenta si el USUARIO COLOCA MAL EL NUMERO DE LAS OPCIONES

        
        public static void closeSession() {
            
            HomeView.index();
        }

        //12 metodo para añadir juguete, pero primero se debe selleccionar niño:
        public static void selectChild() {
            
            System.out.println("-------------------------");
            System.out.println("Para niño ...:");
            System.out.println("1. Bueno");
            System.out.println("2. Malo");
            int option= scanner.nextInt();

            if (option== 1) postGoodToy(); // 14 llamo el método postGoodToy(), luego creo mi clase ToyController en el modelo controllers
        }

        //13 crear el metodo de añadir juguete
        public static void postGoodToy() {
            System.out.println("-------------------------");
            System.out.println("Ingrese el título:");
            String title= scanner.next();
            System.out.println("Ingrese la marca:");
            String brand= scanner.next();
            System.out.println("Ingrese la edad recomendada:");
            int age= scanner.nextInt();
            System.out.println("Ingrese la categoria:");
            String category= scanner.next();

            toycontroller.postGoodToy(); //18 llamo al controlador para que guarde el juguete





        }




    }
