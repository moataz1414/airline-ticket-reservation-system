package model;

/**
 * Represents a ticket in the airline reservation system.
 * 
 * @author YourName
 */
public class Ticket {

    // Attributes
    private int ticketId;
    private String ticketNumber;
    private String seatNumber;
    private String bookingDate;

    // Relationship
    private Reservation reservation;

    // Constructor
    public Ticket(int ticketId,
                  String ticketNumber,
                  String seatNumber,
                  String bookingDate,
                  Reservation reservation) {

        this.ticketId = ticketId;
        this.ticketNumber = ticketNumber;
        this.seatNumber = seatNumber;
        this.bookingDate = bookingDate;
        this.reservation = reservation;
    }

    // Getters and Setters

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    // Method to display ticket information
    public void displayTicketInfo() {

        System.out.println("Ticket Information:");
        System.out.println("Ticket ID: " + ticketId);
        System.out.println("Ticket Number: " + ticketNumber);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Booking Date: " + bookingDate);

        System.out.println("\nCustomer Name: "
                + reservation.getCustomer().getName());

        System.out.println("Flight From: "
                + reservation.getFlight().getDepartureCity());

        System.out.println("Flight To: "
                + reservation.getFlight().getDestinationCity());
    }
}