package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(StringSplit.solution("helloworld"));
        DuplicateEncoder duplicateEncoder= new DuplicateEncoder();
       String x= duplicateEncoder.encode("Success");
        System.out.println(x);
        Solution.camelCase("MahendRArimal");
        System.out.println( Solution.whoLikesIt("A","B","C"));
         String orderString =   SplitingTheShit.order("t3his si2s t1he pud4kon o5f wor6ld");
        System.out.println(orderString);
    }

    public static class StringSplit {
        public static String[] solution(String s) {
            char[] c= s.toCharArray();
            int length=s.length();
            System.out.println("length of character array "+length);
            int x=0;
            int arraylength;
            if(length%2==0){
                arraylength=length/2;
                System.out.println("length of arraylength"+arraylength);

            }else{
                arraylength=length/2 +1;
                System.out.println("length of arraylength"+arraylength);
            }
            String[] splitdata=new String[arraylength];
            for (int i=0;i<length;i++){

               if(i%2==0){
                   splitdata[x]=String.valueOf(c[i]);
               }else {
                   splitdata[x]+=String.valueOf(c[i]);
                   x++;
               }




            }
            if(length%2!=0){
                splitdata[arraylength-1]+="_";
            }
          return splitdata;
        }
    }
}