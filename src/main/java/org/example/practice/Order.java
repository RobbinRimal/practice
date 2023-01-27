package org.example.practice;

import java.util.Arrays;

/*Your task is to sort a given string. Each word in the string will contain a single number. This number is the position the word should have in the result.

Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).

If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.*/


/*Eaxmples:
*
* Your task is to sort a given string. Each word in the string will contain a single number. This number is the position the word should have in the result.

Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).

If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.
* */
public class Order {

    public static String order(String words) {
    String message="";
        int j=1;
       String[] word=words.split(" ");
         String[] orderedString=new String[word.length];

       for(String x:word){
           for(String y: word){
               if(y.contains(String.valueOf(j))){
                orderedString[j-1]+=y;
                   System.out.println(y);

               }

           }

           j++;
       }
       for(String k: orderedString){
           String h="";
           h=k;
           message=message+ h+" ";
       }
       return  message.replace("null","").trim();
    }
}
