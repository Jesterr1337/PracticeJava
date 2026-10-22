package practice6;

public class task17 {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Помилка: ділення на нуль!");
            return 0.0;
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        task17 calc = new task17();
        int sum = calc.add(10, 5);
        int diff = calc.subtract(10, 5);
        int prod = calc.multiply(10, 5);
        double quot = calc.divide(10, 5);

        System.out.println("Сума: " + sum);
        System.out.println("Різниця: " + diff);
        System.out.println("Добуток: " + prod);
        System.out.println("Частка: " + quot);
    }
}
