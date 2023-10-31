package com.shopping_web;

public class Webcam {
    private String brand;
    private String model;
    private double resolution;
    private double framerate;
    private String connectionType;
    private double price;
    public Webcam(String brand, String model, double resolution, double framerate, String connectionType, double price) {
        this.brand = brand;
        this.model = model;
        this.resolution = resolution;
        this.framerate = framerate;
        this.connectionType = connectionType;
        this.price = price;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public double getResolution() {
        return resolution;
    }
    public double getFramerate() {
        return framerate;
    }
    public String getConnectionType() {
        return connectionType;
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
    public void setResolution(double resolution){
        this.resolution = resolution;
    }
    public void setFramerate(double framerate){
        this.framerate = framerate;
    }
    public void setConnectionType(String conectionType){
        this.connectionType = conectionType;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public static void main(String[] args) {
        
    }
}
