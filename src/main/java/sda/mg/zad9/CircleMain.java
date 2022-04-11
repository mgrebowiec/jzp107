package sda.mg.zad9;

public class CircleMain {
    public static void main(String[] args) {
        Circle circle = new Circle(new Point2D(0, 0), new Point2D(1, 0));
        System.out.println("promien: " + circle.getRadius());
        System.out.println("obwod: " + circle.getPerimeter());
        System.out.println("pole: " + circle.getArea());
        System.out.println(circle);

        System.out.println("Przesuwamy okrag....");
        circle.move(new MoveDirection(1, 0));
        System.out.println("promien: " + circle.getRadius());
        System.out.println("obwod: " + circle.getPerimeter());
        System.out.println("pole: " + circle.getArea());
        System.out.println(circle);

        System.out.println("Zwiekszamy okrag....");
        circle.resize(2);
        System.out.println("promien: " + circle.getRadius());
        System.out.println("obwod: " + circle.getPerimeter());
        System.out.println("pole: " + circle.getArea());
        System.out.println(circle);

        System.out.println("Zmniejszamy okrag....");
        circle.resize(0.8);
        System.out.println("promien: " + circle.getRadius());
        System.out.println("obwod: " + circle.getPerimeter());
        System.out.println("pole: " + circle.getArea());
        System.out.println(circle);
    }
}
