package inheritance.task4;

public class CreditAccount extends Account {

    private double balance;

    public CreditAccount(double balance) {
        this.balance = balance;
    }

    @Override
    double deposit() {
        return balance;
    }

    //здесь наоборот при вычитании прибавляю к балансу т.к. предполагается, что значение баланса - это сумма долга
    @Override
    double withdraw(double diff) {
        return balance = balance + diff;
    }

    @Override
    double calculateInterest() {
        return 11;
    }

    @Override
    public String toString() {
        return "CreditAccount balance: " + deposit() + "; rate: " + calculateInterest();
    }
}
