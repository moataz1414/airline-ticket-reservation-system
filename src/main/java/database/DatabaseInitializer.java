package database;

import java.sql.Connection;
import java.sql.Statement;

/**
 * Creates all database tables.
 */
public class DatabaseInitializer {

    public static void createTables() {

        Connection conn = DatabaseConnection.connect();

        try {
            Statement stmt = conn.createStatement();

            // USERS TABLE
            String users = """
                CREATE TABLE IF NOT EXISTS users (
                    id INTEGER PRIMARY KEY AUTOINCREMENT,
                    name TEXT NOT NULL,
                    email TEXT UNIQUE,
                    password TEXT,
                    role TEXT
                );
            """;

            // FLIGHTS TABLE
            String flights = """
                CREATE TABLE IF NOT EXISTS flights (
                    flight_id INTEGER PRIMARY KEY AUTOINCREMENT,
                    airline_name TEXT,
                    departure_city TEXT,
                    destination_city TEXT,
                    departure_date TEXT,
                    departure_time TEXT,
                    price REAL,
                    available_seats INTEGER
                );
            """;

            // RESERVATIONS TABLE
            String reservations = """
                CREATE TABLE IF NOT EXISTS reservations (
                    reservation_id INTEGER PRIMARY KEY AUTOINCREMENT,
                    reservation_date TEXT,
                    reservation_status TEXT,
                    customer_id INTEGER,
                    flight_id INTEGER
                );
            """;

            // TICKETS TABLE
            String tickets = """
                CREATE TABLE IF NOT EXISTS tickets (
                    ticket_id INTEGER PRIMARY KEY AUTOINCREMENT,
                    ticket_number TEXT,
                    seat_number TEXT,
                    booking_date TEXT,
                    reservation_id INTEGER
                );
            """;

            // EXECUTE
            stmt.execute(users);
            stmt.execute(flights);
            stmt.execute(reservations);
            stmt.execute(tickets);

            System.out.println("Tables created successfully!");

        } catch (Exception e) {
            System.out.println("Error creating tables: " + e.getMessage());
        }
    }
}