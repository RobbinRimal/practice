package org.example.matrix;
public class BasicOperations
{
    public static Integer basicMath(String op, int v1, int v2)
    {
        switch (op){
            case "+":
                return v1+v2;

            case "-":
                return v1-v2;
            case "*":
                return v1*v2;
            case "/":
                return v1/v2;
        }

        return 0;
    }
}
/*Build a pyramid-shaped tower, as an array/list of strings, given a positive integer number of floors. A tower block is represented with "*" character.

For example, a tower with 3 floors looks like this:

[
  "  *  ",
  " *** ",
  "*****"
]

And a tower with 6 floors looks like this:

[
  "     *     ",
  "    ***    ",
  "   *****   ",
  "  *******  ",
  " ********* ",
  "***********"
]
*/
class TowerBuilder {

        public static String[] TowerBuilder(int n) {
        String t[] = new String[n], e;

        for (int i = 0; i < n; i++)
            t[i] = (e = " ".repeat(n-i-1)) + "*".repeat(i+i+1) + e;

        return t;
    }
    }
