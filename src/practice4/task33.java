package practice4;

public class task33 {
    public static void main(String[] args) {
        for (int i = 0; i <= 50; i++) {
            int percent = (int) (((double) i / 50) * 100);
            System.out.println("Завантажено: " + percent + "%");
        }
    }
}
