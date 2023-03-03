package org.example.NewTest;

public class Dividor {
    public static void main(String[] args) {
        Dividor dividor=new Dividor();
        long l = dividor.numberOfDivisors(4);
        System.out.println(l);
    }

    public long numberOfDivisors(int n) {
        if(n==1) return 1L;
        long count=0;
        for (int i = 2; i <=n/2 ; i++) {
            if(n%i==0) count++;

        }
        return count+2;
    }
}
