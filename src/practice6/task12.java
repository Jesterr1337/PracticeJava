package practice6;

public class task12 {
    String currentColor;

    public void changeColor(String newColor) {
        currentColor = newColor;
    }

    public void showSignal() {
        if ("Червоний".equals(currentColor)) {
            System.out.println("Стій!");
        } else if ("Жовтий".equals(currentColor)) {
            System.out.println("Увага!");
        } else if ("Зелений".equals(currentColor)) {
            System.out.println("Їдь!");
        }
    }

    public static void main(String[] args) {
        task12 light = new task12();
        light.changeColor("Червоний");
        light.showSignal();
        light.changeColor("Жовтий");
        light.showSignal();
        light.changeColor("Зелений");
        light.showSignal();
    }
}
