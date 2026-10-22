package practice6;

public class task30 {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        }
    }

    public void printSummary() {
        System.out.println("Ім'я: " + name + ", Вік: " + age);
    }

    public static void main(String[] args) {
        task30 person1 = new task30();
        person1.setName("Іван");
        person1.setAge(25);
        person1.printSummary();

        task30 person2 = new task30();
        person2.setName("Олена");
        person2.setAge(30);
        person2.printSummary();
    }
}
