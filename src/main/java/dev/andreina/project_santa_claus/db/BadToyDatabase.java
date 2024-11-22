package dev.andreina.project_santa_claus.db;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import dev.andreina.project_santa_claus.models.BadToy;


public class BadToyDatabase implements InterfaceDataBase<BadToy>{

    private List<BadToy> badToys;

        //METODO DE INICIO
        public BadToyDatabase() {
            initDB(); // estoy inicializando, va a tener datos nada mas
        }
        
        public List<BadToy> getToys() {
            return badToys;
        }
    
        public void save(BadToy toy) {
            badToys.add(toy);
            System.out.println("Juguete malo guardado");
        }
        private void initDB() {

        this.badToys= new ArrayList<>(Arrays.asList(
            new BadToy("M1", "Mystery Box 5x5", true, "Carbón")));
    }

    
}

