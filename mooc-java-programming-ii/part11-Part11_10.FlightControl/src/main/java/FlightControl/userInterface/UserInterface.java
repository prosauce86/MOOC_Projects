package FlightControl.userInterface;

import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.domain.Place;
import FlightControl.logic.FlightControl;

import java.util.Scanner;

public class UserInterface {
    private final Scanner scanner;
    private final FlightControl flightControl;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.flightControl = new FlightControl();

    }

    public void startAssetControl() {

        while (true) {
            System.out.println("Choose an action");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");

            String action = scanner.nextLine();
            if (action.equalsIgnoreCase("x")) break;

            if (action.equals("1")) {
                addAirplane();
            } else if (action.equals("2")) {
                addFlight();
            }
        }
    }

    public void startFlightControl() {

        while (true) {
            System.out.println("Choose an action: ");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");

            String action = scanner.nextLine();
            if (action.equalsIgnoreCase("x")) break;

            if (Integer.parseInt(action) == 1) {
                printAirplanes();
            } else if (Integer.parseInt(action) == 2) {
                printFlights();
            } else if (Integer.parseInt(action) == 3) {
                System.out.print("Give the airplane id: ");
                String airplane = scanner.nextLine();
                System.out.println(printDetails(airplane));
            }
        }
    }

    public void addAirplane() {
        System.out.print("Give the airplane id: ");
        String id = scanner.nextLine();
        System.out.print("Give the airplane capacity: ");
        int capacity = Integer.parseInt(scanner.nextLine());
        flightControl.addAirplane(new Airplane(id, capacity));
    }

    public void addFlight() {
        System.out.print("Give the airplane id: ");
        String id = scanner.nextLine();
        System.out.print("Give the departure airport id: ");
        String departure = scanner.nextLine();
        System.out.print("Give the target airport id: ");
        String target = scanner.nextLine();
        flightControl.addFlight(new Flight(id, new Place(departure), new Place(target)));
    }

    public void printAirplanes() {
        for (Airplane a: flightControl.getAllAirplanes()) {
            System.out.println(a);
        }
    }

    public void printFlights() {
        for (Flight f : flightControl.getFlights()) {
            System.out.println(printDetails(f.getAirplaneId()) + " (" + f.getDestination() + "-" + f.getTarget() + ")");
        }
    }

    public Airplane printDetails(String airplaneId) {
        return flightControl.getAirplane(airplaneId);
    }
}