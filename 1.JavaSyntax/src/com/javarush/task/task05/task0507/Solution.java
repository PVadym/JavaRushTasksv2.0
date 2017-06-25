package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int summ = 0;
        int count = 0;
        while (true){
            int i = scanner.nextInt();
            if(i==-1){
                break;
            }
            count++;
            summ+=i;
        }
        System.out.println((double) summ/count);
    }
}

