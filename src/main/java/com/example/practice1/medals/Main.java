package com.example.practice1.medals;

public interface Main {
    public static void main(String[] args) {

        Employee[] employees = { new Employee("山田", 200000),
                                new Employee("海田", 220000),
                                new Employee("川田", 240000) };

        Material[] materials = { new Material("金", 10000),
                                new Material("銀", 5000),
                                new Material("銅", 1000),
                                new Material("木", 500) };
        
    }
}
