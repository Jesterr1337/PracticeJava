package practice6;

public class task11 {
    int count;

    public void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }

    public void reset() {
        count = 0;
    }

    public void printCount() {
        System.out.println("Поточне значення: " + count);
    }

    public static void main(String[] args) {
        task11 counter = new task11();
        counter.increment();
        counter.increment();
        counter.increment();
        counter.decrement();
        counter.printCount();
    }
}
