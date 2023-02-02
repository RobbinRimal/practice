package org.example.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class LineNumbering {
    public static List<String> number(List<String> lines) {
        List<String> stringList=new ArrayList<>();
        int fx=0;
        for (String x:lines){
            stringList.add( fx,fx+1+": "+x);
            fx++;
        }
        return stringList;


    }

// todo i love this way of doing thing

        static List<String> number1(List<String> lines) {
            if (lines.size() == 0) return lines;
            return IntStream.range(0, lines.size())
                    .mapToObj(n -> String.format("%d: %s", n+1, lines.get(n)))
                    .collect(Collectors.toList());

    }

}


