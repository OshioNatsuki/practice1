package com.example.practice1.array_list;

import java.util.ArrayList;

public class Ex20 {
    
    public static void main(String[] args) {
        
        ArrayList<Employee> employee = new ArrayList<>();
        
        employee.add(new Employee("佐藤",20));
        employee.add(new Employee("田中",45));
        employee.add(new Employee("小林",55));
        employee.add(new Employee("井上",65));

        System.out.println("３番目の従業員は" + employee.get(2).getName() + "さんです");
    }
}

