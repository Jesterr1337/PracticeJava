package practice7;

public class task26 {
    public static final String SERVER_NAME = "AlphaEnterprise";
    public static final int MAX_CONNECTIONS = 5;

    private static int activeConnections = 0;

    public static boolean connect() {
        if (activeConnections < MAX_CONNECTIONS) {
            activeConnections++;
            return true;
        }
        return false;
    }

    public static void disconnect() {
        if (activeConnections > 0) {
            activeConnections--;
        }
    }

    public static void printServerStatus() {
        System.out.println("Сервер " + SERVER_NAME + ": підключень " + activeConnections + "/" + MAX_CONNECTIONS
                + ", вільних слотів: " + (MAX_CONNECTIONS - activeConnections));
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            boolean ok = task26.connect();
            if (ok) {
                System.out.println("Користувач " + i + " підключився");
            } else {
                System.out.println("Користувач " + i + ": відмова, ліміт вичерпано!");
            }
        }
        task26.printServerStatus();
        task26.disconnect();
        System.out.println("Один користувач відключився");
        task26.printServerStatus();
    }
}
