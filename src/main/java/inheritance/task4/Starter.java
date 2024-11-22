package inheritance.task4;

public class Starter {
    public static void main(String[] args) {
        Account savingAccount = new SavingsAccount(1000);
        System.out.println(savingAccount);
        savingAccount.withdraw(300);
        System.out.println(savingAccount);

        Account creditAccount = new CreditAccount(1000);
        System.out.println(creditAccount);
        creditAccount.withdraw(100);
        System.out.println(creditAccount);
    }
}
