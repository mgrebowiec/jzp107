package sda.mg.zad15;

import java.util.EnumSet;
import java.util.List;
import java.util.stream.Stream;

public enum Car {
    FERRARI(100, 100),
    PORSCHE(120, 90),
    MERCEDES(90, 80),
    BMW(89, 90),
    OPEL(70, 70),
    FIAT(50,50),
    TOYOTA(60, 55);

    private final double price;
    private final int power;
//    private final boolean isPremium;
    private final static EnumSet<Car> premiumCars = EnumSet.of(FERRARI, PORSCHE, MERCEDES);

    Car(double price, int power) {
        this.price = price;
        this.power = power;
    }

    public double getPrice() {
        return price;
    }

    public int getPower() {
        return power;
    }

    public boolean isPremium() {
        return premiumCars.contains(this);
    }

    static public boolean isPremium(Car car) {
        return premiumCars.contains(car);
    }

    public boolean isRegular() {
        return !isPremium();
    }

    static public boolean isRegular(Car car) {
        return !isPremium(car);
    }

    public boolean isFasterThan(Car car) {
        return this.compareTo(car) < 0;
    }

    public static Car of(String name) {
        return Stream.of(values())
                .filter(car -> car.name().equalsIgnoreCase(name))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Nie istnieje samochod o podanej nazwie: " + name));
    }
}
