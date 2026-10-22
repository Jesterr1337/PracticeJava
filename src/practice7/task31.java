package practice7;

public class task31 {
    private static int activeSessionsCount = 0;
    private static int tokenCounter = 1;
    public static final int MAX_SESSIONS = 3;

    private String sessionToken;
    private String hostPlayer;
    private boolean isActive;

    private task31(String host) {
        this.sessionToken = "SESSION-" + tokenCounter++;
        this.hostPlayer = host;
        this.isActive = true;
    }

    public static task31 createSession(String host) {
        if (activeSessionsCount >= MAX_SESSIONS) {
            System.out.println("Помилка: усі сервера перевантажені!");
            return null;
        }
        activeSessionsCount++;
        return new task31(host);
    }

    public void terminate() {
        if (isActive) {
            isActive = false;
            activeSessionsCount--;
            System.out.println("Сесію " + sessionToken + " завершено");
        }
    }

    public void printInfo() {
        System.out.println("Сесія " + sessionToken + ", хост: " + hostPlayer + ", активна: " + isActive);
    }

    public static void main(String[] args) {
        task31 s1 = task31.createSession("Alex");
        task31 s2 = task31.createSession("Olena");
        task31 s3 = task31.createSession("Max");
        task31 s4 = task31.createSession("Ira");

        s1.printInfo();
        s2.printInfo();
        s3.printInfo();
        System.out.println("Четверта сесія == null? " + (s4 == null));

        s1.terminate();
        task31 s5 = task31.createSession("Ira");
        if (s5 != null) {
            s5.printInfo();
        }
    }
}
