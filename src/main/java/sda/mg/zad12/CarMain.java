package sda.mg.zad12;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car("VW", "Golf", 100, 1988, null, EngineType.V6);
        car.addManufacturer(new Manufacturer("Vw", "Niemcy", 1500))
                .addManufacturer(new Manufacturer("XYZ", "Niemcy", 1700));

        System.out.println(car);

    }
}
