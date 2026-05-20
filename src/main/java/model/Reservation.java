package model;

/**
 * Represents a reservation in the airline reservation system.
 * 
 * @author YourName
 */
public class Reservation {

    // Attributes
    private int reservationId;
    private String reservationDate;
    private String reservationStatus;

    // Relationships
    private Customer customer;
    private Flight flight;

    // Constructor
    public Reservation(int reservationId,
                       String reservationDate,
                       String reservationStatus,
                       Customer customer,
                       Flight flight) {

        this.reservationId = reservationId;
        this.reservationDate = reservationDate;
        this.reservationStatus = reservationStatus;
        this.customer = customer;
        this.flight = flight;
    }

    // Getters and Setters

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public String getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(String reservationDate) {
        this.reservationDate = reservationDate;
    }

    public String getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(String reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    // Method to display reservation information
    public void displayReservationInfo() {

        System.out.println("Reservation Information:");
        System.out.println("Reservation ID: " + reservationId);
        System.out.println("Reservation Date: " + reservationDate);
        System.out.println("Reservation Status: " + reservationStatus);

        System.out.println("Customer Name: "
                + customer.getName());

        System.out.println("Flight From: "
                + flight.getDepartureCity());

        System.out.println("Flight To: "
                + flight.getDestinationCity());
    }
}