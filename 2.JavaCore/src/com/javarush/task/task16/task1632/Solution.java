package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);
    static {
        threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
        threads.add(new Thread4());
        threads.add(new Thread5());
    }

    public static void main(String[] args) {
        new Thread1().start();
    }

    public static class Thread1 extends Thread{
        @Override
        public void run() {
            while (true) {

            }
        }
    }
    public static class Thread2 extends Thread{
        @Override
        public void run() {
            while (true){
                try {
                    Thread.sleep(0);
                } catch (InterruptedException e) {
                    System.out.println("InterruptedException");
                }
            }

        }
    }
    public static class Thread3 extends Thread{
        @Override
        public void run() {
            while (true) {
                System.out.println("Ура");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
    public static class Thread4 extends Thread implements Message{
        @Override
        public void run() {
            super.run();
        }

        @Override
        public void showWarning() {
            Thread.interrupted();
        }
    }
    public static class Thread5 extends Thread{

        @Override
        public void run() {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            int summ = 0;
            while (true){
                try {
                    String s = bufferedReader.readLine();
                    if(s.equals("N")){
                        System.out.println(summ);
                        break;
                    }
                    int num = Integer.parseInt(s);
                    summ+=num;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


        }
    }
}