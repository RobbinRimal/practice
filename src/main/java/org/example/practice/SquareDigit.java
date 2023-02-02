package org.example.practice;

import java.util.List;

public class SquareDigit {
//todo this is not working need to work at some point of time

/*Welcome. In this kata, you are asked to square every digit of a number and concatenate them.

For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1. (81-1-1-81)

Example #2: An input of 765 will/should return 493625 because 72 is 49, 62 is 36, and 52 is 25. (49-36-35)

Note: The function accepts an integer and returns an integer.

Happy Coding!
*/
    public int squareDigits(int n) {
    char[] c=Character.toChars(n);
    int y;
    String text="";
    for (char x:c){
       y= Integer.parseInt(String.valueOf(x));
       y=y*y;
       text+=y;
    }
        return Integer.parseInt(text);
    }

}


