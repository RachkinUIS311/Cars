package com.mycompany.server.jaxrs.model;
import java.util.ArrayList;

public class CarsList {
    private ArrayList<CarsModel> list = new ArrayList<CarsModel>();

    public CarsList() {}
    
    public CarsList(ArrayList<CarsModel> list) {
        this.list = list;
    }
    public ArrayList<CarsModel> getList() {
        return list;
    }
    public void setList(ArrayList<CarsModel> list) {
        this.list = list;
    }
    
    public void addEl(CarsModel note) {
        this.list.add(note);
    }
    
    public void removeEl(CarsModel note) {
        this.list.remove(note);
    }

    @Override
    public String toString() {
        return "DBList{" + "list=" + list + '}';
    }
}
