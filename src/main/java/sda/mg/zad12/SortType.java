package sda.mg.zad12;

import java.util.Comparator;
import java.util.function.Function;

public enum SortType {
    ASC,
    DESC;

    public Comparator<Car> getComparator(Function<Car, ? extends Comparable> keyExtractor) {
        Comparator<Car> defaultCarComparator = Comparator.comparing(keyExtractor);
        if (this == DESC) {
            defaultCarComparator = defaultCarComparator.reversed();
        }
        return defaultCarComparator;
    }
}
