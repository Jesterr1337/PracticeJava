package practice6;

public class task26 {
    private String username;
    private String password;

    public void setCredentials(String u, String p) {
        username = u;
        password = p;
    }

    public boolean login(String enteredUser, String enteredPass) {
        return username != null && username.equals(enteredUser) && password != null && password.equals(enteredPass);
    }

    public void changePassword(String oldPass, String newPass) {
        if (password != null && password.equals(oldPass)) {
            password = newPass;
        }
    }

    public static void main(String[] args) {
        task26 account = new task26();
        account.setCredentials("admin", "12345");
        System.out.println(account.login("admin", "12345"));
        account.changePassword("12345", "newPass");
    }
}
