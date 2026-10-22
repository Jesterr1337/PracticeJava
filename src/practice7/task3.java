package practice7;

public class task3 {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public task3(String accountNumber, String ownerName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        if (initialBalance < 0) {
            this.balance = 0.0;
        } else {
            this.balance = initialBalance;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }

    public void printAccount() {
        System.out.println("Рахунок №" + accountNumber + ", власник: " + ownerName + ", баланс: " + balance + " грн");
    }

    public static void main(String[] args) {
        task3 acc = new task3("UA001", "Іван Петренко", 1000);
        acc.printAccount();
        acc.deposit(500);
        System.out.println("Після поповнення на 500:");
        acc.printAccount();
        boolean ok = acc.withdraw(5000);
        System.out.println("Зняття 5000 грн успішне? " + ok);
        ok = acc.withdraw(300);
        System.out.println("Зняття 300 грн успішне? " + ok);
        acc.printAccount();
    }
}
