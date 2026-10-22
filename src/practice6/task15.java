package practice6;

public class task15 {
    int seconds;

    public void tick() {
        seconds++;
    }

    public void addSeconds(int s) {
        seconds += s;
    }

    public void displayTime() {
        int minutes = seconds / 60;
        int secs = seconds % 60;
        System.out.printf("%02d:%02d\n", minutes, secs);
    }

    public static void main(String[] args) {
        task15 sw = new task15();
        sw.addSeconds(125);
        sw.displayTime();
        sw.tick();
        sw.displayTime();
    }
}

