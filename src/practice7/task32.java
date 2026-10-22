package practice7;

public class task32 {
    public static final double G = 9.80665;
    public static final double SPEED_OF_LIGHT = 299792458.0;

    private task32() {
    }

    public static double freeFallDistance(double seconds) {
        return G * seconds * seconds / 2;
    }

    public static double kineticEnergy(double massKg, double velocityMs) {
        return massKg * velocityMs * velocityMs / 2;
    }

    public static double restEnergy(double massKg) {
        return massKg * SPEED_OF_LIGHT * SPEED_OF_LIGHT;
    }

    public static void main(String[] args) {
        System.out.println("Енергія спокою 1 грама матерії: " + task32.restEnergy(0.001) + " Дж");
        System.out.println("Відстань падіння за 5 секунд: " + task32.freeFallDistance(5) + " м");
        System.out.println("Кінетична енергія (1000 кг, 20 м/с): " + task32.kineticEnergy(1000, 20) + " Дж");
    }
}
