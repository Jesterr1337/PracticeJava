package practice3;

import java.util.Scanner;

public class task39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть команду: ");
        String command = scanner.nextLine();

        boolean equalsOperatorCheck = (command == "start");
        System.out.println("[Тест '==']: command == \"start\" -> " + equalsOperatorCheck);


        if (command.equalsIgnoreCase("start")) {
            System.out.println("[Тест equalsIgnoreCase]: Команда відповідає 'start'");
        }

        String message = switch (command.toLowerCase()) {
            case "start" -> "Система успішно запущена!";
            case "pause" -> "Систему поставлено на паузу.";
            case "stop"  -> "Систему зупинено.";
            case "exit"  -> "Вихід з програми.";
            default      -> "Невідома команда!";
        };

        System.out.println(message);

        scanner.close();
    }
}
