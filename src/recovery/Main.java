package recovery;

import recovery.methods.oop.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount n_1 = new BankAccount("Иван", 1001, 5000);
        BankAccount n_2 = new BankAccount("Анна", 1002, 3000);
        BankAccount n_3 = new BankAccount("Олег", 1003,0);

        n_1.deposit(1500);
        n_2.withdraw(1000);
        n_3.withdraw(500);

        n_1.represent();
        n_2.represent();
        n_3.represent();

        System.out.println(BankAccount.getTotalAccounts());
    }
}