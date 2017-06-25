package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i  = 0; i <10; i++){
            integers.add(getInteger());
        }

//          Maximal quantity of Integers in ArrayList
//        int max = Collections.frequency(integers, integers.get(0));
//        for (int i = 1; i < integers.size();i++ ){
//            int count = Collections.frequency(integers,integers.get(i));
//            if(max < count){
//                max = count;
//            }
//        }
//        System.out.println(max);

        int count = 1;
        int max = count;

        for (int i = 0; i < integers.size()-1; i++){
            if (integers.get(i) == integers.get(i+1)){
                count++;
            } else {
                count = 1;
            }
            if (max < count){
                max = count;
            }
        }
        System.out.println(max);


    }

    private static String getString() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

    private static int getInteger() throws IOException {
        int i;
        try{
            i = Integer.parseInt(getString());
        } catch (NumberFormatException e){
            i = 0;
        }
        return i;
    }
}