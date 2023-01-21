package org.example;

public class Solution {
    public static String camelCase(String input) {
        char[] data = input.toCharArray();
        int count = 0;
        String message = "";
        for (char c : data) {
            if (Character.isUpperCase(c) && count == 0) {
                message += String.valueOf(c);
            } else if (Character.isUpperCase(c)) {
                message += " " + String.valueOf(c);

            } else {
                message += String.valueOf(c);
            }
            count++;
        }
        System.out.println(message);
        return message;
    }


    public static String whoLikesIt(String... names) {
//     long x=   Arrays.stream(names).count();
        long x = names.length;
        System.out.println("count:"+x);
        if (x == 0) {
            return "no one likes this";
        }
        String likes = "";
        int count = 0;
        for (String name : names) {
            if (x == 0) {
                likes = "no one likes this";
            } else if (x == 1) {
                likes = name + " likes this";
            } else if (x == 2) {
                if (count == 0) {
                    likes = name;
                    count++;
                } else {
                    likes += " and " + name + " like this";
                    count = 0;
                }

            }else if (x == 3) {
                if (count == 0) {
                    likes = name;
                    count++;
                } else if (count == 1) {
                    likes += ", " + name;
                    count++;

                } else {
                    likes += " and " + name + " like this";
                    count = 0;
                }
            }

            else {
                if (count == 0) {
                    likes = name;
                    count++;
                } else {
                    likes += ", " + name + " and " + (x - 2) + " others like this";
                    count = 0;
                    break;
                }

            }
        }
        System.out.println(likes);
        return likes;
    }
}
