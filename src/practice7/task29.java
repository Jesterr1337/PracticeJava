package practice7;

public class task29 {
    private static int totalCars = 0;
    private static double totalCompanyMileage = 0.0;

    private String vinCode;
    private double currentMileage;

    public task29(String vinCode, double initialMileage) {
        this.vinCode = vinCode;
        this.currentMileage = initialMileage;
        totalCars++;
        totalCompanyMileage += initialMileage;
    }

    public void addTrip(double km) {
        this.currentMileage += km;
        totalCompanyMileage += km;
    }

    public void printCar() {
        System.out.println("Авто VIN " + vinCode + ", пробіг: " + currentMileage + " км");
    }

    public static void printFleetSummary() {
        System.out.println("Автопарк: авто - " + totalCars + ", загальний пробіг - " + totalCompanyMileage + " км");
    }

    public static void main(String[] args) {
        task29 c1 = new task29("VIN001", 10000);
        task29 c2 = new task29("VIN002", 25000);
        task29 c3 = new task29("VIN003", 500);
        task29.printFleetSummary();

        c1.addTrip(120);
        c2.addTrip(300);
        c3.addTrip(80);
        c1.printCar();
        c2.printCar();
        c3.printCar();
        task29.printFleetSummary();
    }
}
