package dev.andreina.project_santa_claus.singletons;

import dev.andreina.project_santa_claus.db.BadToyDatabase;

public class BadToyDatabaseSingleton {

    /*
     * Lazy Initialization
     * El método de inicialización diferida (lazy) para implementar el patrón
     * singleton crea la instancia en el método de acceso global.
     * 
     * ¿Cuándo utilizar la inicialización lazy?
     * Recursos limitados: Si la creación de la instancia consume muchos recursos
     * (memoria, tiempo de procesamiento), la inicialización lazy puede ayudar a
     * evitar desperdiciarlos si la instancia nunca se utiliza.
     * Inicialización tardía: En algunos casos, la inicialización de la instancia
     * depende de otros factores que pueden no estar disponibles al cargar la clase.
     * Evitar inicializaciones innecesarias: Si la instancia solo se necesita en
     * ciertas condiciones o bajo demanda, la inicialización lazy puede mejorar el
     * rendimiento al evitar crearla innecesariamente.
     */

    private static BadToyDatabase INSTANCE;

    private BadToyDatabaseSingleton() {}

    public static BadToyDatabase getInstance() {
        if (INSTANCE == null) INSTANCE = new BadToyDatabase();
        return INSTANCE;
    }

}

