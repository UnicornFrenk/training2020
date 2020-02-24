package com.github.unicornFrenc.CV.Todes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Todes {
    public static void main(String[] args) {

// b,d
        ArrayList<String> list;
        list = new ArrayList<String>(Arrays.asList("a", "b", "c", "d"));
        for (int i = 0; i < list.size(); i++) {
            list.remove(i);
        }
        System.out.println("1.: " + list);

        //a,c,d
        ArrayList<String> list2;
        list2 = new ArrayList<String>(Arrays.asList("a", "b", "c", "d"));
        for (int i = 0; i < list2.size(); i++) {
            if (list2.get(i).equals("b") || list2.get(i).equals("c")) {
                list2.remove(i);
            }
        }
        System.out.println("2.: " + list2);


        ArrayList<String> list3;
        list3 = new ArrayList<String>(Arrays.asList("a", "b", "c", "d"));
        Iterator<String> iterator = list3.iterator();
        while (iterator.hasNext()){
            if (iterator.next().equals("b")) {
                iterator.remove();
            }
        }

//        for (String s: list3) {  //ConcurrentModificationException
//            if (s.equals("b")) {
//                list3.remove(s);
//            }
//        }
        System.out.println("3.: " + list3);
    }
}
