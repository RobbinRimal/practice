package org.example.practice;

import java.util.Arrays;


public class Kata {
    public static int[] invert(int[] array) {

        return Arrays.stream(array).map(x->x*-1).toArray();
    }

    /*If you can't sleep, just count sheep!!
Task:

Given a non-negative integer, 3 for example,
 return a string with a murmur: "1 sheep...2 sheep...3 sheep...". Input will always be valid,
  i.e. no negative integers.
*/
    public static String countingSheep(int num) {
        String x="";
        for (int i = 0; i <num ; i++) {
            x+=i+1+" sheep...";
        }
        return x;
    }
}




