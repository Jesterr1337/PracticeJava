package practice7;

public class task17 {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public String add(String a, String b) {
        return a + " " + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public String multiply(String text, int times) {
        String result = "";
        for (int i = 0; i < times; i++) {
            result += text;
        }
        return result;
    }

    public static void main(String[] args) {
        task17 m = new task17();
        System.out.println("add(2, 3) = " + m.add(2, 3));
        System.out.println("add(2.5, 3.5) = " + m.add(2.5, 3.5));
        System.out.println("add(1, 2, 3) = " + m.add(1, 2, 3));
        System.out.println("add(\"Hello\", \"World\") = " + m.add("Hello", "World"));
        System.out.println("multiply(4, 5) = " + m.multiply(4, 5));
        System.out.println("multiply(1.5, 4.0) = " + m.multiply(1.5, 4.0));
        System.out.println("multiply(\"ab\", 3) = " + m.multiply("ab", 3));
    }
}
