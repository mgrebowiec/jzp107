package sda.mg.zad29;


import sda.mg.zad15.Car;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class StatisticUtil {

    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        System.out.println("Ilosc elementow podzielnych przez 3: " + partOf(intValue -> intValue % 3 == 0, array));
        System.out.println("Ilosc elementow wiekszych niz 4: " + partOf(intValue -> intValue > 4, array));

        Car[] cars = Car.values();
        System.out.println("Ilosc samochodow premium: " + partOf(car -> car.isPremium(), cars));
        System.out.println("Ilosc samochodow drozszych niz 50: " + partOf(car -> car.getPrice() > 50, cars));
    }

    public static <T> double partOf(Predicate<T> condition, T... elements) {
        long count = Stream.of(elements)
                .filter(condition)
                .count();

        return count / (double)elements.length * 100;
    }

}
