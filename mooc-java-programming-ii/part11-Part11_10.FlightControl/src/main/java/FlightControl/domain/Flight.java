package FlightControl.domain;

public class Flight {
    private final String airplaneId;
    private final Place departure;
    private final Place target;

    public Flight(String airplaneId, Place departure, Place target) {
        this.airplaneId = airplaneId;
        this.departure = departure;
        this.target = target;
    }

    public String getAirplaneId() {
        return airplaneId;
    }

    public String getDestination() {
        return departure.getAirport();
    }

    public String getTarget() {
        return target.getAirport();
    }

    // This is needed to ensure uniqueness of keyValue of flights HashMap
    @Override
    public String toString() {
        return airplaneId + departure + target;
    }
}