package practice6;

public class task19 {
    public double celsiusToFahrenheit(double c) {
        return c * 1.8 + 32;
    }

    public double fahrenheitToCelsius(double f) {
        return (f - 32) / 1.8;
    }

    public static void main(String[] args) {
        task19 converter = new task19();
        double fahrenheit = converter.celsiusToFahrenheit(25.0);
        double celsius = converter.fahrenheitToCelsius(fahrenheit);

        System.out.println("25°C у Фаренгейтах: " + fahrenheit);
        System.out.println("Назад у Цельсіях: " + celsius);
    }
}
