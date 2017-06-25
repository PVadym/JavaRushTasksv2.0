package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        int array [] = new int[15];
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            for (int i = 0; i < array.length; i++){
                array[i] = Integer.parseInt(br.readLine());
            }
        }
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < array.length; i++){
            if(i%2 == 0){
                sumEven+=array[i];
            }else{
                sumOdd+=array[i];
            }
        }

        System.out.println(compare(sumEven,sumOdd));

    }

    public static String compare(int a, int b){
        String even = "В домах с четными номерами проживает больше жителей.";
        String odd = "В домах с нечетными номерами проживает больше жителей.";

        return a > b ? even:odd;
    }
}
