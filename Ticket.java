abstract class Ticket {
    protected String passengerName;
    protected double baseFare;

    public Ticket(String passengerName, double baseFare) {
        this.passengerName = passengerName;
        this.baseFare = baseFare;
    }

    public abstract double calculateFare();

    public abstract String getDetails();

    public String getPassengerName() {
        return passengerName;
    }
}
