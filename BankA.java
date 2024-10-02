package module5;

public class BankA extends Bank {
    private double deposit;

    public BankA(double deposit) {
        this.deposit = deposit;
    }

    @Override
    public double getBalance() {
        return deposit; // Return the deposit as the balance
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    @Override
    public String toString() {
        return "BankA [deposit=" + deposit + ", getBalance()=" + getBalance() + ", applyInterest()="
                + applyInterest() + "]";
    }
}