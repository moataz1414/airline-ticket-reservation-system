package manager;

import database.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserManager {

    // ========================
    // REGISTER USER
    // ========================
    public void register(String name, String email, String password, String role) {

        String sql = "INSERT INTO users(name, email, password, role) VALUES (?, ?, ?, ?)";

        try (Connection conn = DatabaseConnection.connect();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, password);
            ps.setString(4, role);

            ps.executeUpdate();

            System.out.println("User Registered Successfully!");

        } catch (Exception e) {
            System.out.println("Register Error: " + e.getMessage());
        }
    }

    // ========================
    // LOGIN USER (FIXED)
    // ========================
    public String login(String email, String password) {

        String sql = "SELECT role FROM users WHERE email=? AND password=?";

        try (Connection conn = DatabaseConnection.connect();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, email);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                String role = rs.getString("role");

                System.out.println("Login Successful!");
                System.out.println("Role: " + role);

                return role; // 🔥 مهم جدًا
            }

        } catch (Exception e) {
            System.out.println("Login Error: " + e.getMessage());
        }

        System.out.println("Invalid Email or Password!");
        return null;
    }
}