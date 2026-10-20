package practice3;

import java.util.Scanner;

public class task36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть місяць: ");
        String month = scanner.next().toLowerCase();

        String season = switch (month) {
            case "грудень", "січень", "лютий" -> "Зима";
            case "березень", "квітень", "травень" -> "Весна";
            case "червень", "липень", "серпень" -> "Літо";
            case "вересень", "жовтень", "листопад" -> "Осінь";
            default -> "Невідома пора року";
        };

        System.out.println("Пора року: " + season);

        scanner.close();
    }
}