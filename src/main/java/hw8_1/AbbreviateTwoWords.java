package hw8_1;

import java.util.Locale;

//https://www.codewars.com/kata/57eadb7ecd143f4c9c0000a3/train/java
public class AbbreviateTwoWords {
    public static String abbrevName(String name) {
        String[] names = name.split(" ");
        return (names[0].charAt(0) + "." + names[1].charAt(0)).toUpperCase();
    }
}
