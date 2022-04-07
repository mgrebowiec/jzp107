package sda.mg.zad3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintMap {
    public static void main(String[] args) {
        Map<String, Integer> input = new HashMap<>();
        input.put("pierwsza", 1);
        input.put("druga", 2);
        input.put("trzecia", 3);

        System.out.println("Iterator: ");
        printMapUsingIterator(input);

        System.out.println("ForEach:");
        printMapUsingForEach(input);

        System.out.println("Stream:");
        printMapUsingStream(input);
    }

    private static void printMapUsingIterator(Map<String, Integer> input) {
        Iterator<Map.Entry<String, Integer>> iterator = input.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> element = iterator.next();
            String msg = "Klucz: " + element.getKey() + ", Wartosc: " + element.getValue();
            if (iterator.hasNext()) {
                msg += ",";
            } else {
                msg += ".";
            }
            System.out.println(msg);
        }

    }

    private static void printMapUsingForEach(Map<String, Integer> input) {
        Set<Map.Entry<String, Integer>> inputSet = input.entrySet();
        int rowCounter = 0;
        for (Map.Entry<String, Integer> entry : inputSet) {
            String msg = "Klucz: " + entry.getKey() + ", Wartosc: " + entry.getValue();
            if (rowCounter < input.size() - 1) {
                msg += ",";
            } else {
                msg += ".";
            }
            rowCounter++;
            System.out.println(msg);
        }
    }

    private static void printMapUsingStream(Map<String, Integer> input) {
        String msg = input.entrySet().stream()
                .map(mapEntry -> "Klucz: " + mapEntry.getKey() + ", Wartosc: " + mapEntry.getValue())
                .filter(txt -> txt.contains("a"))
//                .map(txt -> txt.indexOf("a"))
                .collect(Collectors.joining(",\n", "", "."));
        System.out.println(msg);


        // parametry wejsciowe do metody z interfejsu funkcyjnego -> ciało metody z interfejsu funkcyjnego
    }

    private static void printMapUsingStreamAndAnonymousClass(Map<String, Integer> input) {
        String msg = input.entrySet().stream()
                .map(new Function<Map.Entry<String, Integer>, String>() {

                    @Override
                    public String apply(Map.Entry<String, Integer> mapEntry) {
                        return "Klucz: " + mapEntry.getKey() + ", Wartosc: " + mapEntry.getValue();
                    }
                })
                .collect(Collectors.joining(",\n", "", "."));
        System.out.println(msg);
    }

    private static void printMapUsingStreamAndInnerStaticClass(Map<String, Integer> input) {
        String msg = input.entrySet().stream()
                .map(new MapEntryToString())
                .collect(Collectors.joining(",\n", "", "."));
        System.out.println(msg);
    }



    // .map(mapEntry -> "Klucz: " + mapEntry.getKey() + ", Wartosc: " + mapEntry.getValue())
    private static class MapEntryToString implements Function<Map.Entry<String, Integer>, String> {
        @Override
        public String apply(Map.Entry<String, Integer> mapEntry) {
            return "Klucz: " + mapEntry.getKey() + ", Wartosc: " + mapEntry.getValue();
        }
    }
}
