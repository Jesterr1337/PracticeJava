package practice6;

public class task35 {
    private double[] itemPrices = new double[10];
    private int count = 0;

    public void addItem(double price) {
        if (count < itemPrices.length) {
            itemPrices[count] = price;
            count++;
        }
    }

    public double getTotalCost() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += itemPrices[i];
        }
        return total;
    }

    public void applyDiscount(double percent) {
        for (int i = 0; i < count; i++) {
            itemPrices[i] -= itemPrices[i] * (percent / 100);
        }
    }

    public static void main(String[] args) {
        task35 cart = new task35();
        cart.addItem(150.0);
        cart.addItem(300.0);
        cart.addItem(50.0);

        System.out.println("Сума до знижки: " + cart.getTotalCost());
        cart.applyDiscount(15);
        System.out.println("Сума після знижки 15%: " + cart.getTotalCost());
    }
}
