package org.example.matrix;

public class Reverse {
    public static void main(String[] args) {
        Reverse.solution("mahendra");
    }

    public static String solution(String str) {
        int x= str.length();
    String string="";
        for (int i = x-1; i >=0 ; i--) {
           string+= str.charAt(i);
            System.out.println(str.charAt(i));

        }
        return string;
    }

    public static boolean isSquare(int n) {


        return Math.pow((int) Math.sqrt(n),2) == n ? true : false;
    }
    static Integer find(final int[] array) {
        for (int i = 0; i < array.length ; i++) {
            if (i< array.length-1){
                if (array[i]+1!=array[i+1]){
                    return array[i+1];
                }
            }

        }
        return null;
    }
    public static String makeComplement(String dna) {
        String s="";
        for(char c:dna.toCharArray()){
            if(c=='A') s+="T";
            else if(c=='T') s+="A";
            else if(c=='C') s+="G";
            else if(c=='G') s+="C";
            else s+=c;

        }
        return s;
    }
    public int GetSum(int a, int b)

                {


                    int c=0;
                    for (int i = Integer.min(a,b); i <=Integer.max(a,b) ; i++) {
                        c+=i;
                    }
        return c;
            }
}
