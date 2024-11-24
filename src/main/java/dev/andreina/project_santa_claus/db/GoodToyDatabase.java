package dev.andreina.project_santa_claus.db;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import dev.andreina.project_santa_claus.models.GoodToy;

public class GoodToyDatabase implements InterfaceDataBase<GoodToy> {

        private List<GoodToy> goodToys;

        //METODO DE INICIO
        public GoodToyDatabase() {
            initDB(); // estoy inicializando, va a tener datos nada mas
        }
        
        public List<GoodToy> getToys() {
            return goodToys;
        }
    
        public void save(GoodToy toy) {
            goodToys.add(toy);
            System.out.println("Juguete bueno guardado");
        }
        private void initDB() {

        this.goodToys= new ArrayList<>(Arrays.asList(
            new GoodToy("B1", "Batman", true, "lego", 12, "construction")));
    }


    
}
