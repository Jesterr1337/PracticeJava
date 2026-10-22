package practice6;

public class task31 {
    private String ownerName;
    private double totalSpent;
    private int discountPercent = 1;

    public void addPurchase(double cost) {
        if (cost > 0) {
            totalSpent += cost;
            if (totalSpent >= 10000) {
                discountPercent = 10;
            } else if (totalSpent >= 5000) {
                discountPercent = 5;
            } else {
                discountPercent = 1;
            }
        }
    }

    public void printCardInfo() {
        System.out.println("Власник: " + ownerName + ", Всього витрачено: " + totalSpent + ", Знижка: " + discountPercent + "%");
    }

    public static void main(String[] args) {
        task31 card = new task31();
        card.ownerName = "Петро";
        card.addPurchase(3000);
        card.printCardInfo();
        card.addPurchase(4000);
        card.printCardInfo();
    }
}
