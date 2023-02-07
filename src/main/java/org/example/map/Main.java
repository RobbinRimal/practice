package org.example.map;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Person> rawList=new ArrayList<>();
        PersonMap citizenMap=new PersonMap();
        Person p0=new Person();
        Person p1=new Person();
        Person p2=new Person();
        Person p3=new Person();
        Person p4=new Person();
        Person p5=new Person();
        Person p6=new Person();


        p0.setNationalID(12345L);
        p0.setNationality("Nepali");
        p0.setFristName("Mahendra");
        p0.setLastName("Rimal");

        p1.setNationalID(12346L);
        p1.setNationality("Indian");
        p1.setFristName("Badri");
        p1.setLastName("Singh");

        p2.setNationalID(12347L);
        p2.setNationality("Nepali");
        p2.setFristName("Roshan");
        p2.setLastName("Rimal");

        p3.setNationalID(12348L);
        p3.setNationality("Nepali");
        p3.setFristName("Krishna Prasad ");
        p3.setLastName("Rimal");

        p4.setNationalID(12349L);
        p4.setNationality("Universal");
        p4.setFristName("Lord");
        p4.setLastName("Shiva");

        p5.setNationalID(12340L);
        p5.setNationality("China");
        p5.setFristName("Shree Krishna");
        p5.setLastName("Bashu Dev!");

        p6.setNationalID(12345L);
        p6.setNationality("Nepali");
        p6.setFristName("Mahendra");
        p6.setLastName("Rimal");



        rawList.add(p0);
        rawList.add(p1);
        rawList.add(p2);
        rawList.add(p3);
        rawList.add(p4);
        rawList.add(p5);
        rawList.add(p6);
int count =1;
        List<Person> people = citizenMap.removeDuplicate(rawList);
        Map<String, List<Person>> listByNationality = citizenMap.mapByNationality(people);
        for (String country:listByNationality.keySet()){
            System.out.println("Country: "+country);
            System.out.println(count++);

            for (Person p:listByNationality.get(country)){
                System.out.println("National ID: "+p.getNationalID());
                System.out.println("First Name: "+p.getFristName());
                System.out.println("Last Name: "+p.getLastName());
            }
        }


    }
}
