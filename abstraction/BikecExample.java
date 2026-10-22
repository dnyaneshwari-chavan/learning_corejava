abstract class Vehicle {
    int numberOfTires;

    void displayTires() {
        System.out.println("Number of tires: " + numberOfTires);
    }

    abstract void start();
}

class Car extends Vehicle {
    Car() {
        numberOfTires = 4;
    }

    @Override
    void start() {
        System.out.println("Car starts with a key");
    }
}

class Bike extends Vehicle {
    Bike() {
        numberOfTires = 2;
    }

    @Override
    void start() {
        System.out.println("Bike starts with a kick");
    }
}

public class BikecExample {
    public static void main(String[] args) {
        Vehicle obj = new Bike();
        obj.displayTires();
        obj.start();

        obj = new Car();
        obj.displayTires();
        obj.start();
    }
}