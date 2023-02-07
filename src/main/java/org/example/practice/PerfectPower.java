package org.example.practice;
public class PerfectPower {
    public static int[] isPerfectPower(int n) {
        int count=0;
        int[] pp=new int[(int) Math.sqrt((double) n)];
        for (int i = 0; i <(int) Math.sqrt((double) n) ; i++) {
            for (int j = 0; j <(int) Math.sqrt((double) n) ; j++) {
                if(Math.pow(i,j)==n){
                    pp[count]=i;
                    count++;
                } else if(Math.pow(i,j)<n){
                    System.out.println("try next value");
                }else break;
            }
        }
return pp;
    }

    //todo efficient method
    public static int[] isPerfectPowerEfficient(int n) {
        int logOfN = (int) Math.ceil(Math.log(n)/Math.log(2));

        for (int m = 2; m <= n/m; m++) {
            for (int k = 2; k <= logOfN; k++) {
                if (n%m == 0 && Math.pow(m, k) == n) {
                    return new int[] {m, k};
                }
            }
        }
        return null;
    }
}