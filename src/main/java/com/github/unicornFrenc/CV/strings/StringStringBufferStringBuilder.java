package com.github.unicornFrenc.CV.strings;

import java.util.Arrays;

public class StringStringBufferStringBuilder {

    public static void main(String[] args) {

        //конкатинация

        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();

        String str = "ABC";
        str += "DEF";

        String str2 = "one".concat("two").concat("three");

        stringBuffer.append("DDD").append("EEE");
        stringBuilder.append("FFF").append("GGG");
        System.out.println(
                str + " " + str2 + " " + stringBuffer.toString() + " " + stringBuilder
                        .toString());//ABCDEF onetwothree DDDEEE FFFGGG

        //время конкатинации
//        Оператор ‘+=’ > 92.243 с;
//        String.concat() > 1.254 с;
//        StringBuffer > 1.208 с;
//        StringBuilder > 1.121 с.


        //сравнение строк
        String s1 = new String("ABC");
        String s2 = new String("ABC");
        String s3 = "ABC";
        String s4 = "ABC";
        System.out.println(s1 == s2); //false
        System.out.println(
                s3 == s4); //true. Т.к. один набор литералов будет указывать на одну область памяти
        System.out.println(s1.equals(s2));//true

        s1 = s2;
        System.out.println(s1 == s2); //true
        if ("someString" == "someString") { //true
            System.out.println("true");
        }
        System.out.println(s1.compareTo(s2)); //0
        System.out.println("C".compareTo("A")); //2
        System.out.println("A".compareTo("C")); //-2

        //строку в число
        String x = "523.5";
        Double xd = Double.valueOf(x);

        //Integer xy = Integer.valueOf(x); //java.lang.NumberFormatException: For
        // input string: "523.5"

        System.out.println(xd); //523.5

        //перевернуть строку
        String s = "ABCDEFG";
        StringBuilder stringBuilder2 = new StringBuilder(s);
        stringBuilder2.reverse();
        System.out.println(stringBuilder2.toString()); //GFEDCBA



        //replace
        String sb = "AABAA";
        String sa = "ABCDEF".replace("C", "**");

        String sb2 = sb.replace(sb, "##");
        System.out.println(sa + " " + sb2); //AB**DEF and ##

        String fs = "123456789";
        char[] charSequence = fs.toCharArray();
        charSequence[3] = '$';
        String nStr = String.valueOf(charSequence);
        System.out.println(nStr); //123$56789

        StringBuilder str1 = new StringBuilder("AMIT"); //0-A, 1-M, 2-I, 3-T
        str1.setCharAt(3, 'L');



        //part of string
        String string = "123456789";
        String sub = string.subSequence(3,6).toString();
        String sub2 = string.substring(3,6);
        System.out.println(sub2); //456


        //part of phrase (pieces)
        String line = "I am a java developer";
        String[] words = line.split(" ");
        String[] twoWords = line.split(" ", 2);

        System.out.println("String split with delimiter: "+ Arrays.toString(words));//String split with delimiter: [I, am, a, java, developer]
        System.out.println("String split into two: "+Arrays.toString(twoWords));//String split into two: [I, am a java developer]

//split string delimited with special characters

        String wordsWithNumbers = "I|am|a|java|developer";
        String[] numbers = wordsWithNumbers.split("\\|");

        System.out.println("String split with special character: "+ Arrays.toString(numbers));

//вхождение элемента
        String fstr = "12345678904";
        int a = fstr.indexOf("456"); //3
        int b = fstr.lastIndexOf("4"); //10
    }

}
