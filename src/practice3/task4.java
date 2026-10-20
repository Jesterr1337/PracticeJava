package practice3;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть номер студенського квитка:");
        int number = scanner.nextInt();
        String name = scanner.nextLine();
        System.out.print("Введіть повне ім'я студента:");
        String a = scanner.nextLine();
        System.out.print("Введіть спеціальність:");
        String b = scanner.nextLine();
        System.out.println("Студент: " + a + ", квиток №" + number + ", спеціальність: " + b);
}
}



