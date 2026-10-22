package practice7;

public class task22 {
    private int day;
    private int month;
    private int year;

    public task22(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // у кожному місяці 30 днів (спрощене правило)
    public void add(int days) {
        add(days, 0, 0);
    }

    public void add(int days, int months) {
        add(days, months, 0);
    }

    public void add(int days, int months, int years) {
        day += days;
        month += months;
        year += years;

        month += (day - 1) / 30;
        day = (day - 1) % 30 + 1;

        year += (month - 1) / 12;
        month = (month - 1) % 12 + 1;
    }

    public void printDate() {
        System.out.println(String.format("%02d.%02d.%d", day, month, year));
    }

    public static void main(String[] args) {
        task22 d = new task22(15, 3, 2024);
        System.out.print("Початкова дата: ");
        d.printDate();
        d.add(20);
        System.out.print("Після додавання 20 днів: ");
        d.printDate();
        d.add(0, 3);
        System.out.print("Після додавання 3 місяців: ");
        d.printDate();
        d.add(10, 6, 1);
        System.out.print("Після додавання 10 днів, 6 місяців, 1 року: ");
        d.printDate();
    }
}
