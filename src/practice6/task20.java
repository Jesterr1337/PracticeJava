package practice6;

public class task20 {
    public boolean isEven(int n) {
        return n % 2 == 0;
    }

    public boolean isPositive(int n) {
        return n > 0;
    }

    public boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        task20 checker = new task20();
        int[] numbers = {7, 12, -5};
        for (int n : numbers) {
            System.out.println("Число: " + n);
            System.out.println("Парне: " + checker.isEven(n));
            System.out.println("Додатне: " + checker.isPositive(n));
            System.out.println("Просте: " + checker.isPrime(n));
        }
    }
}
