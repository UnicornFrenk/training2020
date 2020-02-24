package com.github.unicornFrenc.CV.collections;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapComporator {
    public static void main(String[] args) {
        Comparator comparator = new Comparator<String>() {
            @Override
            public int compare(String obj1, String obj2) {
                if (obj1 == null) {
                    return -1;
                }
                if (obj2 == null) {
                    return 1;
                }
                if (obj1.equals(obj2)) {
                    return 0;
                }
                return obj1.compareTo(obj2);
            }
        };
        TreeMap<String, String> treeMap1 = new TreeMap<>(comparator);

        //or
        TreeMap<Integer, String> treeMap = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        });
    }
}
