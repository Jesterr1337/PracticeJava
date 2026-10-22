package practice7;

public class task34 {
    private String iban;
    private String owner;
    private double balance;

    public task34(String iban, String owner, double balance) {
        this.iban = iban;
        this.owner = owner;
        this.balance = balance;
    }

    public boolean transferTo(task34 recipient, double amount) {
        if (recipient == null || recipient == this) {
            return false;
        }
        if (amount <= 0 || this.balance < amount) {
            return false;
        }
        this.balance -= amount;
        recipient.balance += amount;
        return true;
    }

    public void printAccount() {
        System.out.println("IBAN: " + iban + ", власник: " + owner + ", баланс: " + balance + " грн");
    }

    public static void main(String[] args) {
        task34 ivan = new task34("UA111", "Іван", 10000);
        task34 maria = new task34("UA222", "Марія", 2000);

        boolean ok = ivan.transferTo(maria, 3500);
        System.out.println("Переказ 3500 грн успішний? " + ok);
        ivan.printAccount();
        maria.printAccount();

        System.out.println("Переказ самому собі: " + ivan.transferTo(ivan, 100));
        System.out.println("Переказ 100000 грн: " + ivan.transferTo(maria, 100000));
    }
}
