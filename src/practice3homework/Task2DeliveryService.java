package practice3homework;

import java.util.Scanner;

public class Task2DeliveryService {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть вагу відправлення (кг): ");
        double weight = scanner.nextDouble();
        System.out.print("Введіть відстань доставки (км): ");
        int distance = scanner.nextInt();
        System.out.print("Оберіть тип доставки (1 — Відділення, 2 — Поштомат, 3 — Кур'єр): ");
        int deliveryType = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Чи має клієнт картку \"Premium\" (так/ні): ");
        String isPremiumInput = scanner.nextLine();
        if (weight <= 0 || weight > 50.0) {
            System.out.println("Помилка: вага відправлення повинна бути більшою за 0 кг та не перевищувати 50.0 кг!");
            scanner.close();
            return;
        }

        if (distance <= 0) {
            System.out.println("Помилка: відстань доставки повинна бути більшою за 0 км!");
            scanner.close();
            return;
        }
        double baseTariff = switch (deliveryType) {
            case 1 -> 50.0;
            case 2 -> {
                if (weight > 15.0) {
                    System.out.println("Помилка: поштомат не приймає габаритні посилки вагою понад 15.0 кг!");
                    yield -1.0;
                }
                yield 60.0;
            }
            case 3 -> 100.0;
            default -> {
                System.out.println("Помилка: некоректно обрано тип доставки!");
                yield -1.0;
            }
        };

        if (baseTariff == -1.0) {
            scanner.close();
            return;
        }
        double distanceFee;
        if (distance <= 50) {
            distanceFee = 0.0;
        } else if (distance <= 200) {
            distanceFee = 35.0;
        } else {
            distanceFee = 80.0;
        }
        boolean isPremium = isPremiumInput.equalsIgnoreCase("так");
        double totalBeforeDiscount = baseTariff + distanceFee;
        double finalCost = isPremium ? totalBeforeDiscount * 0.80 : totalBeforeDiscount;

        System.out.println("\n================ РОЗРАХУНКОВА КВИТАНЦІЯ ================");
        System.out.printf("Вага відправлення: %.1f кг%n", weight);
        System.out.printf("Відстань доставки: %d км%n", distance);
        System.out.printf("Базовий тариф: %.2f грн%n", baseTariff);
        System.out.printf("Доплата за кілометраж: %.2f грн%n", distanceFee);
        System.out.printf("Сума до знижки: %.2f грн%n", totalBeforeDiscount);
        System.out.println("Статус Premium: " + (isPremium ? "Так (знижка 20%)" : "Ні"));
        System.out.printf("Підсумкова вартість доставки: %.2f грн%n", finalCost);
        System.out.println("========================================================");

        scanner.close();
    }
}
