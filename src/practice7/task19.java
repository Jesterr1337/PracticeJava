package practice7;

public class task19 {
    // квадрат
    public double calculateArea(double side) {
        return side * side;
    }

    // прямокутник
    public double calculateArea(double width, double height) {
        return width * height;
    }

    // круг
    public double calculateArea(double radius, boolean isCircle) {
        return Math.PI * radius * radius;
    }

    // трикутник за формулою Герона (три сторони)
    public double calculateArea(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    // трапеція. Сигнатура (double, double, double) уже зайнята трикутником,
    // тому додано четвертий параметр-прапорець
    public double calculateArea(double base1, double base2, double height, boolean isTrapezoid) {
        return (base1 + base2) / 2 * height;
    }

    public static void main(String[] args) {
        task19 calc = new task19();
        System.out.println("Квадрат зі стороною 4: " + calc.calculateArea(4.0));
        System.out.println("Прямокутник 3x7: " + calc.calculateArea(3.0, 7.0));
        System.out.println("Круг радіусом 5: " + calc.calculateArea(5.0, true));
        System.out.println("Трикутник 3, 4, 5: " + calc.calculateArea(3.0, 4.0, 5.0));
        System.out.println("Трапеція 4, 6, висота 5: " + calc.calculateArea(4.0, 6.0, 5.0, true));
    }
}
