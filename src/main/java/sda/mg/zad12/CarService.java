package sda.mg.zad12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CarService {
    private List<Car> cars;

    public CarService addCar(Car car) {
        if (cars == null) {
            cars = new ArrayList<>();
        }

        cars.add(car);
        return this;
    }

    public CarService removeCar(Car car) {
        if (cars == null || car == null) {
            return this;
        }

        cars.remove(car);
        return this;
    }

    public List<Car> getAllCars() {
        return Collections.unmodifiableList(cars);
    }

    //zwracanie aut z silnikiem V12,
    public List<Car> getCarsWithEngine(EngineType engineType) {
        return cars.stream()
                .filter(car -> car.getEngineType() == engineType)
                .collect(Collectors.toList());
    }

    //zwracanie aut wyprodukowanych przed rokiem 1999
    public List<Car> getCarsBeforeYear(int year) {
        return cars.stream()
                .filter(car -> car.getYear() < year)
                .collect(Collectors.toList());
    }

    //zwracanie najdroższego auta
    public Car getMostExpensiveCar() {
        return cars.stream()
                .max(Comparator.comparing(Car::getPrice))
                .orElseThrow(() -> new IllegalStateException("Nie mozna znalezc najdrozszego samochodu"));
    }

    public Car getCheapestCar() {
        return cars.stream()
                .min(Comparator.comparing(Car::getPrice))
                .orElseThrow(() -> new IllegalStateException("Nie mozna znalezc najtanszego samochodu"));
    }

    //zwracanie auta z co najmniej 3 producentami
    public List<Car> getCarsWithProducersCount(int producersCount) {
        return cars.stream()
                .filter(car -> car.getManufacturers().size() >= producersCount)
                .collect(Collectors.toList());
    }

    //zwracanie listy wszystkich aut posortowanych zgodnie z przekazanym parametrem: rosnąco/malejąco
    public List<Car> sortCars(SortType sortType, Function<Car, ? extends Comparable> keyExtractor) {
        return cars.stream()
                .sorted(sortType.getComparator(keyExtractor))
                .collect(Collectors.toList());
    }

    //sprawdzanie czy konkretne auto znajduje się na liście
    public boolean isCarExist(Car car) {
        return cars.contains(car);
    }

    //zwracanie listy aut wyprodukowanych przez konkretnego producenta
    public List<Car> getCarsProducedBy(Manufacturer manufacturer) {
        return cars.stream()
                .filter(car -> car.getManufacturers().contains(manufacturer))
                .collect(Collectors.toList());
    }

    //zwracanie listy aut wyprodukowanych przez producenta z rokiem założenia <,>,<=,>=,=,!= od podanego.
    public List<Car> getCarsProducedByManufacturerWithYear(ComparisonFunction comparisonFunction, int year) {
        return cars.stream()
                .filter(car -> car.getManufacturers().stream().anyMatch(comparisonFunction.getManufacturerPredicate(year)))
                .collect(Collectors.toList());
    }

}
