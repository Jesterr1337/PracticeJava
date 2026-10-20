package practice3;

import java.util.Scanner;

public class task20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть бал: ");
        int score = scanner.nextInt();

        System.out.println("Результат: " + (score >= 60 ? "Зараховано" : "Незараховано"));

        scanner.close();
    }
}
