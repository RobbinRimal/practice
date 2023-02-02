package org.example.practice;

import java.util.List;

public class PrimeNo {
    public static boolean isPrime(int num) {
      int   x;
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
