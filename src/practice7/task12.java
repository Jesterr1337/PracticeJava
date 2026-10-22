package practice7;

public class task12 {
    private int brightness;
    private int colorTemp;
    private boolean isOn;

    public task12(int brightness, int colorTemp, boolean isOn) {
        if (brightness < 0) {
            brightness = 0;
        } else if (brightness > 100) {
            brightness = 100;
        }
        if (colorTemp < 2700) {
            colorTemp = 2700;
        } else if (colorTemp > 6500) {
            colorTemp = 6500;
        }
        this.brightness = brightness;
        this.colorTemp = colorTemp;
        this.isOn = isOn;
    }

    public task12(int brightness) {
        this(brightness, 4000, true);
    }

    public task12() {
        this(50);
    }

    public void printStatus() {
        System.out.println("Лампочка: " + (isOn ? "увімкнена" : "вимкнена") + ", яскравість: " + brightness
                + "%, температура: " + colorTemp + " K");
    }

    public static void main(String[] args) {
        task12 b1 = new task12(80, 3000, false);
        task12 b2 = new task12(70);
        task12 b3 = new task12();
        task12 b4 = new task12(150, 9000, true);
        b1.printStatus();
        b2.printStatus();
        b3.printStatus();
        b4.printStatus();
    }
}
