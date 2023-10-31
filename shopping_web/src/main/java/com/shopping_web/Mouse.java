package com.example;
    

public class Mouse {
    private String brand;
    private String model;
    private String color;
    private int dpi;
    private boolean wireless;
    private double price;
    public Mouse(String brand, String model, int dpi, boolean wireless, double price){
        this.brand = brand;
        this.model = model;
        this.dpi = dpi;
        this.wireless = wireless;
        this.price = price;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public String getColor(){
        return color;
    }
    public int getDpi() {
        return dpi;
    }
    public boolean isWireless() {
        return wireless;
    }
    public double getPrice() {
        return price;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setDpi(int dpi){
        this.dpi = dpi;
    }
    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public static void main(String[] args) {
        System.out.println("我是N");
    }
}
