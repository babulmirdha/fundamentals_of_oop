package four_pillars_of_oop.no_02_inharitance.no_06_improved_software_design.java;

class Payment {
    double amount;

    void makePayment() {
        System.out.println("Making a payment of $" + amount);
    }
}

class CreditCardPayment extends Payment {
    String cardNumber;

    @Override
    void makePayment() {
        System.out.println("Processing credit card payment of $" + amount + " using card: " + cardNumber);
    }
}

class PayPalPayment extends Payment {
    String email;

    @Override
    void makePayment() {
        System.out.println("Processing PayPal payment of $" + amount + " using email: " + email);
    }
}

public class Main {
    public static void main(String[] args) {
        CreditCardPayment ccPayment = new CreditCardPayment();
        ccPayment.amount = 100.00;
        ccPayment.cardNumber = "1234-5678-9876-5432";
        ccPayment.makePayment(); // Outputs specific CreditCardPayment behavior

        PayPalPayment ppPayment = new PayPalPayment();
        ppPayment.amount = 50.00;
        ppPayment.email = "user@example.com";
        ppPayment.makePayment(); // Outputs specific PayPalPayment behavior
    }
}
