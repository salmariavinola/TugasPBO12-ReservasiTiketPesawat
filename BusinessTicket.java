class BusinessTicket extends Ticket {
    public BusinessTicket(String passengerName, double baseFare) {
        super(passengerName, baseFare);
    }

    @Override
    public double calculateFare() {
        return baseFare * 1.25; // 25% lebih mahal untuk Bisnis
    }

    @Override
    public String getDetails() {
        return "Class: BusinessTicket\nFacilities: Reclining Seat, Wi-Fi, Priority Check-in\nBaggage Limit: 30.0 kg";
    }
}
