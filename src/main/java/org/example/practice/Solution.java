package org.example.practice;

import java.util.Arrays;
public class Solution {
    public static int zeros(int n) {
        if(n==0) return 0;
        int count=0;
        long factorial = 1;
        for (int i = 1; i <=n; i++) {
            factorial*=i;


        }
        System.out.println("hello"+factorial);
        char[] c=Long.toString(factorial).toCharArray();

        for (int i = c.length; i >0 ; i--) {
            if(c[i-1]=='0'){
                count++;
            }else break;

        }
        return count;
    }
}

