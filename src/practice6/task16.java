package practice6;

public class task16 {
    String model;
    int paperCount;

    public void printDocument(String title, int pages) {
        if (paperCount >= pages) {
            paperCount -= pages;
            System.out.println("Документ \"" + title + "\" успішно надруковано.");
        } else {
            System.out.println("Помилка: Недостатньо паперу в принтері " + model + "!");
        }
    }

    public static void main(String[] args) {
        task16 printer = new task16();
        printer.model = "HP LaserJet";
        printer.paperCount = 50;

        printer.printDocument("Звіт", 10);
        printer.printDocument("Курсова", 100);
    }
}
