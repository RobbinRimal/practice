package org.example.matrix;
import java.util.List;
//*Given an array of integers as strings and numbers, return the sum of the array values as if all were numbers.
//
//Return your answer as a number.*/

public class MixedSum {

    /*
     * Assume input will be only of Integer o String type
     */
    public int sum(List<?> mixed) {
        int total = 0;
        for (Object element : mixed) {
            if (element instanceof Integer) {
                total += (Integer) element;
            } else if (element instanceof String) {
                total += Integer.parseInt((String) element);
            }
        }
        return total;

    }
    public static boolean solution(String str, String ending) {


        return str.endsWith(ending)?true:false;
    }
    /*ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.

If the function is passed a valid PIN string, return true, else return false.
Examples (Input --> Output)

"1234"   -->  true
"12345"  -->  false
"a234"   -->  false

**/
    public static boolean validatePin(String pin) {
        return pin.matches("^[0-9]{4}$|^[0-9]{6}$");
    }


    public static long findNextSquare(long sq) {

        return Math.pow((long)Math.sqrt(sq),2)==sq?(long) Math.pow((long) Math.sqrt(sq)+1,2):-1;
    }
    public static String reverseWords(final String original)
    {StringBuilder sb = new StringBuilder();
        String[] words = original.split(" ");
        for (String word : words) {
            sb.append(new StringBuilder(word).reverse());

        }
        return sb.toString();
    }
}