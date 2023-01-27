package org.example.practice;

public class NumberUtils {
    public static boolean isNarcissistic(int number) {
int val = 0;
        int bit =Integer.bitCount(number);
        System.out.println("bit:" +bit);
        int[] vlauses=new int[bit];
        for(int i=0;i<bit-1;i++){
            vlauses[i]=(int) number % 10;
            System.out.println(vlauses[i]);
            number=number/10;
            val = val + (int) Math.pow(vlauses[i], (bit - 1));
            System.out.println(val);
            System.out.println( "this"+(int) Math.pow(vlauses[i], (bit - 1)));
        }
    val=val-number;
        System.out.println("this is value "+val);
        return val==0?true:false;
    }
}
