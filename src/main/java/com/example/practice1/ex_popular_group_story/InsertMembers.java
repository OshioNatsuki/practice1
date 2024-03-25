package com.example.practice1.ex_popular_group_story;

import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Connection;

public class InsertMembers {
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
                    INSERT INTO members (
                    name ,
                    birth_day ,
                    gender ,
                    color_id )
                    VALUES
                    ('大野智',  '1980-11-26', 'M', 1),
                    ('櫻井翔', '1982-12-26', 'M', 2),
                    ('相葉雅紀', '1982-12-24', 'M', 3),
                    ('二宮和也', '1983-6-17', 'M', 4),
                    ('松本潤', '1983-8-30', 'M', 5);
                    """;
            pstmt = con.prepareStatement(sql);
            int num = pstmt.executeUpdate();

            System.out.println(num + "件のレコードを追加しました");
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
