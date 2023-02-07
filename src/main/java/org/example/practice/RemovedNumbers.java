package org.example.practice;

import java.util.ArrayList;
import java.util.List;

public class RemovedNumbers {
    public static void main(String[] args) {
        System.out.println(RemovedNumbers.removNb(6));
    }
    public static List<long[]> removNb(long n) {

        int count =0;
        List<long[]> list=new ArrayList<>();
        long sum =(n*(n+1))/2;
        System.out.println(sum);
            for(long i =1;i<=n;i++){
            for (long j = 1; j <=n ; j++) {

                if( (sum-i-j)==(i*j)) {
                    System.out.println("function");
                    long[] data = new long[]{i, j};
                    list.add(data);
                }


            }
        }
            return list;
    }
}
