package sda.mg.streamsample;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class StreamsSample {

    private static class MyBiFunction implements BiFunction<String, Integer, String> {
        @Override
        public String apply(String s, Integer integer) {
            return "#" + integer + ": " + s;
        }
    }

    private static class MyConsumer implements Consumer<String> {

        @Override
        public void accept(String s) {
            System.out.println("Skonsumowalismy wartosc: " + s);
        }
    }

    public static void main(String[] args) {

        // (s, i) -> "#" + integer + ": " + s
        MyBiFunction myBiFunction = new MyBiFunction();
        printValue(myBiFunction, "jakis text", 1);
        printValue(((s, i) -> "#" + i + ": " + s), "jakis text", 1);

        List<String> names = Arrays.asList("jan", "pawel");
        consume(new MyConsumer(), names);
        consume(s -> {System.out.println("Skonsumowalismy wartosc: " + s);}, names);

    }

    private static void consume(Consumer<String> consumer, List<String> names) {
        names.forEach(consumer);
    }

    private static void printValue(BiFunction<String, Integer, String> mapperFunction, String txt, int value) {
        System.out.println(mapperFunction.apply(txt, value));
    }

}
