package model;
import interfaces.ReservationOperations;
/**
 * Represents a customer in the airline reservation system.
 * 
 * @author YourName
 */
public class Customer extends Person
        implements ReservationOperations{

    // Attributes
    private String passportNumber;
    private String phone;

    // Constructor
    public Customer(int id, String name, String email, String password,
                    String passportNumber, String phone) {

        super(id, name, email, password);

        this.passportNumber = passportNumber;
        this.phone = phone;
    }

    // Getters and Setters

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // Overriding abstract method
    @Override
    public void displayInfo() {

        System.out.println("Customer Information:");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("Passport Number: " + passportNumber);
        System.out.println("Phone: " + phone);
    }
    
    
        @Override
    public void reserveFlight() {

        System.out.println("Flight reserved successfully.");
    }

    @Override
    public void cancelReservation() {
        
        System.out.println("Reservation cancelled successfully.");
    }
}