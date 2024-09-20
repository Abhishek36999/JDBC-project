package com.java.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Deletion {
    public void delete(int sid) throws SQLException {
        Connection con = connection.getCon();
        String query = "DELETE FROM myInfo WHERE sid = ?";
        PreparedStatement pstmt = con.prepareStatement(query);
        pstmt.setInt(1,sid);
        pstmt.execute();
        con.close();
    }
}
