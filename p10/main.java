class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    public BankAccount(String accountHolder, String accountNumber, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0.0;
        }
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: $" + amount);
        } else {
            System.out.println("Deposit failed: Amount must be greater than zero.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal failed: Amount must be greater than zero.");
        } else if (amount > balance) {
            System.out.println("Withdrawal failed: Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Successfully withdrew: $" + amount);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Alice Smith", "ACC12345", 1000.0);

        System.out.println("Initial Account Holder: " + account.getAccountHolder());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: $" + account.getBalance());

        System.out.println("\n--- Testing Deposits ---");
        account.deposit(500.0);
        account.deposit(-100.0);

        System.out.println("\n--- Testing Withdrawals ---");
        account.withdraw(200.0);
        account.withdraw(0.0);
        account.withdraw(-50.0);
        account.withdraw(2000.0);

        System.out.println("\nFinal Balance: $" + account.getBalance());
    }
}
