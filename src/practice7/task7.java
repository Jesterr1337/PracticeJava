package practice7;

public class task7 {
    private double width;
    private double height;

    public task7() {
        this.width = 1.0;
        this.height = 1.0;
    }

    public task7(double size) {
        this.width = size;
        this.height = size;
    }

    public task7(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public boolean isSquare() {
        return width == height;
    }

    public static void main(String[] args) {
        task7 unit = new task7();
        task7 square = new task7(5);
        task7 rect = new task7(4, 6);

        System.out.println("Одиничний: S = " + unit.getArea() + ", P = " + unit.getPerimeter() + ", квадрат? " + unit.isSquare());
        System.out.println("Квадрат 5x5: S = " + square.getArea() + ", P = " + square.getPerimeter() + ", квадрат? " + square.isSquare());
        System.out.println("Прямокутник 4x6: S = " + rect.getArea() + ", P = " + rect.getPerimeter() + ", квадрат? " + rect.isSquare());

        if (square.getArea() > rect.getArea()) {
            System.out.println("Площа квадрата більша");
        } else if (square.getArea() < rect.getArea()) {
            System.out.println("Площа прямокутника більша");
        } else {
            System.out.println("Площі однакові");
        }
        if (square.getPerimeter() > rect.getPerimeter()) {
            System.out.println("Периметр квадрата більший");
        } else if (square.getPerimeter() < rect.getPerimeter()) {
            System.out.println("Периметр прямокутника більший");
        } else {
            System.out.println("Периметри однакові");
        }
    }
}
