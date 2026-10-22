package practice7;

public class task4 {
    private double x;
    private double y;

    public task4() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public task4(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceToOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    public double distanceTo(double targetX, double targetY) {
        double dx = targetX - x;
        double dy = targetY - y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public void printPoint() {
        System.out.println("Point(" + x + "; " + y + ")");
    }

    public static void main(String[] args) {
        task4 p1 = new task4();
        task4 p2 = new task4(3, 4);
        task4 p3 = new task4(6, 8);
        p1.printPoint();
        p2.printPoint();
        p3.printPoint();
        System.out.println("Відстань p2 до початку координат: " + p2.distanceToOrigin());
        System.out.println("Відстань p2 до p3: " + p2.distanceTo(6, 8));
        System.out.println("Відстань p1 до p3: " + p1.distanceTo(6, 8));
    }
}
