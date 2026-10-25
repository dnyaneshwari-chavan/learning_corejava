abstract class Vehicle {
    int numberOfTires = 2;

    void displayTires() {
        System.out.println("Number of tires: " + numberOfTires);
    }

    abstract void start();
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike starts with a kick");
    }
}

public class Example {
    public static void main(String[] args) {
        Vehicle bike = new Bike();

        bike.displayTires();
        bike.start();
    }
}


