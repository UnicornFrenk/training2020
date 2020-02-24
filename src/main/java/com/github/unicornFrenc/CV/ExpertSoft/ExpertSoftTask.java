package com.github.unicornFrenc.CV.ExpertSoft;

import java.util.*;

public class ExpertSoftTask {

    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        a.add(1);   //1[0],2[1],3[2],5[3],6[4],8[5],78[6],122[7]
        a.add(3);
        a.add(5);
        a.add(13);
        a.add(122);

        b.add(2);
        b.add(6);
        b.add(8);
        b.add(18);
        b.add(78);


        for (int indexForListA = 0, indexForListB = 0; indexForListB != b.size(); indexForListA++) {
            Integer numFromListB = b.get(indexForListB);
            if (indexForListA < a.size()) {
                Integer numFromListA = a.get(indexForListA);
                if (numFromListB <= numFromListA) {
                    a.add(indexForListA, numFromListB);
                    indexForListB++;
                }
            } else {
                a.add(numFromListB);
                indexForListB++;
            }
        }

        System.out.println(a);
        System.out.println(b);
    }
}

