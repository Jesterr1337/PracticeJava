package practice3;

import java.util.Scanner;

public class task30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть сторону a: ");
        double a = scanner.nextDouble();

        System.out.print("Введіть сторону b: ");
        double b = scanner.nextDouble();

        System.out.print("Введіть сторону c: ");
        double c = scanner.nextDouble();

        boolean exists = (a + b > c) && (a + c > b) && (b + c > a);

        System.out.printf("Сторони: %.0f, %.0f, %.0f -> Трикутник існує: %b%n", a, b, c, exists);

        scanner.close();
    }
}
