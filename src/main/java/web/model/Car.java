package web.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Car {
    private String model;
    private String color;
    private int year;
    public static List<Car> cars = new ArrayList<>();
    static {
        cars.add(new Car("LADA", "WHITE", 2010));
        cars.add(new Car("BMW", "BLACK", 2020));
        cars.add(new Car("HONDA", "RED", 2021));
        cars.add(new Car("HAMMER", "BLACK", 2020));
        cars.add(new Car("KIA", "WHITE", 2022));
    }
    public Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
