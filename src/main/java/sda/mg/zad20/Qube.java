package sda.mg.zad20;

public class Qube extends ThreeDShape {
    private final int a;

    public Qube(int a) {
        this.a = a;
    }

    @Override
    public double calculateVolume() {
        return Math.pow(a, 3);
    }

    @Override
    public double calculatePerimeter() {
        throw new UnsupportedOperationException("Szescian nie ma obwodu!");
    }

    @Override
    public double calculateArea() {
        return 6 * Math.pow(a, 2);
    }
}
