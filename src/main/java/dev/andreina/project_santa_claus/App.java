package dev.andreina.project_santa_claus;

import dev.andreina.project_santa_claus.controllers.HomeController;

/**
 * Hello world!
 */
public class App {
    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
   
    public static void main(String[] args) {
        //1: System.out.println("Hello World!");
        new HomeController(); // Instanciando el controller
    }
}
