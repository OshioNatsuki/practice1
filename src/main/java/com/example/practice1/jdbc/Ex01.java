package com.example.practice1.jdbc;

import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.DriverManager;

import java.sql.Connection;

public class Ex01 {
    public static void main(String[] args) {

        String URL = "jdbc:postgresql://localhost:5432/ex-emp-management";
        String USER = "postgres";
        String PASSWORD = "postgres";

        Connection con = null;  
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql = null;

        try {
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            sql =" SELECT  id , name FROM employees";
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();
        
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            System.out.println(id + name );
        }
        }catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
}
}