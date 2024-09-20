package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection {
    static Connection con;
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctesting","root","");
            System.out.println("Connection Established Successfully!");
        }
        catch(SQLException e){
            System.out.println("Connection Failed");
            e.printStackTrace();
        }
        return con;
    }
}
