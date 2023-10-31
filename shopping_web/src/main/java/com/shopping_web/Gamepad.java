package com.example;

public class Gamepad {
    private String brand;
    private String model;
    private int buttonCount;
    private boolean isWireless;
    private double price;
    public Gamepad(String brand, String model, int buttonCount, boolean isWireless, double price) {
        this.brand = brand;
        this.model = model;
        this.buttonCount = buttonCount;
        this.isWireless = isWireless;
        this.price = price;
    }
    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public int getButtonCount(){
        return buttonCount;
    }
    public boolean isWireless(){
        return isWireless;
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
    public void setButtonCount(int buttonCount){
        this.buttonCount = buttonCount;
    }
    public void setWireless(boolean wireless) {
        this.isWireless = wireless;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public static void main(String[] args) {
        
    }
}
