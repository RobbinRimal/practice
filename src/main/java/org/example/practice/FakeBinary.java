package org.example.practice;

import java.util.Arrays;

public class FakeBinary {
    public static String fakeBin(String numberString) {
        System.out.println(numberString);
        StringBuilder stringBuilder=new StringBuilder();

        char c[]=numberString.toCharArray();
        for (int i = 0; i <c.length ; i++) {
            System.out.println(c[i]);
            if(Integer.parseInt(String.valueOf(c[i]))<=4){
                stringBuilder.append("0");
            }else    {             stringBuilder.append("1");
            }

        }
        return stringBuilder.toString();
    }
}
