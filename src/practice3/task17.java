package practice3;

import java.util.Scanner;

public class task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int max = (x > y) ? x : y;

        System.out.println(max);

        scanner.close();
    }
}