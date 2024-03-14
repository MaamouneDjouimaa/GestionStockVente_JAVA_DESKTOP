package Package;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo IdeaPad L340
 */
import java.sql.*;

import java.sql.Connection;
public class DBConnection {
private static DBConnection instance = null;
private Connection con;
private final String url = "jdbc:mysql://localhost:3306/gestionstockvente";
private final String user = "root";
private final String password = "";

private DBConnection() {
    try {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(url, user, password);
        System.out.println("Connection established.");
    } catch (Exception e) {
        System.out.println(e);
    }
}

public static DBConnection getInstance() {
    if(instance == null) {
        instance = new DBConnection();
    }
    return instance;
}

public Connection getConnection() {
    return con;
}
}