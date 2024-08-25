package four_pillars_of_oop.no_01_encapsulation.no_05_flexibility.java;

public class Temperature {
    private double celsius;  // Private attribute

    public Temperature(double celsius) {
        this.celsius = celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getCelsius() {
        return celsius;
    }

    public double toFahrenheit() {
        return (celsius * 9/5) + 32;
    }
}
