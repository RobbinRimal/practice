package org.example.practice;

import java.util.Arrays;

public class Persist {
    public static int x=0;
    public static int persistence(long n) {
        System.out.println("this is the value "+n);
        if(n<=9) return x;
        int table=1;
        char[] xk=String.valueOf(n).toCharArray();
        for (char k:xk){
            table*=Integer.valueOf(String.valueOf(k));
        }
        x++;

        return persistence(table);
    }
}
