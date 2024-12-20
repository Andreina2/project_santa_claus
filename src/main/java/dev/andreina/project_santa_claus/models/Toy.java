package dev.andreina.project_santa_claus.models;

//19 creo la clase Toy, tanto GoodToy como BadToy tiene atributo titulo

public class Toy {

    // atributos de la clase Toy
    protected String id;
    protected String title;
    protected boolean isGoodToy;

    //metodo
    public Toy(String title, boolean isGoodToy){

        this.title= title;
        this.isGoodToy= isGoodToy;

    }

    
    public Toy(String id, String title, boolean isGoodToy) {
        this.id = id;
        this.title = title;
        this.isGoodToy = isGoodToy;
    }

    public String getId() {
        return id;
    }

    public void setId(int id) {
        if (isGoodToy) {
            this.id = "B" + id;
        } else {
            this.id = "M" + id;
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    

}
