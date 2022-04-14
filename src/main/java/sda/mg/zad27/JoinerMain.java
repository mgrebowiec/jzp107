package sda.mg.zad27;

import sda.mg.zad9.Circle;
import sda.mg.zad9.Point2D;

public class JoinerMain {
    public static void main(String[] args) {
        Joiner<String> nameJoiner = new Joiner<>("-");
        String result = nameJoiner.join("michal", "jacek", "robert", "julia");
        System.out.println(result);

        System.out.println("------------------------------------------------------");
        Joiner<Circle> circleJoiner = new Joiner<>("---");
        result = circleJoiner.join(
                new Circle(new Point2D(0,0), new Point2D(0,2)),
                new Circle(new Point2D(1,1), new Point2D(2,5)),
                new Circle(new Point2D(0,0), new Point2D(10,0))
        );
        System.out.println(result);
    }


}
