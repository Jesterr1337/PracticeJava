package practice6;

public class task7 {
    double x;
    double y;

    public static void main(String[] args) {
        task7 a = new task7();
        a.x = 0;
        a.y = 0;

        task7 b = new task7();
        b.x = 3;
        b.y = 4;

        double d = Math.sqrt(Math.pow(b.x - a.x, 2) + Math.pow(b.y - a.y, 2));
        System.out.println("Відстань: " + d);
    }
}
