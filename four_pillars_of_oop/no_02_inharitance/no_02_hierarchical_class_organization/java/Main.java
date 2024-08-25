package four_pillars_of_oop.no_02_inharitance.no_02_hierarchical_class_organization.java;

// Parent class
class Employee {
    String name;
    int id;

    void work() {
        System.out.println(name + " is working.");
    }
}

// Child class Manager inherits from Employee
class Manager extends Employee {
    int teamSize;

    void manageTeam() {
        System.out.println(name + " is managing a team of " + teamSize + " people.");
    }
}

// Child class Developer inherits from Employee
class Developer extends Employee {
    String programmingLanguage;

    void writeCode() {
        System.out.println(name + " is writing code in " + programmingLanguage + ".");
    }
}

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.name = "Alice";
        manager.teamSize = 5;
        manager.work(); // Inherited method
        manager.manageTeam(); // Specific to Manager

        Developer developer = new Developer();
        developer.name = "Bob";
        developer.programmingLanguage = "Java";
        developer.work(); // Inherited method
        developer.writeCode(); // Specific to Developer
    }
}
