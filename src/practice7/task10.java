package practice7;

public class task10 {
    private int numerator;
    private int denominator;

    public task10(int numerator, int denominator) {
        if (denominator == 0) {
            System.out.println("Помилка: знаменник не може дорівнювати 0!");
            denominator = 1;
        }
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
        int g = gcd(numerator, denominator);
        if (g != 0) {
            numerator /= g;
            denominator /= g;
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public task10(int wholeNumber) {
        this(wholeNumber, 1);
    }

    public task10() {
        this(0, 1);
    }

    private static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public void print() {
        if (denominator == 1) {
            System.out.println(numerator);
        } else {
            System.out.println(numerator + "/" + denominator);
        }
    }

    public double toDouble() {
        return (double) numerator / denominator;
    }

    public static void main(String[] args) {
        task10 f1 = new task10(8, -12);
        task10 f2 = new task10(5);
        task10 f3 = new task10();
        task10 f4 = new task10(3, 0);
        f1.print();
        System.out.println(f1.toDouble());
        f2.print();
        System.out.println(f2.toDouble());
        f3.print();
        System.out.println(f3.toDouble());
        f4.print();
    }
}
