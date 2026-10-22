package practice6;

public class task22 {
    String name;
    double baseSalary;
    double bonusPercentage;

    public double calculateTotalSalary() {
        return baseSalary * (1 + bonusPercentage / 100);
    }

    public double calculateTax() {
        return calculateTotalSalary() * 0.195;
    }

    public static void main(String[] args) {
        task22 emp = new task22();
        emp.name = "Олександр";
        emp.baseSalary = 30000;
        emp.bonusPercentage = 15;

        System.out.println("Повна зарплата: " + emp.calculateTotalSalary());
        System.out.println("Податок: " + emp.calculateTax());
    }
}
