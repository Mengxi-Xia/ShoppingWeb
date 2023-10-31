package com.shopping_web;

public class Mousepad {
    private String brand;
    private String model;
    private String material;
    private double width;
    private double length;
    private double price;
    public Mousepad(String brand, String model, String material, double width, double length, double price) {
        this.brand = brand;
        this.model = model;
        this.material = material;
        this.width = width;
        this.length = length;
        this.price = price;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public String getMaterial(){
        return material;
    }
    public double getWidth(){
        return width;
    }
    public double getLength(){
        return length;
    }
    public double getPrice(){
        return price;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setMatherial(String material){
        this.material = material;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public void setLength(double length){
        this.length = length;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public static void main(String[] args) {
        
    }
}
