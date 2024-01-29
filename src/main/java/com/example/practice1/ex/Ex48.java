package com.example.practice1.ex;
/**
 * 演習４８
 */
public class Ex48 {

    
    static int amount(int count){
        
        int num = 0;
        for (int i = 1; i <= count; i++){
            num = num + i;
        }
        int result = num;
        return result;
    }

    public static void main(String[] args) {
        
        int amount = amount(10);
        System.out.println(amount);
    }
}
