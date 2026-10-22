package practice7;

public class task30 {
    private task30() {
    }

    public static boolean isPalindrome(String s) {
        String clean = s.replace(" ", "").toLowerCase();
        int left = 0;
        int right = clean.length() - 1;
        while (left < right) {
            if (clean.charAt(left) != clean.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static String reverse(String s) {
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result += s.charAt(i);
        }
        return result;
    }

    public static int countVowels(String s) {
        String vowels = "aeiouyаеєиіїоуюяAEIOUYАЕЄИІЇОУЮЯ";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }

    public static String maskCardNumber(String cardNumber) {
        int totalDigits = 0;
        for (int i = 0; i < cardNumber.length(); i++) {
            if (Character.isDigit(cardNumber.charAt(i))) {
                totalDigits++;
            }
        }
        String result = "";
        int seen = 0;
        for (int i = 0; i < cardNumber.length(); i++) {
            char ch = cardNumber.charAt(i);
            if (Character.isDigit(ch)) {
                seen++;
                if (seen <= totalDigits - 4) {
                    result += '*';
                } else {
                    result += ch;
                }
            } else {
                result += ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("\"А роза упала на лапу Азора\" паліндром? " + task30.isPalindrome("А роза упала на лапу Азора"));
        System.out.println("\"Hello\" паліндром? " + task30.isPalindrome("Hello"));
        System.out.println("Реверс \"Java\": " + task30.reverse("Java"));
        System.out.println("Голосних у \"Programming\": " + task30.countVowels("Programming"));
        System.out.println("Голосних у \"Привіт світе\": " + task30.countVowels("Привіт світе"));
        System.out.println("Картка: " + task30.maskCardNumber("1234 5678 9012 3456"));
    }
}
