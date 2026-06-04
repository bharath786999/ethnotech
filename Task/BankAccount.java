class BankAccount {
    double balance = 10000;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        balance -= amount;
    }

    void display() {
        System.out.println("Balance: " + balance);
    }
}

public class BankBalance {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();

        b.deposit(2000);
        b.withdraw(1000);
        b.display();
    }
}