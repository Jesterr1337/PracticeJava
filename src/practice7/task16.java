package practice7;

public class task16 {
    private String ticketNumber;
    private String passengerName;
    private String flightNumber;
    private String departureCity;
    private String arrivalCity;
    private String seatNumber;
    private boolean hasBaggage;

    public task16(String ticketNumber, String passengerName, String flightNumber, String departureCity,
                        String arrivalCity, String seatNumber, boolean hasBaggage) {
        this.ticketNumber = ticketNumber;
        this.passengerName = passengerName;
        this.flightNumber = flightNumber;
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.seatNumber = seatNumber;
        this.hasBaggage = hasBaggage;
    }

    public task16(String ticketNumber, String passengerName, String flightNumber, String departureCity,
                        String arrivalCity) {
        this(ticketNumber, passengerName, flightNumber, departureCity, arrivalCity, "UNASSIGNED", false);
    }

    public void assignSeat(String seat) {
        this.seatNumber = seat;
    }

    public void printBoardingPass() {
        System.out.println("======= ПОСАДКОВИЙ ТАЛОН =======");
        System.out.println("Квиток: " + ticketNumber);
        System.out.println("Пасажир: " + passengerName);
        System.out.println("Рейс: " + flightNumber + " (" + departureCity + " -> " + arrivalCity + ")");
        System.out.println("Місце: " + seatNumber);
        System.out.println("Багаж: " + (hasBaggage ? "є" : "немає"));
        System.out.println("================================");
    }

    public static void main(String[] args) {
        task16 t = new task16("TK-0001", "Іван Петренко", "PS-101", "Київ", "Варшава");
        t.printBoardingPass();
        t.assignSeat("14C");
        t.printBoardingPass();
    }
}
