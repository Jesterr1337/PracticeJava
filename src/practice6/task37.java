package practice6;

public class task37 {
    private int[] data;

    public void setData(int[] data) {
        this.data = data;
    }

    public boolean contains(int target) {
        if (data == null) return false;
        for (int val : data) {
            if (val == target) {
                return true;
            }
        }
        return false;
    }

    public int findIndex(int target) {
        if (data == null) return -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        task37 searcher = new task37();
        searcher.setData(new int[]{5, 12, 23, 42, 55});

        System.out.println("Містить 42: " + searcher.contains(42));
        System.out.println("Індекс числа 42: " + searcher.findIndex(42));
        System.out.println("Містить 99: " + searcher.contains(99));
        System.out.println("Індекс числа 99: " + searcher.findIndex(99));
    }
}
