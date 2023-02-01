package org.example.practice;

public class FindOdd {
    public static int findOddNumber(int[] array) {
        int result = 0;

        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                result = array[i];
            }
        }

        return result;
    }
}
