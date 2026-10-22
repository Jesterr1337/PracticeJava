package practice7;

public class task28 {
    private static double usdToUahRate = 41.5;
    private static double eurToUahRate = 45.2;

    public static void updateRates(double newUsd, double newEur) {
        if (newUsd > 0) {
            usdToUahRate = newUsd;
        }
        if (newEur > 0) {
            eurToUahRate = newEur;
        }
    }

    public static double uahToUsd(double uah) {
        return uah / usdToUahRate;
    }

    public static double usdToUah(double usd) {
        return usd * usdToUahRate;
    }

    public static double eurToUah(double eur) {
        return eur * eurToUahRate;
    }

    public static void main(String[] args) {
        System.out.println("Курс: USD = 41.5, EUR = 45.2");
        System.out.println("100 USD = " + task28.usdToUah(100) + " грн");
        System.out.println("100 EUR = " + task28.eurToUah(100) + " грн");
        System.out.println("4150 грн = " + task28.uahToUsd(4150) + " USD");

        task28.updateRates(42.0, 46.0);
        System.out.println("Новий курс: USD = 42.0, EUR = 46.0");
        System.out.println("100 USD = " + task28.usdToUah(100) + " грн");
        System.out.println("100 EUR = " + task28.eurToUah(100) + " грн");
        System.out.println("4200 грн = " + task28.uahToUsd(4200) + " USD");
    }
}
