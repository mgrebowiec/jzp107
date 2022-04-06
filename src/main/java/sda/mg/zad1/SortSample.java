package sda.mg.zad1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortSample {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("Aba", "aca", "Zba", "zab", "dfa");
        System.out.println("Lista przed sortowaniem:\n" + input);
        System.out.println(sortUsingEmbeededComparator(input));

        System.out.println("--------");
        input = Arrays.asList("Aba", "aca", "Zba", "zab", "dfa");
        System.out.println(sortUsingMyOwnComparator(input));

    }

    private static List<String> sortUsingEmbeededComparator(List<String> input) {
        input.sort(String.CASE_INSENSITIVE_ORDER.reversed());
        return input;
    }

    private static List<String> sortUsingMyOwnComparator(List<String> input) {
        input.sort(new MyOwnComparator());
        return input;
    }

    private static class MyOwnComparator implements Comparator<String> {

        @Override
        public int compare(String s1, String s2) {
            return -s1.toLowerCase().compareTo(s2.toLowerCase());
        }
    }
}
