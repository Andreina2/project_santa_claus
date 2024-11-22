package dev.andreina.project_santa_claus.db;

import java.util.List;

//Interface Generics, la <E> significa generico: permite pasar los atiributos necsearios
public interface InterfaceDataBase<E> {

    public void save (E entity);
    public List<E> getToys();

}
