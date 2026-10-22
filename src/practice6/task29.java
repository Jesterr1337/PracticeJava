package practice6;

public class task29 {
    private int speed = 0;

    public void accelerate(int delta) {
        speed += delta;
        if (speed > 240) {
            speed = 240;
        }
    }

    public void brake(int delta) {
        speed -= delta;
        if (speed < 0) {
            speed = 0;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public static void main(String[] args) {
        task29 car = new task29();
        car.accelerate(200);
        car.accelerate(100);
        System.out.println("Швидкість після розгону: " + car.getSpeed());
        car.brake(300);
        System.out.println("Швидкість після гальмування: " + car.getSpeed());
    }
}
