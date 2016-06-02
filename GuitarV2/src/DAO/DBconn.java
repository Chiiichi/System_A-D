package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconn {

    static Connection conn;


    public static Connection getConnection() {
        Connection conn = null;
        try {
        	Class.forName("org.sqlite.JDBC");
             
        	conn = DriverManager.getConnection("jdbc:sqlite://C:/sqlite/GuitarDB.db");
        	System.out.println("database connection successfully");
             
        } catch (Exception e) {
            System.out.println("error" + e.getMessage());
        }
        return conn;
        
    }
    public static void main(String[] args) {
		getConnection();
	}

}
