package practice3;

import java.util.Scanner;

public class task40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("============== БАНКОМАТ ==============");
        System.out.print("Введіть PIN: ");
        int pin = scanner.nextInt();
        if (pin != 1234) {
            System.out.println("Невірний PIN-код! Доступ заборонено.");
            scanner.close();
            return;
        }
        System.out.println("Авторизація успішна!\n");
        double balance = 5000.0;
        System.out.print("Оберіть дію (1 - Баланс, 2 - Поповнення, 3 - Зняття, 4 - Вихід): ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> System.out.printf("Ваш баланс: %.1f грн%n", balance);
            case 2 -> {
                System.out.print("Введіть суму поповнення: ");
                double deposit = scanner.nextDouble();
                if (deposit > 0) {
                    balance += deposit;
                    System.out.printf("Поповнено: %.1f грн. Новий баланс: %.1f грн%n", deposit, balance);
                } else {
                    System.out.println("Сума поповнення має бути більшою за 0!");
                }
            }
            case 3 -> {
                System.out.print("Введіть суму зняття: ");
                double amount = scanner.nextDouble();

                if (amount > 0 && amount <= balance) {

                    double commission = (amount > 1000) ? amount * 0.01 : 0.0;
                    double totalDeduction = amount + commission;

                    if (totalDeduction <= balance) {
                        balance -= totalDeduction;
                        System.out.printf("Комісія операції: %.1f грн%n", commission);
                        System.out.printf("Видано: %.1f грн. Залишок на рахунку: %.1f грн%n", amount, balance);
                    } else {
                        System.out.println("Недостатньо коштів для покриття комісії!");
                    }
                } else {
                    System.out.println("Некоректна сума зняття або недостатньо коштів!");
                }
            }

            case 4 -> System.out.println("Дякуємо за використання нашого банкомату. До побачення!");

            default -> System.out.println("Некоректний вибір операції!");
        }

        System.out.println("======================================");
        scanner.close();
    }
}
