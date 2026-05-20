package model;
import database.DatabaseConnection;
import database.DatabaseInitializer;
import java.sql.Connection;
import java.sql.DriverManager;
import manager.UserManager;

public class  ManveProject1{
    public static void main(String[] args) {

       //DatabaseInitializer.createTables();4
       

        //System.out.println("System Ready!");
       UserManager um = new UserManager();
        um.register("Test User", "test@gmail.com", "1234", "customer");
        System.out.println("Hello");


}
}