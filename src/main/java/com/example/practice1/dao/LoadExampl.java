package com.example.practice1.dao;

public class LoadExampl {
    
    public static void main(String[] args) {
        
        EmployeeDao dao = new EmployeeDao();
        Employee employee = new Employee();
        employee.setId(100);
        employee.setName("田中");
        dao.insert(employee);
        System.out.println("データの挿入が完了しました" + employee.getId() + employee.getName());

        // Employee employee = dao.load(1);
        
        // if(employee != null){
        //     System.out.println("ID:" + employee.getId());
        //     System.out.println("名前:" + employee.getName());
        // } else {
        //     System.out.println("該当するデータはありません");
        // }
    }
}
