package sda.mg.zad9;

public class Point2D implements Movable {
    private double x;
    private double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public void move(MoveDirection moveDirection) {
//        return new Point2D(x + moveDirection.getX(), y + moveDirection.getY());
        x = x + moveDirection.getX();
        y = y + moveDirection.getY();
    }

    @Override
    public String toString() {
        return "{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
