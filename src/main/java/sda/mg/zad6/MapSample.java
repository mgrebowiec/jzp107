package sda.mg.zad6;

import java.util.TreeMap;

public class MapSample {

    public static void main(String[] args) {
        TreeMap<String, String> input = new TreeMap<>();
        input.put("1", "jeden");
        input.put("2", "dwa");
        input.put("3", "trzy");

        printFirstAndLastElement(input);
    }

    private static void printFirstAndLastElement(TreeMap<String, String> input) {
        System.out.println(input.firstEntry());
        System.out.println(input.lastEntry());
    }
}
