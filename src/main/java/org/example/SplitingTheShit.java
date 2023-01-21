package org.example;

import java.util.Arrays;
import java.util.Comparator;

public class SplitingTheShit {
    public static String order(String words) {
        if(words.equals("")) return "";
        String[] wordsArray = words.split(" ");
//       wordsArray[0].contains()
        String message="";
        for(int i=1;i<10;i++){
            for (String s:wordsArray){
                if(s.contains(String.valueOf(i))){
                    message+=s+" ";
                }
            }
        }

        return message.trim();
    }
}
