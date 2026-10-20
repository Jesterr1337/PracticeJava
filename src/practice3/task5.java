package practice3;

import java.util.Scanner;
public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть вагу:");
        double waga = scanner.nextDouble();
        System.out.print("Введіть зріст:");
        double rist = scanner.nextDouble();
        System.out.print("Розрахований ВМІ:" +Math.round((double) waga / Math.pow(rist,2)));

        scanner.close();

    }
}