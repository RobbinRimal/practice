package org.example.practice;

import java.util.Arrays;

public class StringOrdor {
    public static String order(String words) {
        String[] word;
        String text="";
        word = words.split(" ");
        String[] orderedString=new String[word.length];
    for(String x:word){
    for(int y=0;y<= word.length;y++){
        if(x.contains(String.valueOf(y))){
            orderedString[y-1]=x;
        }

    }
    }
for(String g:orderedString){
    text+=g+" ";
}
        return text.trim();
    }
    public static double sum(double[] numbers) {
        if(numbers==null) return 0;
        double num=0;
        for(double x:numbers){
            num+=x;
        }
        return num;
    }
    public String dnaToRna(String dna) {
      String convert="";
        char[] rna=dna.toCharArray();
        for (int i = 0; i < rna.length ; i++) {
            if(rna[i]=='T'){
                rna[i]='U';
            }

        }
        for(char x:rna){
            convert+=x;
        }
        return convert;  // Do your magic!
    }
}
