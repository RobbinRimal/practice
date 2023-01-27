package org.example;

import java.util.Locale;

public class PangramChecker {
    public boolean check(String sentence){
        sentence = sentence.toLowerCase();
        return sentence.matches(".*[a-z].*");
    }
}
