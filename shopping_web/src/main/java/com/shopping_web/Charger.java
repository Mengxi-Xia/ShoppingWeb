package com.shopping_web;

public class Charger {
    private String brand;
    private String type;
    private double price;
    public Charger(String brand, String type, double price){
        this.brand = brand;
        this.type = type;
        this.price = price;
    }
   public String getBrand(){
        return brand;
    }
    public String getType(){
        return type;
    }
    public double getPrice(){
        return price;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public static void main(String[] args) {
        
    }
}
