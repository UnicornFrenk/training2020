package com.github.unicornFrenc.CV.IDT;

import java.util.HashMap;
import java.util.Map;

public class TaskForIDT {
    public static void main(String[] args) {
        String str = "happy happy lolol";
        char[] array = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();


        for (int i = 0; i < str.length(); i++) {
            map.put(array[i], 0);
        }
        for (int i=0; i<str.length();i++){
            if (map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i]).intValue() +1 );
            }
        }


        for (Map.Entry entry : map.entrySet()) {
            System.out.println(
                    "Key: " + entry.getKey() + " Value: " + entry.getValue());
        }


    }
}
