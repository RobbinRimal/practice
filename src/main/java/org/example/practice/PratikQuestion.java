package org.example.practice;



public class PratikQuestion {
    public static void main(String[] args) {
        System.out.println(PratikQuestion.checkArray(new int[]{4,5,6,7},new int[]{5,7}));
        System.out.println(PratikQuestion.checkArray(new int[]{4,5,6,7,8,9},new int[]{1,2,3,5,5,7}));
        System.out.println(PratikQuestion.checkArray(new int[]{4,5,6,7},new int[]{5,7}));
        System.out.println(PratikQuestion.checkArray(new int[]{1,2,3,4,5,6,4,5,6,7,8,9},new int[]{1,2,3,5,5,7}));
    }
    public static String checkArray(int[] x,int[] y){
        int count=0;
        int min=0;
        int sizex=x.length;
        int sizey=y.length;

        if(sizex<=sizey){
            for (int i = 0; i <sizex ; i++) {
                for (int j = 0; j <sizey ; j++) {
                    if(x[i]==y[j]){
                    count++;
                    }

                }

            }
        }else {
            for (int i = 0; i <sizey ; i++) {
                for (int j = 0; j <sizex ; j++) {
                    if(x[j]==y[i]){
                        count++;
                    }

                }

            }
        }
        min = Math.min(sizex,sizey);

        return min==count? "array is equal":"array are not equal";
    }

}
