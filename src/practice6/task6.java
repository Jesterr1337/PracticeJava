package practice6;

public class task6 {
    String model;
    int batteryLevel;
    boolean isTurnedOn;

    public static void main(String[] args) {
        task6 phone = new task6();
        phone.model = "Model X";
        phone.batteryLevel = 100;
        phone.isTurnedOn = true;

        phone.batteryLevel -= 35;
        if (phone.batteryLevel <= 0) {
            phone.batteryLevel = 0;
            phone.isTurnedOn = false;
        }

        System.out.println("Модель: " + phone.model + ", Заряд: " + phone.batteryLevel + "%, Увімкнено: " + phone.isTurnedOn);
    }
}