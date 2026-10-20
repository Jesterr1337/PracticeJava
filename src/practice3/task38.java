package practice3;

import java.util.Scanner;

public class task38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Число 1: ");
        double a = scanner.nextDouble();

        System.out.print("Оберіть операцію (+, -, *, /): ");
        char op = scanner.next().charAt(0);

        System.out.print("Число 2: ");
        double b = scanner.nextDouble();

        double result = switch (op) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> {
                if (b == 0) {
                    System.out.println("Помилка: ділення на нуль!");
                    yield Double.NaN;
                }
                yield a / b;
            }
            default -> {
                System.out.println("Помилка: невідома операція!");
                yield Double.NaN;
            }
        };

        if (!Double.isNaN(result)) {
            System.out.println("Результат: " + result);
        }

        scanner.close();
    }
}