package sda.mg.zad15;

public class CarMainSample {
    public static void main(String[] args) {
        Car car = Car.OPEL;
        for(Car carToCompare : Car.values()) {
            System.out.printf("Czy %s jest szybszy niz %s: %b\n", car, carToCompare, car.isFasterThan(carToCompare));
        }

        car = Car.MERCEDES;
        for(Car carToCompare : Car.values()) {
            System.out.printf("Czy %s jest szybszy niz %s: %b\n", car, carToCompare, car.isFasterThan(carToCompare));
        }

        System.out.printf("Czy %s jest premium: %b\n", car, car.isPremium());
        System.out.printf("Czy %s jest premium: %b\n", Car.OPEL, Car.isPremium(Car.OPEL));

        Car sampleCar = Car.of("mercedes");
        System.out.println("Jaki to samochod: " + sampleCar);
        System.out.printf("Moc samochodu %s to %d, cena to %f", sampleCar, sampleCar.getPower(), sampleCar.getPrice());
    }
}
