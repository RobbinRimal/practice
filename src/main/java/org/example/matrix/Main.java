package org.example.matrix;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Matrix.determinant(new int[][]{{1,2,3}
                                      ,{4,5,6},
                                       {7,8,9}});
        System.out.println(HighLow.highAndLow("1 2 3 4 5 6 7 8 9 0"));
        System.out.println(XO.getXO("xxx23424esdsfvxXXOOooo"));
        int [] k=ShortOdd.sortArray(new int[]{5,4,6,9,1});
        Arrays.stream(k).forEach(System.out::println);
        MixedSum.solution("hello","llo");
        System.out.println(MixedSum.findNextSquare(144L));
        HighestScoring.high("hello world ");
    }
}
