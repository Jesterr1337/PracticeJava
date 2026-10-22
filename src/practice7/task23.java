package practice7;

public class task23 {
    public double calculate(double baseRate) {
        return baseRate;
    }

    public double calculate(double baseRate, double fixedBonus) {
        return baseRate + fixedBonus;
    }

    public double calculate(double baseRate, double bonusPercent, boolean isTaxDeducted) {
        double total = baseRate + baseRate * bonusPercent / 100;
        if (isTaxDeducted) {
            total = total - total * 0.195;
        }
        return total;
    }

    public double calculate(double baseRate, int overtimeHours, double overtimeHourlyRate) {
        return baseRate + overtimeHours * overtimeHourlyRate;
    }

    public static void main(String[] args) {
        task23 c = new task23();
        System.out.println("Лише ставка 20000: " + c.calculate(20000.0));
        System.out.println("Ставка 20000 + премія 3000: " + c.calculate(20000.0, 3000.0));
        System.out.println("Ставка 20000 + 10% бонус, з податком: " + c.calculate(20000.0, 10.0, true));
        System.out.println("Ставка 20000 + 10% бонус, без податку: " + c.calculate(20000.0, 10.0, false));
        System.out.println("Ставка 20000 + 12 год понаднормових по 200: " + c.calculate(20000.0, 12, 200.0));
    }
}
