package com.adv.util2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbConnection11 {
    public static Connection getConnection(){
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/userdb";
        String username = "root";
        String password = "root";
        try {
            con = DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection11.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
}
