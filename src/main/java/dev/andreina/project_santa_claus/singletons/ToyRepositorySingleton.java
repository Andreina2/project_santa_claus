package dev.andreina.project_santa_claus.singletons;

import dev.andreina.project_santa_claus.repository.ToyRepository;

public class ToyRepositorySingleton {

    // Patrones Singleton
    /*1. Eager initialization : en el momento que arranque la aplicación se  va a crear el objeto, esto permite
    que solo exista un objeto, se usa cuando hay muchas solicitudes y en vez de crear muchos objetos,
    creamos uno de manera global. En la clase se usa static final cuando es Eager */

    private static final ToyRepository INTANCE= new ToyRepository();

    //constructor private para que la aplicación lo pueda crear
    private ToyRepositorySingleton() {

    }

    //metodo public static que devolvera un ToyRepository Y NOS PERMITE RECUPERaR INSTaNCE
    public static ToyRepository getInstance() {
        return INTANCE;

        // Con el eager se hace solo una vez el new Toyrepository y no cada vez, y lo llamo en ToyController

    }



}


