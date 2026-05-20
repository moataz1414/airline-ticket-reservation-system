package gui;

import javax.swing.*;

/**
 * AdminDashboard represents the main control panel for the admin user.
 * 
 * It allows the admin to:
 * - Add new flights
 * - View existing flights
 * - Manage the system
 * 
 * This class demonstrates GUI design using Java Swing.
 * 
 * @author YourName
 */
public class AdminDashboard extends JFrame {

    public AdminDashboard() {

        setTitle("Admin Dashboard");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel title = new JLabel("Admin Panel");
        title.setBounds(150, 20, 200, 30);
        add(title);

        JButton addFlightBtn = new JButton("Add Flight");
        addFlightBtn.setBounds(100, 70, 200, 30);

        JButton viewFlightsBtn = new JButton("View Flights");
        viewFlightsBtn.setBounds(100, 110, 200, 30);

        JButton logoutBtn = new JButton("Logout");
        logoutBtn.setBounds(100, 150, 200, 30);

        add(addFlightBtn);
        add(viewFlightsBtn);
        add(logoutBtn);

        logoutBtn.addActionListener(e -> {
            new LoginForm();
            this.dispose();
        });

        setVisible(true);
    }
}