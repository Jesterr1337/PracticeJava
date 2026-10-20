package practice3;

public class task32 {
    public static void main(String[] args) {

        boolean isPinCorrect = true;
        boolean isCardActive = true;
        boolean hasSufficientBalance = true;
        boolean isDailyLimitExceeded = false;

        boolean isTransactionAllowed = isPinCorrect && isCardActive && hasSufficientBalance && !isDailyLimitExceeded;

        if (isTransactionAllowed) {
            System.out.println("Транзакція дозволена!");
        } else {
            System.out.println("Транзакція відхилена!");
        }
    }
}
