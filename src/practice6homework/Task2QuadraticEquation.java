package practice6homework;

import java.util.Locale;

public class Task2QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public void setCoefficients(double a, double b, double c) {
        if (a == 0) {
            System.out.println("Увага: коефіцієнт 'a' не може дорівнювати 0 (це лінійне рівняння)!");
            a = 1.0;
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public boolean hasRealRoots() {
        return getDiscriminant() >= 0;
    }

    public double getRoot1() {
        double d = getDiscriminant();
        if (d < 0) {
            return Double.NaN;
        }
        return (-b + Math.sqrt(d)) / (2 * a);
    }

    public double getRoot2() {
        double d = getDiscriminant();
        if (d < 0) {
            return Double.NaN;
        }
        return (-b - Math.sqrt(d)) / (2 * a);
    }

    private String term(double value) {
        if (value < 0) {
            return "(" + value + ")";
        }
        return String.valueOf(value);
    }

    public void printSolution() {
        System.out.println("Рівняння: " + term(a) + "*x^2 + " + term(b) + "*x + " + term(c) + " = 0");
        double d = getDiscriminant();
        System.out.printf("Дискримінант D = %.2f%n", d);
        if (d > 0) {
            System.out.println("Рівняння має 2 дійсні корені:");
            System.out.printf("  x1 = %.2f%n", getRoot1());
            System.out.printf("  x2 = %.2f%n", getRoot2());
        } else if (d == 0) {
            System.out.println("Рівняння має один дійсний корінь:");
            System.out.printf("  x = %.2f%n", -b / (2 * a));
        } else {
            System.out.println("Рівняння не має дійсних коренів у множині R.");
        }
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        System.out.println("=== РОЗВ'ЯЗУВАЧ КВАДРАТНИХ РІВНЯНЬ ===");

        Task2QuadraticEquation eq1 = new Task2QuadraticEquation();
        eq1.setCoefficients(1, -5, 6);
        System.out.println("Тест 1:");
        eq1.printSolution();
        System.out.println("--------------------------------------");

        Task2QuadraticEquation eq2 = new Task2QuadraticEquation();
        eq2.setCoefficients(1, -4, 4);
        System.out.println("Тест 2:");
        eq2.printSolution();
        System.out.println("--------------------------------------");

        Task2QuadraticEquation eq3 = new Task2QuadraticEquation();
        eq3.setCoefficients(1, 2, 5);
        System.out.println("Тест 3:");
        eq3.printSolution();
        System.out.println("======================================");
    }
}
