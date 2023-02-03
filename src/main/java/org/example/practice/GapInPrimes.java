package org.example.practice;

import java.util.ArrayList;
import java.util.List;

class GapInPrimes {

    public static long[] gap(int g, long m, long n) {

      int size=0,index=0;
        List<Long> pair =new ArrayList<>();
        List<Long> set =new ArrayList<>();
        for (long i =m ; i <=n ; i++) {
            if(isPrime(i)==true){
                set.add(i);

            }

        }
        size= set.size();

        for (long k:set){
            if(set.get(index + 1) - set.get(index)==g){

                pair.add(set.get(index));
                pair.add(set.get(index+1));
                index++;
            }
        }

        long[] result = new long[pair.size()];
        for (int i = 0; i <pair.size() ; i++) {
            result[i]= pair.get(i);

        }

        return result;
    }
    public static boolean isPrime(long num) {
        long   x;
        if(num<=4){
            x=num;
        }else{ x=num/2+1;}
        if(num<=1){

            return false;
        }
        for(int i=2;i<x;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
