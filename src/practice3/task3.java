package practice3;

import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть сумму в гривнях(UAH):");
        double price1 = scanner.nextDouble();
        System.out.print("Введіть курс USD:");
        double price2 = scanner.nextDouble();
        System.out.print("Сума до видачі:" +Math.round((double) price1 / price2));

        scanner.close();

    }
}

