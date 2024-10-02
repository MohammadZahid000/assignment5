package module5;


public class BankB extends BankA {
    private double extraDeposit;

    public BankB(double deposit, double extraDeposit) {
        super(deposit);
        this.extraDeposit = extraDeposit; // Fixed to use 'this.extraDeposit'
    }

    @Override
    public double getBalance() {
        return super.getBalance() + extraDeposit; // Return combined balance
    }

    public double getExtraDeposit() {
        return extraDeposit;
    }

    public void setExtraDeposit(double extraDeposit) {
        this.extraDeposit = extraDeposit;
    }

    @Override
    public String toString() {
        return "BankB [extraDeposit=" + extraDeposit + ", toString()=" + super.toString() + "]";
    }
}


