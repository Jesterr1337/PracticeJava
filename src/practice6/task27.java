package practice6;

public class task27 {
    private String accountNumber;
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > balance || amount <= 0) {
            return false;
        }
        balance -= amount;
        return true;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        task27 acc = new task27();
        acc.deposit(1000);
        System.out.println(acc.withdraw(1500));
        System.out.println(acc.withdraw(500));
        System.out.println(acc.getBalance());
    }
}
