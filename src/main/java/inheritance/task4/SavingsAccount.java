package inheritance.task4;

public class SavingsAccount extends Account {

    private double balance;

    public SavingsAccount(double balance) {
        this.balance = balance;
    }

    @Override
    double deposit() {
        return balance;
    }

    @Override
    double withdraw(double diff) {
        balance = balance - diff;
        if (balance >= 0) {
            return balance;
        } else return 0.0;
    }

    @Override
    double calculateInterest() {
        return 10;
    }

    @Override
    public String toString() {
        return "SavingsAccount balance: " + deposit() + "; rate: " + calculateInterest();
    }
}
