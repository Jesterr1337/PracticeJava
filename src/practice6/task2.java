package practice6;

public class task2 {
    String brand;
    String model;
    int year;
    int speed;

    public static void main(String[] args) {
        task2 car1 = new task2();
        task2 car2 = new task2();

        car1.brand = "Toyota";
        car1.model = "Camry";
        car1.year = 2021;
        car1.speed = 180;

        car2.brand = "BMW";
        car2.model = "M5";
        car2.year = 2023;
        car2.speed = 250;

        System.out.println(car1.brand + " " + car1.model + ", " + car1.year + ", " + car1.speed);
        System.out.println(car2.brand + " " + car2.model + ", " + car2.year + ", " + car2.speed);

        if (car1.year > car2.year) {
            System.out.println("Автомобіль 1 новіший");
        } else if (car2.year > car1.year) {
            System.out.println("Автомобіль 2 новіший");
        } else {
            System.out.println("Роки випуску однакові");
        }
    }
}