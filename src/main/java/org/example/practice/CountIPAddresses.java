package org.example.practice;

import java.util.Arrays;

//todo most https://www.codewars.com/kata/52423db9add6f6fc39000354/train/java
//live cell demo todo
public class CountIPAddresses {

    public static long ipsBetween(String start, String end) {
        Long count=0L;

        int[] first=new int[4];
        System.out.println("hello ");

        int[] second=new int[4];
        int []difference=new int[4];
        String[] strings=start.split("\\.");
        System.out.println("bro");

        first= Arrays.stream(strings).mapToInt(x-> Integer.parseInt(x)).toArray();
        Arrays.stream(first).forEach(System.out::println);
        strings=end.split("\\.");
        second= Arrays.stream(strings).mapToInt(x->Integer.parseInt(x)).toArray();
        Arrays.stream(second).forEach(System.out::println);
        for (int i =second.length-1 ; i >=0 ; i--) {
            System.out.println(second[i]+" :");
            difference[i]=calculateIP(second[i],first[i] );

        }

        System.out.println("difference");
        Arrays.stream(difference).forEach(System.out::println);
        count = Long.valueOf(3*255*difference[0]+difference[1]+2*255*difference[1]+difference[2]+255*difference[2]+difference[3]);

        return count;
    }
    public  static int calculateIP(int x,int y){


        return x-y;

    }
}
