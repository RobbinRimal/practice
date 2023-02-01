package org.example.practice;


import java.util.Arrays;

public class Main1 {

        public static void main(String[] args) {
     //Order.order("1this 3is a4 world2");
          String[] x=  BuildTower.towerBuilder(5);
          for (String j:x){
              System.out.println(j);
          }
            System.out.println(SecureTest.alphanumeric("thisis7avalidstatementiguess87"));
    int[] k=        TenMinuteWalk.countPositivesSumNegatives(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15});
            System.out.println(k[0]+" ,"+k[1]);
            TenMinuteWalk.reverseWords("Mahendra  is");
            System.out.println(StringOrdor.order("this2 is1 a3 number4"));
            System.out.println("persist output");
            System.out.println(Persist.persistence(999));
            System.out.println();
            System.out.println();
            System.out.println(FakeBinary.fakeBin("12398765"));
            System.out.println(BouncingBall.bouncingBall(3,.66,1.5));

            System.out.println(SmallestIntegerFinder.findSmallestInt(new int[]{4,67,56,34}));
        }

    }
