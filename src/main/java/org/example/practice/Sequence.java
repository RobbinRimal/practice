package org.example.practice;

public class Sequence {

    public static int[] reverse(int n) {
        //your code
        int[] res = new int[n];
        for (int i = 0; i < n; i++)
            res[i] = n - i;
        return res;
    }

}
