package dev.andreina.project_santa_claus.singletons;

import dev.andreina.project_santa_claus.db.GoodToyDatabase;

public class GoodToyDatabaseSingleton {

    private static GoodToyDatabase INSTANCE;

    private GoodToyDatabaseSingleton() {}

    public static GoodToyDatabase getInstance() {
        if (INSTANCE == null) INSTANCE = new GoodToyDatabase();
        return INSTANCE;
    }

}

