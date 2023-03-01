package com.garage.garage.model;

public class Car {

    String model, brand;

    int year, id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private Color color;

    public enum Color {
        RED, BLUE, GREEN
    };

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Car(int id, String model, String brand, int year, Color color) {
        this.id = id;
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.color = color;
    }

}
