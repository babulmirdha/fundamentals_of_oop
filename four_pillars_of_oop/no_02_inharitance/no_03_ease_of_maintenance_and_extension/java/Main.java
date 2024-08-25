package four_pillars_of_oop.no_02_inharitance.no_03_ease_of_maintenance_and_extension.java;

class Employee {
    String name;
    int id;
    double salary;

    void work() {
        System.out.println(name + " is working.");
    }

    // New method added
    void calculateSalary() {
        System.out.println(name + "'s salary is: " + salary);
    }
}

class Manager extends Employee {
    int teamSize;

    void manageTeam() {
        System.out.println(name + " is managing a team of " + teamSize + " people.");
    }
}

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
        manager.salary = 70000;
        manager.calculateSalary(); // New method is available in Manager

        Developer developer = new Developer();
        developer.name = "Bob";
        developer.salary = 50000;
        developer.calculateSalary(); // New method is available in Developer
    }
}

