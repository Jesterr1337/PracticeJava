package practice6;

public class task4 {
    double width;
    double height;

    public static void main(String[] args) {
        task4 rectangle = new task4();
        rectangle.width = 7.5;
        rectangle.height = 4.0;

        double s = rectangle.width * rectangle.height;
        double p = 2 * (rectangle.width + rectangle.height);

        System.out.println("Площа: " + s);
        System.out.println("Периметр: " + p);
    }
}
