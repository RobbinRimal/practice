package org.example.matrix;

import java.util.Arrays;

/*Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive. The string can contain any char.

Examples input/output:

XO("ooxx") => true
XO("xooxx") => false
XO("ooxXm") => true
XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
XO("zzoo") => false

*/
public class XO {
    public static boolean getXO(String str) {
        System.out.println(str);
        int count = 0;
        char[] string = str.toLowerCase().toCharArray();
        for (char c : string) {
            if (c == 'x') count++;
            if (c == 'o') count--;
        }
        return count == 0 ? true : false;
    }
}

