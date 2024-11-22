package dev.andreina.project_santa_claus.models;

// 20 coloco extends Toy
public class GoodToy extends Toy {

    private String brand;
    private int age;
    private String category;


    //constructor
    public GoodToy (String title,String brand, int age, String category, boolean isGoodToy) {
        super(title, isGoodToy); // Preguntar palabra super
        this.brand= brand;
        this.age= age;
        this.category= category;
    }

    public GoodToy(String id, String title, boolean isGoodToy, String brand, int age, String category) {
        super(id, title, isGoodToy);
        this.brand = brand;
        this.age = age;
        this.category = category;
    }

    //getters y setters
    public String getBrand() {
        return brand;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public String getCategory() {
        return category;
    }


    public void setCategory(String category) {
        this.category = category;
    }

    
}
