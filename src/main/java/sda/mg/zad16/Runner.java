package sda.mg.zad16;

import java.util.stream.Stream;

public enum Runner {
    BEGINNER(20, 60),
    INTERMEDIATE(10, 20),
    ADVANCED(1, 10);

    private final int minTime;
    private final int maxTime;

    Runner(int minTime, int maxTime) {
        this.minTime = minTime;
        this.maxTime = maxTime;
    }

    public static Runner getFitnessLevel(int time) {
        return Stream.of(values())
                .filter(runner -> runner.minTime < time && time <= runner.maxTime)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Podany czas jest spoza mozliwych przedzialow: " + time));
    }
}
