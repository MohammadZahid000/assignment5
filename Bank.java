package module5;

public class Bank {
    static double interestRate = 0.05;

    public double getBalance() {
        return 0; // Default implementation, to be overridden in subclasses
    }

    public double applyInterest() {
        return getBalance() * interestRate; // Corrected to use interestRate directly
    }
}