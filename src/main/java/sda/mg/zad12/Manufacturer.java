package sda.mg.zad12;

import java.util.Objects;

public class Manufacturer {
    private String name;
    private String country;
    private int year;

    public Manufacturer(String name, String country, int year) {
        this.name = name;
        this.country = country;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Manufacturer)) return false;
        Manufacturer that = (Manufacturer) o;
        return year == that.year &&
                Objects.equals(name, that.name) &&
                Objects.equals(country, that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, country, year);
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", year=" + year +
                '}';
    }
}
