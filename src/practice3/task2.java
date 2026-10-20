package practice3;

import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("====КАЛЬКУЛЯТОР====");
        System.out.print("Введіть перше число:");
        int number1 = scanner.nextInt();
        System.out.print("Введіть друге число:");
        int number2 = scanner.nextInt();
        System.out.println("Добуток: " +number1 * +number2 );
        System.out.println("Різниця: " +(number1- number2) );
        System.out.println("Сумма: " +(number1 + number2) );
        System.out.println("Остача від делення: " +(number1 % number2) );
        System.out.print("===================");

                scanner.close();


    }

}