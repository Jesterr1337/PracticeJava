package practice7;

public class task9 {
    private String login;
    private String email;
    private String role;
    private boolean isActive;

    // майстер-конструктор
    public task9(String login, String email, String role, boolean isActive) {
        this.login = login;
        this.email = email;
        this.role = role;
        this.isActive = isActive;
    }

    public task9(String login, String email) {
        this(login, email, "USER", true);
    }

    public task9(String login) {
        this(login, login + "@domain.com");
    }

    public task9() {
        this("guest");
    }

    public void printProfile() {
        System.out.println("Логін: " + login + ", email: " + email + ", роль: " + role + ", активний: " + isActive);
    }

    public static void main(String[] args) {
        task9 u1 = new task9("admin", "admin@site.com", "ADMIN", true);
        task9 u2 = new task9("alex", "alex@mail.com");
        task9 u3 = new task9("olena");
        task9 u4 = new task9();
        u1.printProfile();
        u2.printProfile();
        u3.printProfile();
        u4.printProfile();
    }
}
