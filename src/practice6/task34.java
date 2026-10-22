package practice6;

public class task34 {
    private int[] numbers;

    public void setNumbers(int[] nums) {
        numbers = nums;
    }

    public int countEvens() {
        if (numbers == null) return 0;
        int count = 0;
        for (int n : numbers) {
            if (n % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public int countOdds() {
        if (numbers == null) return 0;
        int count = 0;
        for (int n : numbers) {
            if (n % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public int calculateSum() {
        if (numbers == null) return 0;
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        return sum;
    }

    public static void main(String[] args) {
        task34 stats = new task34();
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        stats.setNumbers(nums);
        System.out.println("Кількість парних: " + stats.countEvens());
        System.out.println("Кількість непарних: " + stats.countOdds());
        System.out.println("Сума елементів: " + stats.calculateSum());
    }
}
