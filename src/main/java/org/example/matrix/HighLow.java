package org.example.matrix;

import java.util.Arrays;

public class HighLow {

        public static String highAndLow(String numbers) {
           String[] x=numbers.split(" ");
           int[] list= Arrays.stream(x).mapToInt(y->Integer.parseInt(y)).toArray();
           String maxmin= Arrays.stream(list).max().orElse(0)+" ";
           maxmin+= Arrays.stream(list).min().orElse(0);
           return maxmin;
        }
}
