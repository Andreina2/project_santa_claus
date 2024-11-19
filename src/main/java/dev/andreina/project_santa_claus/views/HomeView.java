package dev.andreina.project_santa_claus.views;


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
    }

}
