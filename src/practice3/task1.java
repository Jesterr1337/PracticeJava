package practice3;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===Вхідні данні===");
        System.out.print("Ім'я:");
        String name = scanner.next();
        System.out.print("Прізвище:");
        String surname = scanner.next();
        System.out.print("Вік:");
        int age = scanner.nextInt();
        System.out.print("Місто:");
        String city = scanner.next();
        System.out.println("-------------------");
        System.out.println("Привіт, " + name + " " + surname + " з міста " + city + "! " + " Твій вік: " + age + " p.");


        scanner.close();


    }
}