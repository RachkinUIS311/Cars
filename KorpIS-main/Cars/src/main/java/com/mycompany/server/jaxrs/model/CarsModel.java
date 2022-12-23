package com.mycompany.server.jaxrs.model;
import java.util.Date;

public class CarsModel {
    
    private int id;
    private String brand;
    private String model;
    private String seller;
    private int price;

    public CarsModel() {}

    public CarsModel(int id, String brand, String model, String seller, int price) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.seller = seller;
        this.price = price;
    }

    public int getId (){
        return id;
    }
    public void setId (int id) {
        this.id = id;
    }

    public String getBrand (){
        return brand;
    }
    public void setBrand (String brand) {
        this.brand = brand;
    }

    public String getModel (){
        return model;
    }
    public void setModel (String model) {
        this.model = model;
    }

    public String getSeller (){
        return seller;
    }
    public void setSeller (String seller) {
        this.seller = seller;
    }

    public int getPrice (){
        return price;
    }
    public void setPrice (int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "VU36Model{" + "id=" + id + ", brand=" + brand + ", model=" + model + ", seller=" + seller + ", price=" + price + '}';
    }

}