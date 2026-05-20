package model;

/**
 * Represents a flight in the airline reservation system.
 * 
 * @author YourName
 */
public class Flight {

    // Attributes
    private int flightId;
    private String airlineName;
    private String departureCity;
    private String destinationCity;
    private String departureDate;
    private String departureTime;
    private double price;
    private int availableSeats;

    // Constructor
    public Flight(int flightId, String airlineName,
                  String departureCity, String destinationCity,
                  String departureDate, String departureTime,
                  double price, int availableSeats) {

        this.flightId = flightId;
        this.airlineName = airlineName;
        this.departureCity = departureCity;
        this.destinationCity = destinationCity;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.price = price;
        this.availableSeats = availableSeats;
    }

    // Getters and Setters

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    // Method to display flight information
    public void displayFlightInfo() {

        System.out.println("Flight Information:");
        System.out.println("Flight ID: " + flightId);
        System.out.println("Airline Name: " + airlineName);
        System.out.println("Departure City: " + departureCity);
        System.out.println("Destination City: " + destinationCity);
        System.out.println("Departure Date: " + departureDate);
        System.out.println("Departure Time: " + departureTime);
        System.out.println("Price: $" + price);
        System.out.println("Available Seats: " + availableSeats);
    }
}