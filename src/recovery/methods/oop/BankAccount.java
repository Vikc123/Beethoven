package recovery.methods.oop;

public class BankAccount {
    private String owner;
    private double balance;
    private int accountNumber;
    private static int totalAccounts;

    public BankAccount(String owner, int accountNumber) {
        this.owner = owner;
        this.accountNumber = accountNumber;
        this.balance = 0;
        totalAccounts++;
    }

    public BankAccount(String owner, int accountNumber, double balance) {
        this.owner = owner;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    public void setNameOwner(String name) {
        this.owner = name;
    }

    public String getName() {
        return this.owner;
    }

    public double getBalance() {
        return this.balance;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public void deposit(double amount) {
        if (this.balance > 0) {
            this.balance += amount;
        } else {
            System.out.println("На счете отрицательный баланс");
        }
    }

    public void withdraw(double amount) {
        if ((this.balance > 0) && (this.balance - amount > 0)) {
            this.balance -= amount;
        } else {
            System.out.println("Недостаточно средств");
        }
    }

    public void represent() {
        System.out.println(this.owner);
        System.out.println(this.balance);
        System.out.println(this.accountNumber);
        System.out.println("______________________");
    }
}
