package practice7;

public class task21 {
    public int find(int[] arr, int target) {
        return find(arr, target, 0);
    }

    public int find(int[] arr, int target, int startIndex) {
        for (int i = startIndex; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public int find(String[] arr, String target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public int find(String[] arr, String target, boolean ignoreCase) {
        for (int i = 0; i < arr.length; i++) {
            if (ignoreCase) {
                if (arr[i].equalsIgnoreCase(target)) {
                    return i;
                }
            } else if (arr[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        task21 s = new task21();
        int[] nums = {5, 8, 3, 8, 10, 8};
        String[] words = {"apple", "Banana", "cherry"};

        System.out.println("Перша 8: " + s.find(nums, 8));
        System.out.println("8 починаючи з індексу 2: " + s.find(nums, 8, 2));
        System.out.println("Число 99: " + s.find(nums, 99));
        System.out.println("\"cherry\": " + s.find(words, "cherry"));
        System.out.println("\"banana\" з урахуванням регістру: " + s.find(words, "banana"));
        System.out.println("\"banana\" без урахування регістру: " + s.find(words, "banana", true));
    }
}
