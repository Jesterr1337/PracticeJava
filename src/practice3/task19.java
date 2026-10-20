package practice3;

import java.util.Scanner;

public class task19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        String result = (n % 2 == 0) ? "Парне" : "Непарне";

        System.out.println(result);

        scanner.close();
    }
}