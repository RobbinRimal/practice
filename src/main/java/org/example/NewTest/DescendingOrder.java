package org.example.NewTest;

import java.util.Arrays;

public class DescendingOrder {
    public static void main(String[] args) {
        //System.out.println(DescendingOrder.sortDesc(12345));
//       int [] x=DescendingOrder.digitize(123456);
//       for (int k:x){
//           System.out.println(k);
//       }
        DescendingOrder.powersOfTwo(6);
    }
    public static int sortDesc( final int num) {
        String x=String.valueOf( num);
        System.out.println(num);
        StringBuilder stringBuilder=new StringBuilder();
       char[] c=x.toCharArray();
       for (char ch:c){
           System.out.println(ch);
       }
        for (int j = 9; j >=0 ; j--) {
            for (int i = 0; i <c.length ; i++) {
                System.out.println("c[i] "+c[i]+"j "+j);

            if(Integer.parseInt(String.valueOf(c[i]))== j){
                stringBuilder.append(j);
            }
            }

        }
        System.out.println(stringBuilder);
        int k=Integer.parseInt(stringBuilder.toString());


        return k;
    }

    public static int[] digitize(long n) {
      String x=String.valueOf(n);
      char c[]=x.toCharArray();
      int[] xint=new int[c.length];
      int k=0;
        for (int i = c.length-1; i >=0 ; i--) {
            System.out.println(c[i]);
            xint[k]=Integer.parseInt(String.valueOf(c[i]));
            k++;

        }
        return xint;
    }
    public static int[] minMax(int[] arr) {
        int[] maxmin=new int[2];
        maxmin[0]= Arrays.stream(arr).min().orElse(0);
        maxmin[1]=Arrays.stream(arr).max().orElse(0);
        return maxmin;
    }
    public static long[] powersOfTwo(int n){
       long[] x=new long[n+1];
        for (int i = 0; i <x.length ; i++) {
            x[i]= (long) Math.pow(2,i);
        }
        for (long xy:x){
            System.out.println(xy);
        }

        return x;
    }
}