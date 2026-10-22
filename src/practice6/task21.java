package practice6;

public class task21 {
    double usdRate = 41.5;

    public double toUSD(double uah) {
        return uah / usdRate;
    }

    public double toUAH(double usd) {
        return usd * usdRate;
    }

    public static void main(String[] args) {
        task21 exchange = new task21();
        double uah = 10000;
        double usd = exchange.toUSD(uah);
        System.out.printf("10000 грн у доларах: %.2f\n", usd);
    }
}
