package practice7;

public class task15 {
    private double width;
    private double height;
    private double depth;
    private String material;

    public task15(double width, double height, double depth, String material) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.material = material;
    }

    public task15(double size, String material) {
        this(size, size, size, material);
    }

    // конструктор копіювання
    public task15(task15 other) {
        this(other.width, other.height, other.depth, other.material);
    }

    public double getVolume() {
        return width * height * depth;
    }

    public double getSurfaceArea() {
        return 2 * (width * height + width * depth + height * depth);
    }

    public void printBox() {
        System.out.println("Коробка " + width + "x" + height + "x" + depth + ", матеріал: " + material
                + ", об'єм: " + getVolume() + ", площа поверхні: " + getSurfaceArea());
    }

    public static void main(String[] args) {
        task15 cube = new task15(10, "картон");
        task15 copy = new task15(cube);
        task15 other = new task15(5, 6, 7, "дерево");

        cube.printBox();
        copy.printBox();
        other.printBox();

        System.out.println("Об'єми куба та копії однакові? " + (cube.getVolume() == copy.getVolume()));
        System.out.println("Це той самий об'єкт (==)? " + (cube == copy));
    }
}
