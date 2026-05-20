package model;

/**
 * Represents an admin in the airline reservation system.
 * 
 * @author YourName
 */
public class Admin extends Person {

    // Constructor
    public Admin(int id, String name, String email, String password) {

        super(id, name, email, password);
    }

    // Admin methods

    public void addFlight() {
        System.out.println("Flight added successfully.");
    }

    public void deleteFlight() {
        System.out.println("Flight deleted successfully.");
    }

    public void updateFlight() {
        System.out.println("Flight updated successfully.");
    }

    // Overriding abstract method
    @Override
    public void displayInfo() {

        System.out.println("Admin Information:");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
    }
}