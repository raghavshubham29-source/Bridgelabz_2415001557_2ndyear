interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

abstract class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) { if (amount <= balance) balance -= amount; }
    public double getBalance() { return balance; }

    public abstract double calculateInterest();
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(int acc, String name, double bal) { super(acc, name, bal); }

    public double calculateInterest() { return getBalance() * 0.04; }
    public void applyForLoan(double amount) { System.out.println("Savings loan applied: " + amount); }
    public boolean calculateLoanEligibility() { return getBalance() > 5000; }
}

class CurrentAccount extends BankAccount implements Loanable {
    public CurrentAccount(int acc, String name, double bal) { super(acc, name, bal); }

    public double calculateInterest() { return getBalance() * 0.02; }
    public void applyForLoan(double amount) { System.out.println("Current loan applied: " + amount); }
    public boolean calculateLoanEligibility() { return getBalance() > 10000; }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount[] accounts = {
            new SavingsAccount(101, "Alice", 10000),
            new CurrentAccount(102, "Bob", 20000)
        };

        for (BankAccount acc : accounts) {
            System.out.println(acc.getClass().getSimpleName() + " Interest: " + acc.calculateInterest());
        }
    }
}