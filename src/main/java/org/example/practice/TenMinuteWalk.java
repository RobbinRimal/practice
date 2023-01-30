package org.example.practice;

import java.util.Arrays;

public class TenMinuteWalk {
    /*You live in the city of Cartesia where all roads are laid out in a perfect grid.
     You arrived ten minutes too early to an appointment, so you decided to take the opportunity
      to go for a short walk. The city provides its citizens with a Walk Generating App on their phones
       -- everytime you press the button it sends you an array of one-letter strings representing directions
        to walk (eg. ['n', 's', 'w', 'e']). You always walk only a single block for each letter (direction)
        and you know it takes you one minute to traverse one city block, so create a function that will
        return true if the walk the app gives you will take you exactly ten minutes (you don't want to be
        early or late!) and will, of course, return you to your starting point. Return false otherwise.

     */


    public static boolean isValid(char[] walk) {
      int time=  walk.length;
      int east=0,west=0,north=0,shouth=0;
      if(time!=10){
          return false;
      }

      for(char c :walk){
          switch (c){
              case 'e':
                  east++;
                  break;
              case 'w':
                  west++;
                  break;
              case 'n':
                  north++;
                  break;
              case 's':
                  shouth++;
                  break;
          }

      }
      if(east==west && north==shouth){
          return true;
      }else

        return false;
}

    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int k = 0;
        for (int x : classPoints) {
            k += x;
        }
        boolean g = (k / classPoints.length) > yourPoints ? false : true;
        return g;
    }
    static boolean betterThanAverageBestVerson(final int[] classPoints, final int yourPoints) {
        return Arrays.stream(classPoints).average().orElse(0) < yourPoints;
    }
}



