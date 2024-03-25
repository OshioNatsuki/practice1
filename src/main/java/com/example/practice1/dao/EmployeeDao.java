package com.example.practice1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDao {

    public Employee load (int id){
        Connection con = DriverManager.openConnection();

        String SQL =" SELECT id, name FROM employees WHERE id = ?";

        try {
            PreparedStatement pstmt = con.prepareStatement(SQL);
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            

            Employee employee = new Employee();

            if(rs.next()){
                employee.setId(rs.getInt("id"));
                employee.setName(rs.getString("name"));
                return employee;
            }   return null;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("データベースの接続に失敗しました!");
        } finally {
            DriverManager.closeConnection(con);
        }
    }

   public int insert(Employee  employee){
        Connection con = DriverManager.openConnection();

        String SQL = "INSERT INTO employees (id, name) VALUES (?, ?)";

        try {
            PreparedStatement pstmt = con.prepareStatement(SQL);
            pstmt.setInt(1, employee.getId());
            pstmt.setString(2, employee.getName());
            int result = pstmt.executeUpdate();
            return result;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("データベースの接続に失敗しました!");
        } finally {
            DriverManager.closeConnection(con);
        }
}
}
