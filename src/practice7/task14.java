package practice7;

public class task14 {
    private String type;
    private String size;
    private int sugarCount;
    private boolean withSyrup;
    private double finalPrice;

    private double calculatePrice() {
        double price;
        if (type.equals("Еспресо")) {
            price = 40;
        } else if (type.equals("Капучино")) {
            price = 55;
        } else if (type.equals("Лате")) {
            price = 60;
        } else {
            price = 0;
        }

        if (size.equals("Medium")) {
            price = price * 1.3;
        } else if (size.equals("Large")) {
            price = price * 1.6;
        }

        if (withSyrup) {
            price += 15;
        }
        return price;
    }

    public task14(String type, String size, int sugarCount, boolean withSyrup) {
        this.type = type;
        this.size = size;
        this.sugarCount = sugarCount;
        this.withSyrup = withSyrup;
        this.finalPrice = calculatePrice();
    }

    public task14(String type, String size) {
        this(type, size, 0, false);
    }

    public task14(String type) {
        this(type, "Medium");
    }

    public void printReceipt() {
        System.out.println("------ ЧЕК ------");
        System.out.println("Напій: " + type);
        System.out.println("Розмір: " + size);
        System.out.println("Цукор: " + sugarCount + " ложки");
        System.out.println("Сироп: " + (withSyrup ? "так" : "ні"));
        System.out.printf("До сплати: %.2f грн%n", finalPrice);
        System.out.println("-----------------");
    }

    public static void main(String[] args) {
        task14 o1 = new task14("Лате", "Large", 2, true);
        task14 o2 = new task14("Капучино", "Small");
        task14 o3 = new task14("Еспресо");
        o1.printReceipt();
        o2.printReceipt();
        o3.printReceipt();
    }
}
