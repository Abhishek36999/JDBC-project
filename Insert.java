package com.java.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Insert {
   protected ResultSet Rs;
    public void insert() throws SQLException {
        Connection con = connection.getCon();
        System.out.println("Enter the name");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Type the Gender");
        String gender = scan.nextLine();
        System.out.println("Enter the age");
        int age = scan.nextInt();
        String query = "INSERT INTO myInfo(name,gender,age) VALUES(?,?,?)";
        PreparedStatement pstmt = con.prepareStatement(query);
        pstmt.setString(1,name);
        pstmt.setString(2,gender);
        pstmt.setInt(3,age);
        pstmt.execute();
        con.close();
    }
}
