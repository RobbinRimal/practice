package org.example.practice;

import java.util.Arrays;

public class FindOutlier {
    static int find(int[] integers) {
       int[] y= Arrays.stream(integers).filter(x->x%2==0).toArray();
        int[] z= Arrays.stream(integers).filter(x->x%2==0).toArray();


        return y.length==1?y[0]:z[0];
    }
}
