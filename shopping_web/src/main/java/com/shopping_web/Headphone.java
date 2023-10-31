package com.shopping_web;

public class Headphone {
    private String brand;
    private String model;
    private boolean wireless;
    private double price;
    private String color;
    public Headphone(String brand, String model, boolean wireless, double price, String color){
        this.brand = brand;
        this.model = model;
        this.wireless = wireless;
        this.price = price;
        this.color = color;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public boolean isWireless() {
        return wireless;
    }
    public double getPrice(){
        return price;
    }
    public String getColor(){
        return color;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setColor(String color){
        this.color = color;
    }
    public static void main(String[] args) {
        
    }
}
