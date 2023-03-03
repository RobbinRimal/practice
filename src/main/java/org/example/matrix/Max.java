package org.example.matrix;

public class Max {
    public static void main(String[] args) {
Max.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4} );


    }
    public static int sequence(int[] arr) {
        int max=0;
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length ; j++) {
                sum+=arr[j];
                max=Integer.max(sum,max);
                System.out.println(max);
            }
            sum=0;



        }
        System.out.println(max);
        return max;
    }
}
