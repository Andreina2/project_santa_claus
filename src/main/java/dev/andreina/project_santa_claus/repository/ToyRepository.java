package dev.andreina.project_santa_claus.repository;

import dev.andreina.project_santa_claus.models.BadToy;
import dev.andreina.project_santa_claus.models.GoodToy;
import dev.andreina.project_santa_claus.singletons.BadToyDatabaseSingleton;
import dev.andreina.project_santa_claus.singletons.GoodToyDatabaseSingleton;

import java.util.List;

import dev.andreina.project_santa_claus.db.InterfaceDataBase;


//25 creo repository, y luego la clase ToyRepository


@SuppressWarnings("rawtypes")
public class ToyRepository {

    private InterfaceDataBase db;

    public void setDB(String type) {
        // setter injection
        if (type == "good_toy")
            this.db = GoodToyDatabaseSingleton.getInstance();

        if (type == "bad_toy")
            this.db = BadToyDatabaseSingleton.getInstance();
    }

    @SuppressWarnings("unchecked")
    public void saveGoodToy(GoodToy toy) {
        db.save(toy);
    }

    @SuppressWarnings("unchecked")
    public void saveBadToy(BadToy toy) {
        db.save(toy);
    }

    @SuppressWarnings("unchecked")
    public List<GoodToy> getGoodToys() {
        return db.getToys();
    }

    @SuppressWarnings("unchecked")
    public List<BadToy> getBadToys() {
        return db.getToys();
    }


    

}