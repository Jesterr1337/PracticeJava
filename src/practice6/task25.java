package practice6;

public class task25 {
    private String secretCode = "Pass132";

    public boolean verifyCode(String attempt) {
        return secretCode.equals(attempt);
    }

    public static void main(String[] args) {
        task25 vault = new task25();
        // vault.secretCode = "hacked"; // Помилка компілятора: has private access
        System.out.println(vault.verifyCode("Pass123"));
    }
}

