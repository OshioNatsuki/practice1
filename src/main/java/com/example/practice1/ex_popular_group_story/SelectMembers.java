package com.example.practice1.ex_popular_group_story;

import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Date;

public class SelectMembers {

    public static void main(String[] args) {

        String URL = "jdbc:postgresql://localhost:5432/group";
        String user = "postgres";
        String password = "postgres";

        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql = null;

        try {
            con = DriverManager.getConnection(URL, user, password);
            sql = "SELECT * FROM members";
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                String name = rs.getString("name");
                Date birth_day = rs.getDate("birth_day");
                String genber = rs.getString("gender");
                int color_id = rs.getInt("color_id");
                System.out.println(name + " " + birth_day + " " + genber + " " + color_id);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                }
                if (pstmt != null) {
                    try {
                        pstmt.close();
                    } catch (SQLException e) {
                    }
                    if (rs != null) {
                        try {
                            rs.close();
                        } catch (SQLException e) {
                        }
                    }
                }
            }
        }
    }
}
