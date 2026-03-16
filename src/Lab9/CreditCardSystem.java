package Lab9;

abstract class CreditCard {
    double balance;

    CreditCard(double balance) {
        this.balance = balance;
    }
    abstract double interest();
}
class BlueCashPreferred extends CreditCard {
    BlueCashPreferred(double balance) {
        super(balance);
    }
    // implementation of abstract method
    double interest() {
        return balance * 0.19;
    }
}
class PlatinumCard extends CreditCard {
    PlatinumCard(double balance) {
        super(balance);
    }
    // implementation of abstract method
    double interest() {
        return balance * 0.15;
    }
}
public class CreditCardSystem {
    public static void main(String[] args) {
        CreditCard blueCash = new BlueCashPreferred(1000);
        System.out.println("Blue Cash Preferred interest: " + blueCash.interest());

        CreditCard platinum = new PlatinumCard(1000);
        System.out.println("Platinum Card interest: " + platinum.interest());
    }
}
