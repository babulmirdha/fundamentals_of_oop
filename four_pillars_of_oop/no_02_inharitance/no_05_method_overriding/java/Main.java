package four_pillars_of_oop.no_02_inharitance.no_05_method_overriding.java;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.sound(); // Outputs: Animal makes a sound

        Dog myDog = new Dog();
        myDog.sound(); // Outputs: Dog barks
    }
}
