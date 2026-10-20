package practice3;

public class task28 {
    public static void main(String[] args) {
        int counterA = 0;
        int counterB = 0;

        boolean test1 = true || (++counterA > 0);
        boolean test2 = true | (++counterB > 0);

        System.out.println("counterA: " + counterA);
        System.out.println("counterB: " + counterB);
    }
}