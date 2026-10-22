package practice7;

public class task8 {
    private int id;
    private String fullName;
    private String position;
    private double monthlySalary;

    public task8(int id, String fullName, String position, double monthlySalary) {
        this.id = id;
        this.fullName = fullName;
        this.position = position;
        this.monthlySalary = monthlySalary;
    }

    public void raiseSalary(double percent) {
        monthlySalary = monthlySalary + monthlySalary * percent / 100;
    }

    public double getAnnualSalary() {
        return 12 * monthlySalary;
    }

    public void printBadge() {
        System.out.println("========== БЕЙДЖ ==========");
        System.out.println("ID: " + id);
        System.out.println("ПІБ: " + fullName);
        System.out.println("Посада: " + position);
        System.out.println("Зарплата: " + monthlySalary + " грн/міс");
        System.out.println("===========================");
    }

    public static void main(String[] args) {
        task8 e = new task8(101, "Коваленко Андрій", "Програміст", 40000);
        e.printBadge();
        System.out.println("Річний дохід: " + e.getAnnualSalary() + " грн");
        e.raiseSalary(15);
        System.out.println("Після підвищення на 15%:");
        e.printBadge();
        System.out.println("Новий річний дохід: " + e.getAnnualSalary() + " грн");
    }
}
