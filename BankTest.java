package module5;

public class BankTest {
    public static void main(String[] args) {
        BankA bankA = new BankA(1000);
        BankB bankB = new BankB(1500, 200);
        BankC bankC = new BankC(2000, 300, 100); // Adjusted constructor for BankC

        System.out.println("Bank A Balance: " + bankA.getBalance());
        System.out.println("Bank A Balance after Interest: " + bankA.applyInterest());

        System.out.println("Bank B Balance: " + bankB.getBalance());
        System.out.println("Bank B Balance after Interest: " + bankB.applyInterest());

        System.out.println("Bank C Balance: " + bankC.getBalance());
        System.out.println("Bank C Balance after Interest: " + bankC.applyInterest());
    }
}