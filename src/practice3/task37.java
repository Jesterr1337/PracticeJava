package practice3;

import java.util.Scanner;

public class task37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Оберіть спосіб доставки (1 — Самовивіз, 2 — Кур'єр, 3 — Поштомат): ");
        int deliveryType = scanner.nextInt();

        System.out.print("Введіть вагу товару (кг): ");
        double weight = scanner.nextDouble();

        int shippingCost = switch (deliveryType) {
            case 1 -> 0;
            case 2 -> {
                if (weight > 5) {
                    yield 150;
                } else {
                    yield 90;
                }
            }
            case 3 -> 60;
            default -> -1;
        };

        if (shippingCost != -1) {
            System.out.println("Вартість доставки: " + shippingCost + " грн.");
        } else {
            System.out.println("Помилка: некоректний вибір способу доставки!");
        }

        scanner.close();
    }
}
