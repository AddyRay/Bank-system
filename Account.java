public class Account {
// Instance variables
private double balance;

// Constructors
public Account(double initialBalance) {
    balance = initialBalance;
}

public Account(int account, double balance) {
    this.balance = balance;
}

public Account() {
    balance = 0.0;
}

// Instance methods

public void setBalance() {
    balance = Math.random() * 1000;
    balance = Math.round((balance * 100.0)+.5) / 100.0;
}

public void deposit(double amount) {
    balance = balance + amount;
}

public void withdraw(double amount) {
    balance = balance - amount;
}

public double getBalance() {
    balance = Math.round((balance * 100.0)+.5) / 100.0;
    return balance;
}
public void close() {
    balance = 0.0;
}

public void transferTo(Account bank, double x) {
    if (x <= balance) {
        withdraw(x);
        bank.deposit(x);
        System.out.println("\nTransfer succesful. Tansfered: $" + bank.getBalance());
    } else if (x > balance) {
        System.out.println("\nTransfer failed, not enough balance!");
    }
}
}