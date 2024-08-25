package four_pillars_of_oop.no_01_encapsulation.no_03_modularity.java;

public class Employee {
    private String name;  // Private attributes
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        setSalary(salary);
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary must be positive.");
        }
    }

    public double getSalary() {
        return salary;
    }

    public String getDetails() {
        return "Employee: " + name + ", Salary: $" + salary;
    }
}
