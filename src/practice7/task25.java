package practice7;

public class task25 {
    private static int nextId = 1001;

    private int id;
    private String username;
    private String email;

    public task25(String username, String email) {
        this.id = nextId++;
        this.username = username;
        this.email = email;
    }

    public static int getNextAvailableId() {
        return nextId;
    }

    public static void resetIdSequence(int startId) {
        nextId = startId;
    }

    public void printInfo() {
        System.out.println("ID: " + id + ", користувач: " + username + ", email: " + email);
    }

    public static void main(String[] args) {
        task25 u1 = new task25("alex", "alex@mail.com");
        task25 u2 = new task25("olena", "olena@mail.com");
        task25 u3 = new task25("max", "max@mail.com");
        u1.printInfo();
        u2.printInfo();
        u3.printInfo();
        System.out.println("Наступний вільний ID: " + task25.getNextAvailableId());

        task25.resetIdSequence(5000);
        task25 u4 = new task25("ira", "ira@mail.com");
        u4.printInfo();
    }
}
