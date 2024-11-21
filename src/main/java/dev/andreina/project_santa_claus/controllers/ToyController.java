package dev.andreina.project_santa_claus.controllers;

import dev.andreina.project_santa_claus.dtos.GoodToyDto;
import dev.andreina.project_santa_claus.models.GoodToy;
import dev.andreina.project_santa_claus.models.Toy;
import dev.andreina.project_santa_claus.repository.ToyRepository;
import dev.andreina.project_santa_claus.singletons.ToyRepositorySingleton;
import dev.andreina.project_santa_claus.views.ElfView;

public class ToyController {

    //26
    private final ToyRepository toyrepository;

    //constructor
    public ToyController() {
        this.toyrepository = ToyRepositorySingleton.getInstance();
    }

    //16 de la vista ElfView se hase la llamada a ToyController para guardar un juguete bueno creando este metodo:

    public void postGoodToy(GoodToyDto goodToyDto) {
    //Hara algo con el repositorio
    //27 si todo va bien devolvera una respuesta
    GoodToy toy = new GoodToy(goodToyDto.title(), goodToyDto.brand(), goodToyDto.age(), goodToyDto.category(), true);
    toyrepository.saveGoodToy(toy);
    ElfView.addToyResponse();
    

}




}
