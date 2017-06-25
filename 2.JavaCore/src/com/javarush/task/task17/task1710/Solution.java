package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут

        if(args[0].equals("-c")){
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            Date date = format.parse(args[3]);
            if(args[2].equals("м")){
                allPeople.add(Person.createMale(args[1],date));
            }
            if(args[2].equals("ж")){
                allPeople.add(Person.createFemale(args[1],date));
            }
            System.out.println(allPeople.size()-1);

        }
        if(args[0].equals("-u")){
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            Date date = format.parse(args[4]);
            int index = Integer.parseInt(args[1]);
            Person person = allPeople.get(index);
            person.setName(args[2]);
            person.setBirthDay(date);
            Sex sex = args[3].equals("м")?Sex.MALE:Sex.FEMALE;
            person.setSex(sex);
            allPeople.set(index,person);

        }
        if(args[0].equals("-d")){
            int index = Integer.parseInt(args[1]);
            Person person = allPeople.get(index);
            person.setName(null);
            person.setSex(null);
            person.setBirthDay(null);
            allPeople.set(index,person);

        }
        if(args[0].equals("-i")){
            int index = Integer.parseInt(args[1]);
            Person person = allPeople.get(index);
            SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yyyy",Locale.ENGLISH);
            String sex = person.getSex()==Sex.MALE?"м":"ж";
            System.out.println(person.getName() + " " + sex + " " +format.format(person.getBirthDay()));
        }


    }
}
