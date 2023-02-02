package org.example.practice;

public class PrimeCounter {
    public int countPrimes(String number) {
        int count =0;
        char[] x=number.toCharArray();
        String k="";
        for (int i = 0; i < number.length(); i++) {
            for (int k1 = 1; k1 <number.length() ; k1++) {
                for (int j = 0; j <=i ; j++) {
                    System.out.println("value of "+j);
                    k+=x[j];

                }

            }
            System.out.println(k);
           int l= Integer.parseInt(k.trim());
           k="";
            if(isPrime(l)==true){
                System.out.println("prime number");
                count++;
            }


        }
   return count;
    }

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


