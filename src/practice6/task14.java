package practice6;

public class task14 {
    boolean isOn;

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public void toggle() {
        isOn = !isOn;
    }

    public void status() {
        if (isOn) {
            System.out.println("Лампа світить");
        } else {
            System.out.println("Лампа вимкнена");
        }
    }

    public static void main(String[] args) {
        task14 lamp = new task14();
        lamp.toggle();
        lamp.status();
        lamp.toggle();
        lamp.status();
    }
}
