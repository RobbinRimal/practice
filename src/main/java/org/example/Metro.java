package org.example;

import java.util.ArrayList;

public class Metro {
    public static int countPassengers(ArrayList<int[]> stops) {
   int in ,out;
  int sum=0;
  int diff=0;
     int  length =stops.size();

              for(int[] count: stops){
                   in = count[0];
                   out= count[1];
                   sum+=in;
                   diff+=out;
                  System.out.println("total passinger="+sum);
                  System.out.println("total passinger left="+diff);
                  System.out.println("Actual passinger in bus ="+ (sum-diff));
              }


               return sum-diff;
    }
}
