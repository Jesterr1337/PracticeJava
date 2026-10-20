package practice4homework;

import java.util.Scanner;

public class Task2DigitAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int originalNumber;

        System.out.println("=== АНАЛІЗАТОР РОЗРЯДІВ ЧИСЛА ===");


        do {
            System.out.print("Введіть додатне ціле число: ");
            originalNumber = scanner.nextInt();
            if (originalNumber <= 0) {
                System.out.println("Помилка: число має бути додатним (> 0)!");
            }
        } while (originalNumber <= 0);

        int temp = originalNumber;
        int digitCount = 0;
        int sumOfDigits = 0;
        int maxDigit = 0;
        int reversedNumber = 0;


        while (temp > 0) {
            int digit = temp % 10;

            digitCount++;
            sumOfDigits += digit;

            if (digit > maxDigit) {
                maxDigit = digit;
            }

            reversedNumber = reversedNumber * 10 + digit;

            temp /= 10;
        }


        System.out.println("\n--- СТАТИСТИКА ЧИСЛА ---");
        System.out.printf("Початкове число:     %d%n", originalNumber);
        System.out.printf("Кількість цифр:      %d%n", digitCount);
        System.out.printf("Сума цифр:           %d%n", sumOfDigits);
        System.out.printf("Найбільша цифра:     %d%n", maxDigit);
        System.out.printf("Перевернуте число:   %d%n", reversedNumber);


        if (originalNumber == reversedNumber) {
            System.out.println("Результат:           ✨ Це число є ПАЛІНДРОМОМ!");
        } else {
            System.out.println("Результат:           Це звичайне число (не паліндром).");
        }
        System.out.println("=========================================");

        scanner.close();
    }
}
