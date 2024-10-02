package module5;

public class BankC extends BankB {
    private double additionalDeposit;

    public BankC(double deposit, double extraDeposit, double additionalDeposit) {
        super(deposit, extraDeposit);
        this.additionalDeposit = additionalDeposit; // Fixed to use 'this.additionalDeposit'
    }

    @Override
    public double getBalance() {
        return super.getBalance() + additionalDeposit; // Return combined balance
    }

    public double getAdditionalDeposit() {
        return additionalDeposit;
    }

    public void setAdditionalDeposit(double additionalDeposit) {
        this.additionalDeposit = additionalDeposit;
    }

    @Override
    public String toString() {
        return "BankC [additionalDeposit=" + additionalDeposit + ", toString()=" + super.toString() + "]";
    }
}