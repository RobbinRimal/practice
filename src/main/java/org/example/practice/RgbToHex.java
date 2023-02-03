package org.example.practice;

import java.util.HashMap;

/*
* this class will convert the rgb  in decimal value to hex value */

public class RgbToHex {
    public static String rgb(int r, int g, int b) {
        r = r < 0 ? 0 : r;
        r = r > 255 ? 255 : r;
        g = g < 0 ? 0 : g;
        g = g > 255 ? 255 : g;
        b = b < 0 ? 0 : b;
        b = b > 255 ? 255 : b;
        String color = "";
       color+=getHax(r);
       color+=getHax(g);
       color+=getHax(b);
       return color.strip();
    }
    public static String getHax(int r) {
        String color = "";
        int reminder = 1;
        int value;
        HashMap<Integer, String> hex = new HashMap<>();
        hex.put(0, "0");
        hex.put(1, "1");
        hex.put(2, "2");
        hex.put(3, "3");
        hex.put(4, "4");
        hex.put(5, "5");
        hex.put(6, "6");
        hex.put(7, "7");
        hex.put(8, "8");
        hex.put(9, "9");
        hex.put(10, "A");
        hex.put(11, "B");
        hex.put(12, "C");
        hex.put(13, "D");
        hex.put(14, "E");
        hex.put(15, "F");

        while (true) {
            value = r / 16;
            reminder = r % 16;
            color += hex.get(value);

            if (reminder <= 15) {
                color += hex.get(reminder);
                break;
            }
            r = reminder;
            break;


        }

        return color;

    }
}