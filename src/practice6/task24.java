package practice6;

public class task24 {
    double a, b, c;

    public boolean isValid() {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public double getPerimeter() {
        if (!isValid()) return 0.0;
        return a + b + c;
    }

    public double getArea() {
        if (!isValid()) return 0.0;
        double p = getPerimeter() / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void main(String[] args) {
        task24 triangle = new task24();
        triangle.a = 3.0;
        triangle.b = 4.0;
        triangle.c = 5.0;

        System.out.println("Валідний: " + triangle.isValid());
        System.out.println("Периметр: " + triangle.getPerimeter());
        System.out.println("Площа: " + triangle.getArea());
    }
}
