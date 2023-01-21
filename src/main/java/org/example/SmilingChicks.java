package org.example;

import java.util.List;

public class SmilingChicks {

    public static int countSmileys(List<String> arr) {
        int smile = 0;
        for (String s : arr) {
            boolean first;
            boolean second;
            boolean third;
            boolean check1, check2;
            int x = s.length();

            first = s.contains(":") || s.contains(";");
            second = s.contains("-") || s.contains("~");
            third = s.contains(")") || s.contains("D");
            if ((first || second) && third) {
                char a, b, c;
                if (x == 2) {
                    a = s.charAt(0);
                    b = s.charAt(1);
                    if (a == ';' || a == ':' && b == ')' || b == 'D') {
                        System.out.println(s);
                        smile++;
                    }
                }
                if (x == 3) {
                    a = s.charAt(0);
                    b = s.charAt(1);
                    c = s.charAt(2);
                    if (a == ';' || a == ':' && b == '-' || b == '~' && c == ')' || c == 'D') {
                        System.out.println(s);
                        smile++;
                    }

                }
                if (x > 2) System.out.println("not counting");


            }
        }

        return smile;
    }

    //best aproch
    public static int countSmiley(List<String> arr) {
        return (int) arr.stream().filter(x -> x.matches("[:;][-~]?[)D]")).count();
    }
}
