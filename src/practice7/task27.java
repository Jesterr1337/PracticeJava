package practice7;

public class task27 {
    public static final double PI = 3.1415926535;
    public static final double E = 2.7182818284;

    private task27() {
    }

    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static double power(double base, int exp) {
        double result = 1;
        int e = Math.abs(exp);
        for (int i = 0; i < e; i++) {
            result *= base;
        }
        if (exp < 0) {
            return 1 / result;
        }
        return result;
    }

    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public static int clamp(int val, int min, int max) {
        if (val < min) {
            return min;
        }
        if (val > max) {
            return max;
        }
        return val;
    }

    public static void main(String[] args) {
        System.out.println("PI = " + task27.PI + ", E = " + task27.E);
        System.out.println("5! = " + task27.factorial(5));
        System.out.println("10! = " + task27.factorial(10));
        System.out.println("2^10 = " + task27.power(2, 10));
        System.out.println("2^(-3) = " + task27.power(2, -3));
        System.out.println("НСД(48, 18) = " + task27.gcd(48, 18));
        System.out.println("clamp(15, 0, 10) = " + task27.clamp(15, 0, 10));
        System.out.println("clamp(-5, 0, 10) = " + task27.clamp(-5, 0, 10));
        System.out.println("clamp(7, 0, 10) = " + task27.clamp(7, 0, 10));
    }
}
