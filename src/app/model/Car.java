package app.model;

import java.util.Date;

/**
 * Created by Chirila on 11/28/2015.
 */
public class Car {
    Integer id;
    String regNumber;
    String color;
    int power;
    Date manufactured;
    int idClient;
    String brand;
    String series;
    int price;//price per day
    boolean available = false;

    public Car(String brand, String series, Date manufactured,
               int power, String color, String regNumber, int price) {
        this.series = series;
        this.brand = brand;
        this.manufactured = manufactured;
        this.power = power;
        this.color = color;
        this.regNumber = regNumber;
        this.price = price;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSeries() {
        return series;
    }

    public String getBrand() {
        return brand;
    }

    public Integer getId() {
        return id;
    }

    public int getPower() {
        return power;
    }


    public String getColor() {
        return color;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public int getPrice() {
        return price;
    }
}
