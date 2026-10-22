package practice7;

public class task39 {
    private double x;
    private double y;
    private double z;

    public task39(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public task39() {
        this(0, 0, 0);
    }

    public task39 add(task39 other) {
        return new task39(this.x + other.x, this.y + other.y, this.z + other.z);
    }

    public double dotProduct(task39 other) {
        return this.x * other.x + this.y * other.y + this.z * other.z;
    }

    public task39 crossProduct(task39 other) {
        return new task39(
                this.y * other.z - this.z * other.y,
                this.z * other.x - this.x * other.z,
                this.x * other.y - this.y * other.x);
    }

    public boolean isOrthogonalTo(task39 other) {
        return Math.abs(this.dotProduct(other)) < 1e-9;
    }

    public boolean isEqualTo(task39 other) {
        return this.x == other.x && this.y == other.y && this.z == other.z;
    }

    public void print() {
        System.out.println("(" + x + "; " + y + "; " + z + ")");
    }

    public static void main(String[] args) {
        task39 a = new task39(1, 0, 0);
        task39 b = new task39(0, 1, 0);
        task39 zero = new task39();

        System.out.print("a = ");
        a.print();
        System.out.print("b = ");
        b.print();
        System.out.print("нульовий = ");
        zero.print();

        System.out.print("a + b = ");
        a.add(b).print();
        System.out.println("a · b = " + a.dotProduct(b));
        System.out.print("a × b = ");
        a.crossProduct(b).print();
        System.out.println("a ⟂ b? " + a.isOrthogonalTo(b));
        System.out.println("a == b за значенням? " + a.isEqualTo(b));
        System.out.println("a == копія a за значенням? " + a.isEqualTo(new task39(1, 0, 0)));
    }
}
