package dev.andreina.project_santa_claus.repository;

import dev.andreina.project_santa_claus.db.GoodToyDatabase;
import dev.andreina.project_santa_claus.models.BadToy;
import dev.andreina.project_santa_claus.models.GoodToy;
import dev.andreina.project_santa_claus.db.InterfaceDataBase;


//25 creo repository, y luego la clase ToyRepository


public class ToyRepository {

    @SuppressWarnings("rawtypes")
    public InterfaceDataBase db;

    public ToyRepository(){
    this.db=db;
    }

@SuppressWarnings("unchecked")
public void saveGoodToy(GoodToy toy) {
    db.save(toy);
}

@SuppressWarnings("unchecked")
public void saveBadToy(BadToy toy) {
    db.save(toy);
}

}