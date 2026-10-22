package practice7;

public class task33 {
    private Point start;
    private Point end;

    public task33(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public task33(double x1, double y1, double x2, double y2) {
        this(new Point(x1, y1), new Point(x2, y2));
    }

    public double getLength() {
        double dx = end.getX() - start.getX();
        double dy = end.getY() - start.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public Point getMidPoint() {
        return new Point((start.getX() + end.getX()) / 2, (start.getY() + end.getY()) / 2);
    }

    public void printSegment() {
        System.out.println("Відрізок: (" + start.getX() + "; " + start.getY() + ") -> (" + end.getX() + "; " + end.getY() + ")");
    }

    public static void main(String[] args) {
        task33 seg = new task33(new Point(0, 0), new Point(6, 8));
        seg.printSegment();
        System.out.println("Довжина: " + seg.getLength());
        Point mid = seg.getMidPoint();
        System.out.println("Середина: (" + mid.getX() + "; " + mid.getY() + ")");

        task33 seg2 = new task33(1, 1, 4, 5);
        seg2.printSegment();
        System.out.println("Довжина: " + seg2.getLength());
    }

    static class Point {
        private double x;
        private double y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }
    }
}
