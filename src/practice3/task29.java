package practice3;

import java.util.Scanner;

public class task29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть години (0-23): ");
        int hours = scanner.nextInt();

        System.out.print("Введіть хвилини (0-59): ");
        int minutes = scanner.nextInt();

        boolean isValidTime = (hours >= 0 && hours <= 23) && (minutes >= 0 && minutes <= 59);

        if (isValidTime) {
            System.out.printf("Час: %02d:%02d%n", hours, minutes);
        } else {
            System.out.println("Помилка: некоректно введені години або хвилини!");
        }

        scanner.close();
    }
}
