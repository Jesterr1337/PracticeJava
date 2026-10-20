package practice4;

import java.util.Scanner;

public class task27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            } else {
                sum -= i;
            }
        }
        System.out.println("Сума ряду: " + sum);
        scanner.close();
    }
}