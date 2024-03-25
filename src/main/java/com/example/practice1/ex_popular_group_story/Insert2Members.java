package com.example.practice1.ex_popular_group_story;

import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Connection;

public class Insert2Members {
    public static void main(String[] args) {
        String URL = "jdbc:postgresql://localhost:5432/group";
        String user = "postgres";
        String password = "postgres";

        Connection con = null;
        PreparedStatement pstmt = null;
        String sql = null;

        try {
            con = DriverManager.getConnection(URL, user, password);
            sql = """
                    UPDATE members SET 
                    name = '大野たけお',
                    birth_day = '1998-8-9',
                    gender = 'W',
                    color_id = 1
                    WHERE id = 1;
                    """;

            pstmt = con.prepareStatement(sql);
            int num = pstmt.executeUpdate();

            System.out.println(num + "件のレコードを更新しました");
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
