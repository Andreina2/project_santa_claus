package dev.andreina.project_santa_claus.controllers;

import dev.andreina.project_santa_claus.views.HomeView;

public class HomeController {

    //3
    public HomeController() {
        index(); // llamando al index creo este constructor
    }

    //2 Metodo index
    public void index() {

       //System.out.println("Index method");
    //3 El controlador responde con una vista: en este caso con HomeView: creo la vista HomeView
    //5 El controlador responde con una vista:
    HomeView.index();
    }

}
