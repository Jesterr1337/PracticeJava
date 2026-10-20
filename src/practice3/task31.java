package practice3;

import java.util.Scanner;

public class task31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть число n: ");
        int n = scanner.nextInt();

        boolean isEvenBitwise = (n & 1) == 0;
        boolean isEvenModulo = n % 2 == 0;

        System.out.println("Перевірка через побітове &: " + isEvenBitwise);
        System.out.println("Перевірка через остачу % 2: " + isEvenModulo);


        scanner.close();
    }
}
