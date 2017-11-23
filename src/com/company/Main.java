package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

import static java.lang.System.out;

public class Main {

    static String s;
    static int i;
    static int current;
    static ArrayList<Integer> al =  new ArrayList<>();

    public static void main(String[] args) {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            if (i % 1000000 == 0) {
                out.println((i + 0.0) / Integer.MAX_VALUE);
            }
            al.add(getChainLength(i));
        }
        Collections.max(al);
    }

    public static int getChainLength(int i) {
        current = i;
        i = 0;
        do {
            s = numberToWord(current).replace(" ", "");
            current = s.length();
            i++;
        } while (!Objects.equals(s, "four"));
        return i;
    }

    public static String numberToWord(int i) {
        if (i == 80) {
            return "eighty ";
        } else if (i == 30) {
            return "thirty ";
        } else if (i == 20) {
            return "twenty ";
        } else if (i == 15) {
            return "fifteen ";
        } else if (i == 13) {
            return "thirteen ";
        } else if (i == 12) {
            return "twelve ";
        } else if (i == 11) {
            return "eleven ";
        } else if (i == 10) {
            return "ten ";
        } else if (i == 9) {
            return "nine ";
        } else if (i == 8) {
            return "eighth ";
        } else if (i == 7) {
            return "seven ";
        } else if (i == 6) {
            return "six ";
        } else if (i == 5) {
            return "five ";
        } else if (i == 4) {
            return "four ";
        } else if (i == 3) {
            return "three ";
        } else if (i == 2) {
            return "two ";
        } else if (i == 1) {
            return "one ";
        } else if (i == 0) {
            return "zero ";
        } else if (i > 1000000) {
            int j = i / 1000000;
            return numberToWord(j) + "million " + numberToWord(i - (j * 1000000));
        } else if (i > 1000) {
            int j = i / 1000;
            return numberToWord(j) + "thousand " + numberToWord(i - ( j * 1000));
        } else if (i > 100) {
            int j = i / 100;
            return numberToWord(j) + "hundred " + numberToWord(i - ( j * 100));
        } else if (i < 100 & (i / 10) * 10 == i) {
            return numberToWord(i / 10).trim() + "ty ";
        } else if (i < 100) {
            int j = i / 10;
            int lastDigit = i % 10;
            return numberToWord(j * 10) + numberToWord(lastDigit);
        }

        return "|" + i;
    }
}
