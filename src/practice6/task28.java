package practice6;

public class task28 {
    private double temperature;

    public void setTemperature(double t) {
        if (t < -273.15) {
            System.out.println("Помилка: температура не може бути нижчою за абсолютний нуль (-273.15°C)!");
        } else {
            temperature = t;
        }
    }

    public double getTemperature() {
        return temperature;
    }

    public static void main(String[] args) {
        task28 thermometer = new task28();
        thermometer.setTemperature(-300);
        thermometer.setTemperature(25);
        System.out.println("Температура: " + thermometer.getTemperature());
    }
}
