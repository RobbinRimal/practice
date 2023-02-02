package org.example.practice;

import java.util.Arrays;

class Kata2 {
    public static String getMiddle(String word) {

        return word.length() % 2 == 0 ? word.charAt(word.length() / 2 - 1) + "" + word.charAt(word.length() / 2) + "" : word.charAt(word.length() / 2) + "";
    }
/*The highest or lowest element respectively is a single element at each edge,
 even if there are more than one with the same value.

Mind the input validation.
Example

{ 6, 2, 1, 8, 10 } => 16
{ 1, 1, 11, 2, 3 } => 6
*/
    public static int sum(int[] numbers) {

        if(numbers==null){return 0;}
        return numbers.length==1?0: Arrays.stream(numbers).sum() - Arrays.stream(numbers).max().orElse(0) - Arrays.stream(numbers).min().orElse(0);
    }
}
