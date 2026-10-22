package practice6;

public class task23 {
    public String formatTitle(String text) {
        return "*** " + text.toUpperCase() + " ***";
    }

    public int countVowels(String text) {
        String uaVowels = "аеєиіїоуюяАЕЄИІЇОУЮЯ";
        String enVowels = "aeiouAEIOU";
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (uaVowels.indexOf(c) != -1 || enVowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        task23 formatter = new task23();
        String word = "Програмування";
        System.out.println(formatter.formatTitle(word));
        System.out.println("Кількість голосних: " + formatter.countVowels(word));
    }
}
