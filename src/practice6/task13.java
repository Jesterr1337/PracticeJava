package practice6;

public class task13 {
    String nickname;
    int health = 100;

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
            System.out.println(nickname + " загинув!");
        }
    }

    public void heal(int amount) {
        health += amount;
        if (health > 100) {
            health = 100;
        }
    }

    public static void main(String[] args) {
        task13 player = new task13();
        player.nickname = "Satanic";
        player.takeDamage(40);
        player.heal(20);
        player.takeDamage(90);
    }
}
