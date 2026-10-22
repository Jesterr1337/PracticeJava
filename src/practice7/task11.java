package practice7;

public class task11 {
    private String brand;
    private String model;
    private int year;
    private double mileage;
    private boolean engineStarted;

    public task11(String brand, String model, int year, double mileage) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.engineStarted = false;
    }

    public task11(String brand, String model, int year) {
        this(brand, model, year, 0.0);
    }

    public task11() {
        this("Unknown", "Standard", 2024);
    }

    public void startEngine() {
        engineStarted = true;
        System.out.println("Двигун " + brand + " " + model + " заведено");
    }

    public void stopEngine() {
        engineStarted = false;
        System.out.println("Двигун " + brand + " " + model + " заглушено");
    }

    public void drive(double distance) {
        if (engineStarted) {
            mileage += distance;
            System.out.println("Проїхали " + distance + " км. Пробіг: " + mileage + " км");
        } else {
            System.out.println("Спершу заведіть двигун!");
        }
    }

    public void printInfo() {
        System.out.println(brand + " " + model + " (" + year + "), пробіг: " + mileage + " км");
    }

    public static void main(String[] args) {
        task11 def = new task11();
        def.printInfo();

        task11 car = new task11("Toyota", "Camry", 2024);
        car.printInfo();
        car.drive(150);
        car.startEngine();
        car.drive(150);
        car.stopEngine();
        car.printInfo();

        task11 used = new task11("BMW", "X5", 2018, 85000);
        used.printInfo();
    }
}
