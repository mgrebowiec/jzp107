package sda.mg.zad20;

public abstract class ThreeDShape extends Shape implements Fillable {
    public abstract double calculateVolume();

    @Override
    public void fill(int amount) {
        double volume = calculateVolume();
        if (volume < amount) {
            System.out.println("Przelalo sie!!!");
        } else if (volume == amount) {
            System.out.println("Naczynie jest pelne!");
        } else {
            System.out.println("Zostalo jeszcze miejsce na dolewke.");
        }
    }
}
