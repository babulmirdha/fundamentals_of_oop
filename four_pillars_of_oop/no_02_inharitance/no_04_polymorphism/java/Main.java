package four_pillars_of_oop.no_02_inharitance.no_04_polymorphism.java;

class Vehicle {
    void move() {
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle {
    @Override
    void move() {
        System.out.println("Car is moving");
    }
}

class Bike extends Vehicle {
    @Override
    void move() {
        System.out.println("Bike is moving");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car(); // Polymorphism
        Vehicle myBike = new Bike(); // Polymorphism

        myCar.move(); // Outputs: Car is moving
        myBike.move(); // Outputs: Bike is moving
    }
}

