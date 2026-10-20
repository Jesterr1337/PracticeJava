package practice3;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть довжину першого катета: ");
        double a = scanner.nextDouble();

        System.out.print("Введіть довжину другого катета: ");
        double b = scanner.nextDouble();

        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        double perimeter = a + b + c;
        double area = (a * b) / 2;

        System.out.println("\n--- Результати ---");
        System.out.printf("Гіпотенуза (c): %.2f\n", c);
        System.out.printf("Периметр (P): %.2f\n", perimeter);
        System.out.printf("Площа (S): %.2f\n", area);

        scanner.close();
    }
}