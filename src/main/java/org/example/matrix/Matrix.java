package org.example.matrix;
/*
* https://www.codewars.com/kata/52a382ee44408cea2500074c/train/java
*

Write a function that accepts a square matrix (N x N 2D array) and returns the determinant of the matrix.

How to take the determinant of a matrix -- it is simplest to start with the smallest cases:

A 1x1 matrix |a| has determinant a.

A 2x2 matrix [ [a, b], [c, d] ] or

|a  b|
|c  d|

has determinant: a*d - b*c.

The determinant of an n x n sized matrix is calculated by reducing the problem to the calculation of the determinants of n matrices ofn-1 x n-1 size.

For the 3x3 case, [ [a, b, c], [d, e, f], [g, h, i] ] or

|a b c|
|d e f|
|g h i|

the determinant is: a * det(a_minor) - b * det(b_minor) + c * det(c_minor) where det(a_minor) refers to taking the determinant of the 2x2 matrix created by crossing out the row and column in which the element a occurs:

|- - -|
|- e f|
|- h i|

Note the alternation of signs.

The determinant of larger matrices are calculated analogously, e.g. if M is a 4x4 matrix with first row [a, b, c, d], then:

det(M) = a * det(a_minor) - b * det(b_minor) + c * det(c_minor) - d * det(d_minor)
Matrix
Linear Algebra
Mathematics
Recursion
Algorithms
*/

public class Matrix {
    public static int determinant(int[][] matrix) {
        int  p,q;
        p=0;
        q=0;
        System.out.println("size of matrix:"+matrix.length);

        if (matrix.length == 1) {
            return matrix[0][0];
        }

        else if (matrix.length == 2) {
            return (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
        }


        int x=matrix.length;
        String k="hello work";
        int countx=0,county=0;
        for (int m = 0; m <matrix.length ; m++) {


            for (int i = 0; i < x; i++) {
                int[][] next = new int[x - 1][x - 1];
                for (int j = 0; j < x; j++) {
                    if (p != i && q != j) {
                        next[countx][county] = matrix[i][j];
                        System.out.println(next[countx][county] + "selected value");
                        county++;
                        county = county % matrix.length - 1;
                        if (county == matrix.length) {
                            countx++;
                            county = 0;
                        }

                    }


                }
                System.out.println("hello");


            }

        }

        switch (x){
            case 3:

        }

        return 0;
    }

}
