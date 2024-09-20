package com.java.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FetchData {
    public void display() {
       Connection con = connection.getCon();

        // Try block to catch exception/s
        try {

            // SQL command data stored in String datatype
            String sql = "select * from myinfo";
            PreparedStatement p = con.prepareStatement(sql);
          ResultSet rs = p.executeQuery();

            // Printing ID, name, email of customers
            // of the SQL command above
            System.out.println("sid|\t\tname|\t\tgender|\t\tage");
            System.out.println("___________________________________________");
            // Condition check
            while (rs.next()) {

                int id = rs.getInt("sid");
                String name = rs.getString("name");
                String gender = rs.getString("gender");
                int age = rs.getInt("age");
                System.out.println(id + "|\t\t" + name
                        + "|\t\t" + gender + "|\t\t" + age);
            }
        }

        // Catch block to handle exception
        catch (SQLException e) {

            // Print exception pop-up on screen
            System.out.println(e);
        }
    }
}
