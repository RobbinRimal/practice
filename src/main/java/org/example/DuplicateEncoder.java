package org.example;

import java.util.Locale;

public class DuplicateEncoder {
    String text;

     String encode(String word){

         int flag =0;
         String text="";
        char[] wordchar=word.toLowerCase().toCharArray();
         System.out.println("length of wordchar "+wordchar.length);
        for (int i = 0; i <wordchar.length ; i++) {

            for (int j = 0; j < wordchar.length; j++) {
                if (i!=j) {
                    if (wordchar[i] == wordchar[j]) {
                        flag= 1;
                    }
                }
            }
            if(flag==1){
                text+=")";
            }else text+="(";
            flag=0;

        }
        return text;
    }
}
