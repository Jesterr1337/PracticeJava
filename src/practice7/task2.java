package practice7;

public class task2 {
    private String name;
    private int age;
    private double gpa;

    public task2(String name, int age, double gpa) {
        this.name = name;
        if (age < 15 || age > 80) {
            this.age = 18;
        } else {
            this.age = age;
        }
        if (gpa < 0.0 || gpa > 5.0) {
            this.gpa = 0.0;
        } else {
            this.gpa = gpa;
        }
    }

    public boolean isHonorStudent() {
        return gpa >= 4.5;
    }

    public void printStudent() {
        String status = isHonorStudent() ? "Відмінник" : "Звичайний студент";
        System.out.println("Студент: " + name + ", вік: " + age + ", середній бал: " + gpa + " -> " + status);
    }

    public static void main(String[] args) {
        task2 s1 = new task2("Олена", 19, 4.8);
        task2 s2 = new task2("Максим", 20, 3.7);
        task2 s3 = new task2("Помилковий", 120, 7.5);
        s1.printStudent();
        s2.printStudent();
        s3.printStudent();
    }
}
