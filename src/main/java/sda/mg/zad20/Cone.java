package sda.mg.zad20;

public class Cone extends ThreeDShape {
    private final int r;
    private final int l;
    private final int h;

    public Cone(int r, int l, int h) {
        this.r = r;
        this.l = l;
        this.h = h;
    }

    @Override
    public double calculateVolume() {
        return Math.PI * Math.pow(r, 2) * h / (double) 3;
    }

    @Override
    public double calculatePerimeter() {
        throw new UnsupportedOperationException("Stozek nie ma obwodu!");
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(r, 2) + Math.PI * r * l;
    }
}
