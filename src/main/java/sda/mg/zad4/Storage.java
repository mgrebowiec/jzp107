package sda.mg.zad4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Storage {
    private Map<String, List<String>> elements = new HashMap<>();

    public Storage() {

    }

    public void addToStorage(String key, String value) {
        if (elements.containsKey(key)) {
            //pobieramy element pod danym kluczem i dodajemy do niego wartosc przekazana w parametrze metody
            elements.get(key).add(value);
        } else {
            //tworzymy nowa liste
            //dodajemy do niej wartosc przekazana w parametrze metody
            //wrzucamy do mapy pod wskazany klucz utworzona liste
            List<String> values = new ArrayList<>();
            values.add(value);
            elements.put(key, values);
        }
    }

    public void printValues(String key) {
        System.out.println(elements.get(key));
    }

    public void findValues(String value) {
        String msg = elements.entrySet().stream()
                .filter(entry -> entry.getValue().contains(value))
                .map(entry -> entry.getKey())
                .collect(Collectors.joining(",", "Klucze zawierajace zadana wartosc: ", "."));
        System.out.println(msg);
    }
}
