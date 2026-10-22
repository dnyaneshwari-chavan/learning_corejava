
class Car {
    int numberOfTires = 4;

    void displayTires() {
        System.out.println("Number of tires: " + numberOfTires);
    }

    void start() {
        System.out.println("Car started");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Car car = new Car(); // Create object

        car.displayTires();  // Call method
        car.start();         // Call method
    }
}
