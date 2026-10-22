package practice7;

public class task38 {
    private Customer customer;
    private Product[] items;
    private int itemCount;

    public task38(Customer customer, int maxItems) {
        this.customer = customer;
        this.items = new Product[maxItems];
        this.itemCount = 0;
    }

    public void addProduct(Product p) {
        if (itemCount < items.length) {
            items[itemCount] = p;
            itemCount++;
        } else {
            System.out.println("Замовлення заповнене, не можна додати " + p.getTitle());
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (int i = 0; i < itemCount; i++) {
            total += items[i].getPrice();
        }
        return total;
    }

    public boolean checkout() {
        double total = calculateTotal();
        if (this.customer.pay(total)) {
            System.out.println("====== ЧЕК ======");
            System.out.println("Клієнт: " + customer.getName());
            for (int i = 0; i < itemCount; i++) {
                System.out.println(items[i].getTitle() + " - " + items[i].getPrice() + " грн");
            }
            System.out.println("Разом: " + total + " грн");
            System.out.println("Залишок на гаманці: " + customer.getWalletBalance() + " грн");
            System.out.println("=================");
            return true;
        } else {
            System.out.println("Недостатньо коштів у клієнта " + customer.getName() + "! Потрібно " + total
                    + " грн, є " + customer.getWalletBalance() + " грн");
            return false;
        }
    }

    public static void main(String[] args) {
        Product laptop = new Product(1, "Ноутбук", 25000);
        Product mouse = new Product(2, "Мишка", 500);
        Product keyboard = new Product(3, "Клавіатура", 1500);

        Customer rich = new Customer("Олена", 50000);
        task38 order1 = new task38(rich, 5);
        order1.addProduct(laptop);
        order1.addProduct(mouse);
        order1.addProduct(keyboard);
        order1.checkout();

        Customer poor = new Customer("Максим", 1000);
        task38 order2 = new task38(poor, 5);
        order2.addProduct(laptop);
        order2.addProduct(mouse);
        order2.checkout();
    }

    static class Product {
        private int id;
        private String title;
        private double price;

        public Product(int id, String title, double price) {
            this.id = id;
            this.title = title;
            this.price = price;
        }

        public String getTitle() {
            return title;
        }

        public double getPrice() {
            return price;
        }
    }

    static class Customer {
        private String name;
        private double walletBalance;

        public Customer(String name, double walletBalance) {
            this.name = name;
            this.walletBalance = walletBalance;
        }

        public boolean pay(double amount) {
            if (amount <= walletBalance) {
                walletBalance -= amount;
                return true;
            }
            return false;
        }

        public String getName() {
            return name;
        }

        public double getWalletBalance() {
            return walletBalance;
        }
    }
}
