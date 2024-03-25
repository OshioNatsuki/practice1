package com.example.practice1.dao;

import java.sql.Connection;
import java.sql.SQLException;

public class DriverManager {
    
    private final static String URL = "jdbc:postgresql://localhost:5432/ex-emp-management";
    private final static String USER = "postgres";
    private final static String PASSWORD = "postgres";

    public static Connection openConnection(){
        try {
            Connection con = java.sql.DriverManager.getConnection(URL, USER, PASSWORD);
            return con;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("データベースに接続できませんでした");
        }
    }

    public static void closeConnection(Connection con){
        try {
            if(con != null){
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("データベースとの接続を閉じることができませんでした");
        }
    }
}
