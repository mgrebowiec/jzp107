package sda.mg.zad5;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new SdaHashSet();
        set.add("jeden");
        set.add("dwa");
        set.add("trzy");

        set.remove("dwa");
        System.out.println("Rozmiar zbioru: " + set.size());

        SdaHashSet ourSet = (SdaHashSet)set;
        ourSet.printElements();
    }
}
