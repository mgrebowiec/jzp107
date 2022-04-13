package sda.mg.zad20;

public class Hexagon extends Shape {
    private final int a;

    public Hexagon(int a) {
        this.a = a;
    }

    @Override
    public double calculatePerimeter() {
        return 6 * a;
    }

    @Override
    public double calculateArea() {
        return 3 * Math.pow(a, 2) * Math.sqrt(3) / (double) 2;
    }
}
