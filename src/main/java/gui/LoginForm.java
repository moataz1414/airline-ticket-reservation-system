package gui;

import manager.UserManager;
import javax.swing.*;


/**
 * LoginForm is the entry point of the system.
 * 
 * It allows users (Admin or Customer) to:
 * - Enter email and password
 * - Authenticate with the database
 * - Redirect to the correct dashboard
 * 
 * @author YourName
 */

public class LoginForm extends JFrame {

    private JTextField emailField;
    private JPasswordField passwordField;
    private JButton loginBtn;

    public LoginForm() {

        setTitle("Airline Login");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(20, 20, 80, 25);
        add(emailLabel);

        emailField = new JTextField();
        emailField.setBounds(100, 20, 200, 25);
        add(emailField);

        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(20, 60, 80, 25);
        add(passLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(100, 60, 200, 25);
        add(passwordField);

        loginBtn = new JButton("Login");
        loginBtn.setBounds(100, 100, 100, 30);
        add(loginBtn);

        loginBtn.addActionListener(e -> login());

        setVisible(true);
    }

    private void login() {

    String email = emailField.getText().trim();
    String password = new String(passwordField.getPassword()).trim();

    UserManager um = new UserManager();

    String role = um.login(email, password);

    if (role != null) {

        JOptionPane.showMessageDialog(this, "Login Successful!");

        if (role.equals("admin")) {
            new gui.AdminDashboard();
        } else {
            new gui.CustomerDashboard();
        }

        this.dispose();

    } else {
        JOptionPane.showMessageDialog(this, "Invalid Login!");
    }
}

    public static void main(String[] args) {
        new LoginForm();
    }
}