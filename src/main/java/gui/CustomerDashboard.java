package gui;

import javax.swing.*;

/**
 * CustomerDashboard represents the main interface for customers.
 * 
 * It allows customers to:
 * - Search for flights
 * - View their reservations
 * - Manage bookings
 * 
 * @author YourName
 */
public class CustomerDashboard extends JFrame {

    public CustomerDashboard() {

        setTitle("Customer Dashboard");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel title = new JLabel("Customer Panel");
        title.setBounds(140, 20, 200, 30);
        add(title);

        JButton searchFlightsBtn = new JButton("Search Flights");
        searchFlightsBtn.setBounds(100, 70, 200, 30);

        JButton myBookingsBtn = new JButton("My Reservations");
        myBookingsBtn.setBounds(100, 110, 200, 30);

        JButton logoutBtn = new JButton("Logout");
        logoutBtn.setBounds(100, 150, 200, 30);

        add(searchFlightsBtn);
        add(myBookingsBtn);
        add(logoutBtn);

        logoutBtn.addActionListener(e -> {
            new LoginForm();
            this.dispose();
        });

        setVisible(true);
    }
}