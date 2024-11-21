package dev.andreina.project_santa_claus.views;

public class SantaClausView extends View {

    public static void index() {
        System.out.println("-----------------------------------------");
        System.out.println("Gestor de juguetes (Tipo de sesión: Santa)");
        System.out.println("1. Ver lista de juguetes niños buenos");
        System.out.println("2. Ver lista de juguetes niños malos");
        System.out.println("3. Guargar lista de todos los juguetes (.csv)");
        System.out.println("4. Cerrar sesión");

        int option = scanner.nextInt();
        

        if (option== 4) closeSession(); //llamo el método closeSession()

        // opción 1 ver lista de juguetes niños buenos:
        if (option== 1) ; //

    }






    public static void closeSession() {
            
        HomeView.index();
    }


}

