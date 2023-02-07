package org.example.map;

import java.util.*;
import java.util.stream.Collectors;

public class PersonMap {
    public Map<String, List<Person>> mapByNationality(List<Person> data){

        Map<String,List<Person>> personMap=new HashMap<>();
        String nationality;
        try {
            for (Person x:data){
                nationality=x.getNationality();
                List<Person> citizen=personMap.getOrDefault(nationality,new ArrayList<>());
                citizen.add(x);
                personMap.put(nationality,citizen);
            }

        } catch (Exception e){e.printStackTrace();}

        return personMap;
    }
    public  List<Person> removeDuplicate(List<Person> personList){
        return personList.stream().distinct().collect(Collectors.toList());
    }
}
