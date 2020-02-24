package com.github.unicornFrenc.CV.logic;


//«Ханойская башня» рекурсивным методом.
public class Tower {

    static int nDisk = 5;

    public static void main(String[] args) {
        doTower(nDisk, 'A', 'B', 'C');
    }

    public static void doTower(int top, char from, char inter, char to) {
        if (top == 1) System.out.println("Disk 1 from " + from + " to " + to);
        else {
            doTower(top - 1, from, to, inter);       // from-->inter
            System.out.println("Disk " + top + " from " + from + " to " + to);
            doTower(top-1,inter,from,to );           // inter-->to


        }
    }

}

