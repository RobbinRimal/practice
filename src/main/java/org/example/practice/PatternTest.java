package org.example.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTest {
    public static  boolean patternChecker(){
        Pattern pattern= Pattern.compile(".ah.*");
        Matcher matcher= pattern.matcher("mahendra");
        System.out.println(matcher.matches());
        return matcher.matches();
    }
}
