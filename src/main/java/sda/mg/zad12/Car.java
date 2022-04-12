package sda.mg.zad12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Car {
    private String name;
    private String model;
    private double price;
    private int year;
    private List<Manufacturer> manufacturers;
    private EngineType engineType;

    public Car(String name, String model, double price, int year, List<Manufacturer> manufacturers, EngineType engineType) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.year = year;
        this.manufacturers = manufacturers;
        this.engineType = engineType;
    }

    public Car addManufacturer(Manufacturer manufacturer) {
        if (manufacturers == null) {
            manufacturers = new ArrayList<>();
        }

        manufacturers.add(manufacturer);
        return this;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public List<Manufacturer> getManufacturers() {
        return Collections.unmodifiableList(manufacturers);
    }

    public String getModel() {
        return model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0 &&
                year == car.year &&
                Objects.equals(name, car.name) &&
                Objects.equals(model, car.model) &&
                Objects.equals(manufacturers, car.manufacturers) &&
                engineType == car.engineType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price, year, manufacturers, engineType);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", manufacturers=" + manufacturers +
                ", engineType=" + engineType +
                '}';
    }
}
