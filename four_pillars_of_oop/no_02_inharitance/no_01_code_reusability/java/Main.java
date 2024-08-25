package four_pillars_of_oop.no_02_inharitance.no_01_code_reusability.java;

// Parent class
class Vehicle {
    int speed;

    void move() {
        System.out.println("Vehicle is moving at speed: " + speed);
    }
}

// Child class Car inherits from Vehicle
class Car extends Vehicle {
    String model;

    void displayModel() {
        System.out.println("Car model: " + model);
    }
}

// Child class Bike inherits from Vehicle
class Bike extends Vehicle {
    boolean hasGear;

    void displayType() {
        if (hasGear) {
            System.out.println("Bike with gear");
        } else {
            System.out.println("Bike without gear");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.speed = 120;
        car.model = "Sedan";
        car.move(); // Inherited method
        car.displayModel(); // Specific to Car

        Bike bike = new Bike();
        bike.speed = 80;
        bike.hasGear = true;
        bike.move(); // Inherited method
        bike.displayType(); // Specific to Bike
    }
}

