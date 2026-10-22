package practice6homework;

import java.util.Locale;

public class Task1Fraction {
    private int numerator;   // чисельник
    private int denominator; // знаменник

    public void setValues(int num, int den) {
        if (den == 0) {
            System.out.println("Помилка: знаменник не може дорівнювати 0!");
            numerator = num;
            denominator = 1;
        } else if (den < 0) {
            numerator = -num;
            denominator = -den;
        } else {
            numerator = num;
            denominator = den;
        }
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    // НСД за алгоритмом Евкліда
    private int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public void simplify() {
        int g = gcd(numerator, denominator);
        if (g != 0) {
            numerator = numerator / g;
            denominator = denominator / g;
        }
    }

    public double toDecimal() {
        return (double) numerator / denominator;
    }

    public void add(int otherNum, int otherDen) {
        if (otherDen == 0) {
            System.out.println("Помилка: знаменник не може дорівнювати 0!");
            return;
        }
        // a/b + c/d = (a*d + c*b) / (b*d)
        numerator = numerator * otherDen + otherNum * denominator;
        denominator = denominator * otherDen;
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
        simplify();
    }

    public void printFraction() {
        if (denominator == 1) {
            System.out.print(numerator);
        } else {
            System.out.print(numerator + "/" + denominator);
        }
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        System.out.println("=== КАЛЬКУЛЯТОР ЗВИЧАЙНИХ ДРОБІВ ===");

        Task1Fraction f = new Task1Fraction();
        f.setValues(8, 12);
        System.out.print("Дріб 1: ");
        f.printFraction();
        System.out.println();

        f.simplify();
        System.out.print("Після скорочення: ");
        f.printFraction();
        System.out.printf(" (десятковий вигляд: %.4f)%n", f.toDecimal());

        System.out.println();
        int a = f.getNumerator();
        int b = f.getDenominator();
        int c = 3;
        int d = 4;
        System.out.println("Додаємо дріб " + c + "/" + d + " до " + a + "/" + b + "...");
        f.add(c, d);
        System.out.println("Формула: " + a + "/" + b + " + " + c + "/" + d + " = (" + a + "*" + d + " + " + c + "*" + b
                + ") / (" + b + "*" + d + ") = " + f.getNumerator() + "/" + f.getDenominator());
        System.out.print("Результат додавання: ");
        f.printFraction();
        System.out.printf(" (десятковий вигляд: %.4f)%n", f.toDecimal());
        System.out.println("=====================================");
    }
}
