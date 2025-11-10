class Account {
    public final void displayBankName() { // cannot be overridden
        System.out.println("Bank: ABC Bank");
    }

    public void showBalance() { System.out.println("Balance: $1000"); }
}

class SavingsAccount extends Account {
}

public class FinalMethodExample {
    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount();
        acc.displayBankName();
    }
}
