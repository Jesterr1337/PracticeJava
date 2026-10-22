package practice7;

public class task36 {
    private String title;
    private Processor cpu;
    private Memory ram;
    private double casePrice;

    public task36(String title, Processor cpu, Memory ram, double casePrice) {
        this.title = title;
        this.cpu = cpu;
        this.ram = ram;
        this.casePrice = casePrice;
    }

    public double calculateTotalPrice() {
        return cpu.getPrice() + ram.getPrice() + casePrice;
    }

    public void upgradeMemory(Memory newRam) {
        System.out.println("Апгрейд пам'яті: " + ram.getSizeGB() + " GB -> " + newRam.getSizeGB() + " GB");
        this.ram = newRam;
    }

    public void printSpecs() {
        System.out.println("ПК \"" + title + "\": процесор " + cpu.getModel() + " (" + cpu.getFrequencyGHz()
                + " GHz), пам'ять " + ram.getSizeGB() + " GB (" + ram.getFrequencyMHz() + " MHz), корпус "
                + casePrice + " грн");
    }

    public static void main(String[] args) {
        Processor cpu = new Processor("Intel Core i7", 3.6, 12000);
        Memory ram16 = new Memory(16, 3200, 2500);
        task36 pc = new task36("Gaming PC", cpu, ram16, 3000);

        pc.printSpecs();
        System.out.println("Ціна комп'ютера: " + pc.calculateTotalPrice() + " грн");

        Memory ram32 = new Memory(32, 3600, 5000);
        pc.upgradeMemory(ram32);
        pc.printSpecs();
        System.out.println("Нова ціна комп'ютера: " + pc.calculateTotalPrice() + " грн");
    }

    static class Processor {
        private String model;
        private double frequencyGHz;
        private double price;

        public Processor(String model, double frequencyGHz, double price) {
            this.model = model;
            this.frequencyGHz = frequencyGHz;
            this.price = price;
        }

        public String getModel() {
            return model;
        }

        public double getFrequencyGHz() {
            return frequencyGHz;
        }

        public double getPrice() {
            return price;
        }
    }

    static class Memory {
        private int sizeGB;
        private int frequencyMHz;
        private double price;

        public Memory(int sizeGB, int frequencyMHz, double price) {
            this.sizeGB = sizeGB;
            this.frequencyMHz = frequencyMHz;
            this.price = price;
        }

        public int getSizeGB() {
            return sizeGB;
        }

        public int getFrequencyMHz() {
            return frequencyMHz;
        }

        public double getPrice() {
            return price;
        }
    }
}
