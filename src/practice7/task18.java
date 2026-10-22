package practice7;

public class task18 {
    public void print(String message) {
        System.out.println(message);
    }

    public void print(int number) {
        System.out.println("[INT]: " + number);
    }

    public void print(double number, int decimals) {
        System.out.println(String.format("%." + decimals + "f", number));
    }

    public void print(String[] lines) {
        for (int i = 0; i < lines.length; i++) {
            System.out.println((i + 1) + ". " + lines[i]);
        }
    }

    public void print(String message, boolean uppercase) {
        if (uppercase) {
            System.out.println(message.toUpperCase());
        } else {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        task18 p = new task18();
        p.print("Звичайне повідомлення");
        p.print(123);
        p.print(3.14159265, 3);
        p.print(new String[]{"Перший рядок", "Другий рядок", "Третій рядок"});
        p.print("великими літерами", true);
        p.print("не великими літерами", false);
    }
}
