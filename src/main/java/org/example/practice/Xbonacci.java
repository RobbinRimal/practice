package org.example.practice;

import java.util.Arrays;

public class Xbonacci {

    public double[] tribonacci(double[] s, int n) {
        if (n == 0) {
            double[] doubles = new double[0];
            return doubles;
        } else if (n > 0 && n < 3) {
            if (n == 1) return new double[]{s[0]};
            else if (n == 1) return new double[]{s[0], s[1]};
            else return s;

        }
        double tribo[] = new double[n];
        double a, b, c, x;
        a = s[0];
        b = s[1];
        c = s[2];
        tribo[0] = a;
        tribo[1] = b;
        tribo[2] = c;


        for (int i = 3; i < n; i++) {
            x = a + b + c;
            tribo[i] = x;
            a = b;
            b = c;
            c = x;
        }
        Arrays.stream(tribo).forEach(System.out::println);
        return tribo;
    }
}






