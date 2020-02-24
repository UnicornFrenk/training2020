package com.github.unicornFrenc.CV.Todes;

import java.util.Locale;

public class Str {
    public static void main(String[] args) {
        String str2 = "unhappy";

        isPalindrome(str2);
        isPalindromeString(str2);
        removeChar(str2, 'p');
        sequenceString();
    }

    static boolean isPalindrome(String str) {
        if (str == null) return false;
        StringBuilder strBuilder = new StringBuilder(str);
        strBuilder.reverse();
        return strBuilder.toString().equals(str);
    }

    static boolean isPalindromeString(String str) {
        if (str == null) return false;
        int length = str.length();
        System.out.println(length / 2);
        for (int i = 0; i < length / 2; i++) {

            if (str.charAt(i) != str.charAt(length - i - 1)) return false;
        }
        return true;
    }

    static String removeChar(String str, char ch) {
        if (str == null) return null;
        return str.replaceAll(Character.toString(ch), "");
    }

    static String caseTo(String str) {
        if (str == null) return null;
        return str.toUpperCase(Locale.ENGLISH);
    }

    static void sequenceString(){
        String str = "www.journaldev.com";
        System.out.println("Last 4 char String: "+str.subSequence(str.length()-4, str.length()));
        System.out.println("First 4 char String: "+str.subSequence(0, 4));
        System.out.println("website name: "+str.subSequence(4, 14));

        //substring vs subSequence
        System.out.println("substring == subSequence ? "
                                   +(str.substring(4, 14) == str.subSequence(4, 14)));

        System.out.println("substring equals subSequence ? "
                                   +(str.substring(4, 14).equals(str.subSequence(4, 14))));
    }

}
