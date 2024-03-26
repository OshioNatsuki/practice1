package com.example.practice1.try_catch;

public class Ex16 {
    
    public static void main(String[] args) {
        
        Calculation calculation = new Calculation();


        try {
            System.out.println(calculation.execute(4,'+', 5));
            System.out.println(calculation.execute(8,'-', 3));
            System.out.println(calculation.execute(5,'*', 6));
            System.out.println(calculation.execute(10, '$', 0));

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
    }
}
}