package practice7;

public class task35 {
    private String brand;
    private String model;
    private Engine engine;

    public task35(String brand, String model, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
    }

    public void startCar() {
        this.engine.start();
        System.out.println(brand + " готовий до руху!");
    }

    public void turnOff() {
        this.engine.stop();
    }

    public void printSpecs() {
        System.out.println(brand + " " + model + ", потужність двигуна: " + engine.getHorsePower()
                + " к.с., двигун працює: " + engine.isRunning());
    }

    public static void main(String[] args) {
        Engine engine = new Engine("ENG-777", 250);
        task35 car = new task35("Audi", "A6", engine);
        car.printSpecs();
        car.startCar();
        car.printSpecs();
        car.turnOff();
        car.printSpecs();
    }

    static class Engine {
        private String serialNumber;
        private int horsePower;
        private boolean isRunning;

        public Engine(String serialNumber, int horsePower) {
            this.serialNumber = serialNumber;
            this.horsePower = horsePower;
            this.isRunning = false;
        }

        public void start() {
            isRunning = true;
            System.out.println("Двигун " + serialNumber + " запущено");
        }

        public void stop() {
            isRunning = false;
            System.out.println("Двигун " + serialNumber + " зупинено");
        }

        public boolean isRunning() {
            return isRunning;
        }

        public int getHorsePower() {
            return horsePower;
        }
    }
}
