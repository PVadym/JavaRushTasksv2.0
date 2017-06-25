package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++){
            map.put(Integer.toString(i),random.nextInt(10)*100);
        }
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            int value = iterator.next().getValue();
            if( value < 500){
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {


    }
}