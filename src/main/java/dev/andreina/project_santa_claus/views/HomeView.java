package dev.andreina.project_santa_claus.views;

import java.util.Scanner;

/*4 Las vistas las genera de manera estatica, se hacen de manera separada del sistema, para que el controllador no deende de estas vistas,
y no tener que instanciar en el controller un new*/

public class HomeView extends View {

    public static void index() {
        // menu de inicio
        System.out.println("Iniciar sesión de trabajo como:");
        System.out.println("1. Elfo");
        System.out.println("2. Santa Claus");
        System.out.println("3. Salir");
        System.out.println("Seleccione una opción:");

        int option= scanner.nextInt();

        //8

        if (option==1) ElfView.index();

        if (option==2) SantaClausView.index(); // generé la clase vista santa
        //10 llamo metodo quit
        if (option==3) quit();

        //else if ("Por favor ingrese un número correcto");

    }

    //9 metodo para salir de elfo
    public static void quit() {
            
        scanner.close();

}

}
