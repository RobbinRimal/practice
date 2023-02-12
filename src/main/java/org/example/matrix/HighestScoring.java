package org.example.matrix;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class HighestScoring {
    public static void main(String[] args) {
        HighestScoring.high("hello this is mahendra rimal bitch");
    }
    public static String high(String s) {
        Map<Character,Integer> characterIntegerMap=new HashMap<>();
        Map<String,Integer>wordValue=new HashMap<>();
        int count=0;
        characterIntegerMap.put('a',1);
        characterIntegerMap.put('b',2);
        characterIntegerMap.put('c',3);
        characterIntegerMap.put('d',4);
        characterIntegerMap.put('e',5);
        characterIntegerMap.put('f',6);
        characterIntegerMap.put('g',7);
        characterIntegerMap.put('h',8);
        characterIntegerMap.put('i',9);
        characterIntegerMap.put('j',10);
        characterIntegerMap.put('k',11);
        characterIntegerMap.put('l',12);
        characterIntegerMap.put('m',13);
        characterIntegerMap.put('n',14);
        characterIntegerMap.put('o',15);
        characterIntegerMap.put('p',16);
        characterIntegerMap.put('q',17);
        characterIntegerMap.put('r',18);
        characterIntegerMap.put('s',19);
        characterIntegerMap.put('t',20);
        characterIntegerMap.put('u',21);
        characterIntegerMap.put('v',22);
        characterIntegerMap.put('w',23);
        characterIntegerMap.put('x',24);
        characterIntegerMap.put('y',25);
        characterIntegerMap.put('z',26);
        
        String[] list=s.split(" ");
        int [] index= new int[list.length];
        int inc=0;
        try {
            for(String k:list){
                for (int i = 0; i <k.length() ; i++) {

                    count+= (int)characterIntegerMap.get(k.charAt(i));

                }
                wordValue.put(k,count);
                index[inc]=count;
                inc++;
                count=0;

            }


            int max = wordValue.keySet().stream().map(x -> wordValue.get(x)).max(Integer::compareTo).orElse(0);
            System.out.println(Arrays.stream(index).max());
            for (int i:index){
                if(i==max){
                    break;
                }
                count++;
            }

        }catch (Exception e){e.printStackTrace();}


        return list[count];
    }

}
