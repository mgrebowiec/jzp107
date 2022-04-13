package sda.mg.zad20;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ShapeMain {
    public static void main(String[] args) {
        Shape triangle = new Triangle(2, 3, 3, 2);
        Shape hexagon = new Hexagon(3);
        Shape rectangle = new Rectangle(2, 5);

        List<Shape> shapes = Arrays.asList(triangle, hexagon, rectangle);
        shapes.forEach(shape -> System.out.printf("Pole %f, obwod %f\n", shape.calculateArea(), shape.calculatePerimeter()));

        Shape qube = new Qube(3);
        Shape cone = new Cone(2, 5, 3);
        shapes = Arrays.asList(qube, cone);
        shapes.forEach(shape -> System.out.printf("Pole: %f\n", shape.calculateArea()));

        shapes = Arrays.asList(triangle, hexagon, rectangle, qube, cone);
        String msg = shapes.stream()
                .filter(shape -> shape instanceof ThreeDShape)
                .map(shape -> (ThreeDShape) shape)
                .map(threeDShape -> "Objetosc: " + threeDShape.calculateVolume())
                .collect(Collectors.joining(", ", " ", ".\n"));
        System.out.println(msg);

        System.out.println("--------------------------------------");
        List<ThreeDShape> threeDShapes = Arrays.asList((ThreeDShape) qube, (ThreeDShape)cone);
        threeDShapes.forEach(threeDShape -> threeDShape.fill(13));

    }
}
