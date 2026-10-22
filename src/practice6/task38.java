package practice6;

public class task38 {
    private double[] coords = new double[3];

    public void setCoords(double x, double y, double z) {
        coords[0] = x;
        coords[1] = y;
        coords[2] = z;
    }

    public double getMagnitude() {
        return Math.sqrt(coords[0] * coords[0] + coords[1] * coords[1] + coords[2] * coords[2]);
    }

    public void multiplyByScalar(double scalar) {
        coords[0] *= scalar;
        coords[1] *= scalar;
        coords[2] *= scalar;
    }

    public void printVector() {
        System.out.printf("(%.1f, %.1f, %.1f)\n", coords[0], coords[1], coords[2]);
    }

    public static void main(String[] args) {
        task38 vector = new task38();
        vector.setCoords(2, 3, 6);
        vector.printVector();
        System.out.println("Довжина: " + vector.getMagnitude());
        vector.multiplyByScalar(2);
        vector.printVector();
    }
}

