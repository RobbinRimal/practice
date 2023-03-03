package org.example.matrix;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ProdFib {
    public static void main(String[] args) {
        long[] longs = ProdFib.productFib(800);
        Arrays.stream(longs).forEach(System.out::println);

    }
    public static long[] productFib(long prod) {
        boolean isProductfib=false;
        long multi=0l;
        long first=0;
        long second=1;
        long third;
        while(prod>multi){
            third=first+second;
            first=second;
            second=third;
            multi=first*second;
            if(multi==prod) {
                isProductfib=true;
                break;
            }

        }
        long x =isProductfib?1l:0l;
        return new long[]{first,second,x};
    }


}
