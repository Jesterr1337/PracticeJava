package practice7;

public class task1 {
    private String title;
    private String author;
    private int year;
    private double price;

    public task1() {
        this.title = "Невідомо";
        this.author = "Невідомий";
        this.year = 2000;
        this.price = 0.0;
    }

    public task1(String title, String author, int year, double price) {
        this.title = title;
        this.author = author;
        if (year < 0 || price < 0.0) {
            this.year = 2000;
            this.price = 0.0;
        } else {
            this.year = year;
            this.price = price;
        }
    }

    public void printInfo() {
        System.out.println("Книга: \"" + title + "\", автор: " + author + ", рік: " + year + ", ціна: " + price + " грн");
    }

    public static void main(String[] args) {
        task1 b1 = new task1();
        task1 b2 = new task1("Кобзар", "Тарас Шевченко", 1840, 250.0);
        task1 b3 = new task1("Погана книга", "Хтось", -5, -10.0);
        b1.printInfo();
        b2.printInfo();
        b3.printInfo();
    }
}
