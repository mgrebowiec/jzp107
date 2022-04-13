package sda.mg.zad16;

public class MainRunner {
    public static void main(String[] args) {
        int time = 20;
        System.out.println("Runner dla czasu [" + time + "] : " + Runner.getFitnessLevel(time));

        time = 2;
        System.out.println("Runner dla czasu [" + time + "] : " + Runner.getFitnessLevel(time));

        time = 60;
        System.out.println("Runner dla czasu [" + time + "] : " + Runner.getFitnessLevel(time));

        time = 1;
        try {
            System.out.println("Runner dla czasu [" + time + "] : " + Runner.getFitnessLevel(time));
        } catch (IllegalArgumentException e) {
            System.out.println("++++" + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("-----" + e.getMessage());
        }

        time = 0;
        System.out.println("Runner dla czasu [" + time + "] : " + Runner.getFitnessLevel(time));



    }

}
