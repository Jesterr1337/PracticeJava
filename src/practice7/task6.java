package practice7;

public class task6 {
    private int hours;
    private int minutes;
    private int seconds;

    public task6(int hours, int minutes, int seconds) {
        this.hours = (hours >= 0 && hours <= 23) ? hours : 0;
        this.minutes = (minutes >= 0 && minutes <= 59) ? minutes : 0;
        this.seconds = (seconds >= 0 && seconds <= 59) ? seconds : 0;
    }

    public void tick() {
        seconds++;
        if (seconds == 60) {
            seconds = 0;
            minutes++;
            if (minutes == 60) {
                minutes = 0;
                hours++;
                if (hours == 24) {
                    hours = 0;
                }
            }
        }
    }

    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    public String toStandardString() {
        int h = hours % 12;
        if (h == 0) {
            h = 12;
        }
        String suffix = hours < 12 ? "AM" : "PM";
        return String.format("%d:%02d:%02d %s", h, minutes, seconds, suffix);
    }

    public static void main(String[] args) {
        task6 t = new task6(23, 59, 57);
        for (int i = 0; i < 6; i++) {
            System.out.println(t.toUniversalString() + "  |  " + t.toStandardString());
            t.tick();
        }
        task6 t2 = new task6(11, 59, 58);
        for (int i = 0; i < 4; i++) {
            System.out.println(t2.toUniversalString() + "  |  " + t2.toStandardString());
            t2.tick();
        }
        task6 bad = new task6(30, 70, 99);
        System.out.println("Некоректний час: " + bad.toUniversalString());
    }
}
