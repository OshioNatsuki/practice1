package com.example.practice1.ex_popular_group_story;



import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Date;

public class JoinMembarsColors {

    public static void main(String[] args) {
        String URL = "jdbc:postgresql://localhost:5432/group";
        String user = "postgres";
        String password = "postgres";

        Connection con = null;
        ResultSet rs = null;
        PreparedStatement pstmt = null;
        String sql = null;

        try {
            con = DriverManager.getConnection(URL, user, password);
            sql = """
                    SELECT 
                    m.name,
                    m.birth_day,
                    m.gender,
                    c.name AS color
                    FROM members m
                    JOIN colors c
                    ON m.color_id = c.id;
                    """;
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while (rs.next()) {

                String name = rs.getString("name");
                Date birth_day = rs.getDate("birth_day");
                String geder = rs.getString("gender");
                String color = rs.getString("color");
                System.out.println(name + " " + birth_day + " " + geder + " " + color);
            }

        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
