class EconomyTicket extends Ticket {
    public EconomyTicket(String passengerName, double baseFare) {
        super(passengerName, baseFare);
    }

    @Override
    public double calculateFare() {
        return baseFare * 0.9; // Diskon 10% untuk Ekonomi
    }

    @Override
    public String getDetails() {
        return "Class: EconomyTicket\nFacilities: Standard Seat, No Wi-Fi\nBaggage Limit: 20.0 kg";
    }
}
