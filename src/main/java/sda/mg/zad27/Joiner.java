package sda.mg.zad27;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Joiner<T> {
    private final String delimeter;

    public Joiner(String delimeter) {
        this.delimeter = delimeter;
    }

    public String join(T ... elements) {
        return Stream.of(elements)
                .map(t -> t.toString())
                .collect(Collectors.joining(delimeter));
    }
}
