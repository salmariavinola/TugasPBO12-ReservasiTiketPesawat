class FirstClassTicket extends Ticket {
    public FirstClassTicket(String passengerName, double baseFare) {
        super(passengerName, baseFare);
    }

    @Override
    public double calculateFare() {
        return baseFare * 1.5; // 50% lebih mahal untuk First Class
    }

    @Override
    public String getDetails() {
        return "Class: FirstClassTicket\nFacilities: Luxury Seat, Wi-Fi, Gourmet Meals, Lounge Access\nBaggage Limit: 40.0 kg";
    }
}
