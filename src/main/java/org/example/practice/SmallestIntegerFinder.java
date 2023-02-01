package org.example.practice;

import java.util.Arrays;

public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
       int x= Arrays.stream(args).min().orElse(0);
       return  x;
    }
}




