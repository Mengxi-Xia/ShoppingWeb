package com.example;

public class Keyboard {
    private String brand;
    private String model;
    private boolean isMechanical;
    private boolean isWireless;
    private int keyCount;
    private double price;

    public Keyboard(String brand, String model, boolean isMechanical, boolean isWireless, int keyCount, double price) {
        this.brand = brand;
        this.model = model;
        this.isMechanical = isMechanical;
        this.isWireless = isWireless;
        this.keyCount = keyCount;
        this.price = price;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public boolean isMechanical() {
        return isMechanical;
    }
    public boolean isWireless() {
        return isWireless;
    }
    public int getKeyCount() {
        return keyCount;
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
    public void setWireless(boolean wireless) {
        this.isWireless = wireless;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setKeyCount(int count){
        keyCount = count;
    }
    public static void main(String[] args) {
        
    }
}
