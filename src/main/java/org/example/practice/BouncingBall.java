package org.example.practice;

import java.util.Arrays;
import java.util.OptionalInt;

public class BouncingBall {
    static int x=1;
    public static int bouncingBall(double h, double bounce, double window) {
        if(window>=h) return 0;
        double reflex=0;
        reflex=h*bounce;
        if(reflex>=window){
            if(reflex==window){
                x++;
            }
            x+=2;
            bouncingBall(reflex,bounce,window);
        }
        return x;
    }
}





