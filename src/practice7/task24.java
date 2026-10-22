package practice7;

import java.util.Arrays;

public class task24 {
    public int[] filter(int[] arr, int threshold) {
        int count = 0;
        for (int x : arr) {
            if (x > threshold) {
                count++;
            }
        }
        int[] result = new int[count];
        int k = 0;
        for (int x : arr) {
            if (x > threshold) {
                result[k++] = x;
            }
        }
        return result;
    }

    public int[] filter(int[] arr, int min, int max) {
        int count = 0;
        for (int x : arr) {
            if (x >= min && x <= max) {
                count++;
            }
        }
        int[] result = new int[count];
        int k = 0;
        for (int x : arr) {
            if (x >= min && x <= max) {
                result[k++] = x;
            }
        }
        return result;
    }

    public int[] filter(int[] arr, boolean keepEvens) {
        int count = 0;
        for (int x : arr) {
            if ((x % 2 == 0) == keepEvens) {
                count++;
            }
        }
        int[] result = new int[count];
        int k = 0;
        for (int x : arr) {
            if ((x % 2 == 0) == keepEvens) {
                result[k++] = x;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        task24 f = new task24();
        int[] data = {12, 5, 8, 19, 24, 3, 16};
        System.out.println("Вихідний масив: " + Arrays.toString(data));
        System.out.println("Більші за 10: " + Arrays.toString(f.filter(data, 10)));
        System.out.println("У діапазоні [5; 16]: " + Arrays.toString(f.filter(data, 5, 16)));
        System.out.println("Парні: " + Arrays.toString(f.filter(data, true)));
        System.out.println("Непарні: " + Arrays.toString(f.filter(data, false)));
    }
}
