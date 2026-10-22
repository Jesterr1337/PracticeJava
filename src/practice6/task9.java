package practice6;

public class task9 {
    public void sayHello() {
        System.out.println("Привіт усім!");
    }

    public void sayHelloTo(String name) {
        System.out.println("Привіт, " + name + "! Раді тебе бачити.");
    }

    public static void main(String[] args) {
        task9 greeter = new task9();
        greeter.sayHello();
        greeter.sayHelloTo("Максим");
    }
}
