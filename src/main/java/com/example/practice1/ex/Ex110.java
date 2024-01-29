package com.example.practice1.ex;

public class Ex110 {
    public static void main(String[] args) {

        int[] numbers = { 5, 6, 1, 3, 9 };

        System.out.print(numbers[3]);
        System.out.println();

        for (int number : numbers) {
            System.out.print(number);
        }
        System.out.println();


        // 繰り返しを使って配列の値の５番目から１番目の順に全て表示してください
        for(int i = numbers.length -1; i >=0 ; i --){
            System.out.print(numbers[i]);
        }
        System.err.println();

        //奇数だけ表示
        for (int number : numbers) {
            if (number % 2 == 1) {
                System.out.print(number);
            }
        }
        System.out.println();


        //配列の値に偶数の値が何個あったかを表示
        
        int evenCount = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 == 0){
                evenCount++;
            }
        }
        System.out.println(evenCount);

        //最大値と最小値を表示させてください
        int max = numbers[0];
        int min = numbers[0];

        for(int i = 0; i < numbers.length; i++){
            if(max < numbers[i]){
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }

        }
        System.out.println(max + "最小値" + min);
    }
}
