package FlightControl.logic;

import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.domain.Place;

import java.util.Collection;
import java.util.HashMap;

public class FlightControl {
    private final HashMap<String, Airplane> airplane;
    private final HashMap<String, Flight> flights;

    public FlightControl() {
        this.airplane = new HashMap<>();
        this.flights = new HashMap<>();
    }

    public void addAirplane(Airplane airplane) {
        this.airplane.put(airplane.getId(), airplane);
    }

    public void addFlight(Flight flight) {
        this.flights.put(flight.toString(), flight);
    }

    public Collection<Airplane> getAllAirplanes() {
        return this.airplane.values();
    }

    public Collection<Flight> getFlights() {
        return this.flights.values();
    }

    public Airplane getAirplane(String airplaneId) {
        return airplane.get(airplaneId);
    }
}