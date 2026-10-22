package practice6;

public class task36 {
    private double[] dailyTemps;

    public void setTemps(double[] temps) {
        dailyTemps = temps;
    }

    public int countDaysAbove(double threshold) {
        if (dailyTemps == null) return 0;
        int count = 0;
        for (double t : dailyTemps) {
            if (t > threshold) {
                count++;
            }
        }
        return count;
    }

    public void printWeeklyReport() {
        if (dailyTemps == null || dailyTemps.length == 0) return;
        double max = dailyTemps[0];
        int maxDay = 1;

        System.out.println("Температури по днях:");
        for (int i = 0; i < dailyTemps.length; i++) {
            System.out.println("День " + (i + 1) + ": " + dailyTemps[i] + "°C");
            if (dailyTemps[i] > max) {
                max = dailyTemps[i];
                maxDay = i + 1;
            }
        }
        System.out.println("Наййтепліший день тижня: День " + maxDay + " (" + max + "°C)");
    }

    public static void main(String[] args) {
        task36 tracker = new task36();
        double[] temps = {18.5, 22.0, 19.5, 25.0, 24.0, 21.5, 20.0};
        tracker.setTemps(temps);
        tracker.printWeeklyReport();
        System.out.println("Кількість днів вище 21°C: " + tracker.countDaysAbove(21.0));
    }
}
