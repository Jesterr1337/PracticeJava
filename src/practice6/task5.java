package practice6;

public class task5 {
    String name;
    double price;
    int quantity;

    public static void main(String[] args) {
        task5 product = new task5();
        product.name = "Монітор";
        product.price = 6500.0;
        product.quantity = 8;

        double total = product.price * product.quantity;
        System.out.println("Загальна вартість: " + total + " грн");
    }
}
