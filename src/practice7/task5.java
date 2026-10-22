package practice7;

public class task5 {
    private String name;
    private double price;
    private int quantity;
    private String category;

    public task5(String name, double price, int quantity, String category) {
        this.name = name;
        this.price = price < 0 ? 0.0 : price;
        this.quantity = quantity < 0 ? 0 : quantity;
        this.category = category;
    }

    public double getTotalValue() {
        return price * quantity;
    }

    public void applyDiscount(double percent) {
        if (percent >= 0 && percent <= 100) {
            price = price - price * percent / 100;
        } else {
            System.out.println("Некоректний відсоток знижки!");
        }
    }

    public void printProduct() {
        System.out.println("--- Картка товару ---");
        System.out.println("Назва: " + name);
        System.out.println("Категорія: " + category);
        System.out.println("Ціна: " + price + " грн");
        System.out.println("Кількість: " + quantity);
        System.out.println("Вартість партії: " + getTotalValue() + " грн");
    }

    public static void main(String[] args) {
        task5 p = new task5("Ноутбук", 20000, 5, "Електроніка");
        p.printProduct();
        p.applyDiscount(20);
        System.out.println("Після знижки 20%:");
        p.printProduct();
    }
}
