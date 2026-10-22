package practice7;

public class task37 {
    private String name;
    private int health;
    private int attackPower;
    private int defense;

    public task37(String name, int health, int attackPower, int defense) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.defense = defense;
    }

    public void attack(task37 target) {
        int damage = this.attackPower - target.defense;
        if (damage <= 0) {
            damage = 1;
        }
        target.health -= damage;
        if (target.health < 0) {
            target.health = 0;
        }
        System.out.println(this.name + " б'є " + target.name + " на " + damage + " шкоди. У " + target.name
                + " залишилось " + target.health + " HP");
    }

    public boolean isAlive() {
        return this.health > 0;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        task37 knight = new task37("Лицар", 120, 25, 8);
        task37 orc = new task37("Орк", 150, 20, 5);

        int round = 1;
        while (knight.isAlive() && orc.isAlive()) {
            System.out.println("--- Раунд " + round + " ---");
            knight.attack(orc);
            if (orc.isAlive()) {
                orc.attack(knight);
            }
            round++;
        }

        if (knight.isAlive()) {
            System.out.println("Переможець: " + knight.getName());
        } else {
            System.out.println("Переможець: " + orc.getName());
        }
    }
}
