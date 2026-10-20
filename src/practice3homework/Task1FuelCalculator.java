package practice3homework;

import java.util.Scanner;

public class Task1FuelCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть відстань поїздки у кілометрах: ");
        double distance = scanner.nextDouble();

        System.out.print("Введіть середню витрату пального на 100 км: ");
        double fuelConsumption = scanner.nextDouble();

        System.out.print("Оберіть тип пального (1 — Бензин А-95, 2 — Дизель, 3 — Газ): ");
        int fuelType = scanner.nextInt();
        if (distance <= 0 || fuelConsumption <= 0) {
            System.out.println("Помилка: відстань та витрата пального повинні бути більшими за 0!");
            scanner.close();
            return;
        }
        double pricePerLiter = switch (fuelType) {
            case 1 -> 56.50; // Бензин А-95
            case 2 -> 52.80; // Дизель
            case 3 -> 29.40; // Газ
            default -> -1.0;
        };

        if (pricePerLiter == -1.0) {
            System.out.println("Помилка: введено невідомий тип пального!");
            scanner.close();
            return;
        }
        double neededFuel = (distance * fuelConsumption) / 100.0;
        double baseCost = neededFuel * pricePerLiter;
        double finalCost = (baseCost >= 2000.0) ? baseCost * 0.95 : baseCost;
        System.out.println("\n================ ЗВІТ ПОЇЗДКИ ================");
        System.out.printf("Необхідний об'єм пального: %.2f л%n", neededFuel);
        System.out.printf("Ціна за 1 літр: %.2f грн%n", pricePerLiter);
        System.out.printf("Базова вартість: %.2f грн%n", baseCost);
        if (baseCost >= 2000.0) {
            System.out.println("Знижка на АЗС: 5%");
        } else {
            System.out.println("Знижка на АЗС: 0%");
        }
        System.out.printf("Фінальна вартість поїздки: %.2f грн%n", finalCost);
        System.out.println("==============================================");
        scanner.close();
    }
}
