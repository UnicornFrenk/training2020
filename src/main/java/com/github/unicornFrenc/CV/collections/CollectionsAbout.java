package com.github.unicornFrenc.CV.collections;

import java.util.*;

public class CollectionsAbout {

    // Iterable
    //Collection
    //List -- Queue  --  Set
    // List: ArrayList, LinkedList,Vector
    //Queue: PriorityQueue, Deque, ArrayDeque
    //Set = HashSet, LinkedHashSet, SortedSet, TreeSEt

    public static void main(String[] args) {


        /*   LIST   */

        //ArrayList быстро get, set, add (добавление нового элемента)
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(6);


        //LinkedList быстро add, add(i,val) (вставка), remove
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(3);
        linkedList.add(5);
        linkedList.add(7);

        List<Integer> vector = new Vector<>();


        /*  QUEUE   */

        Queue<Integer> priorityQueue = new PriorityQueue<>();
        Deque<Integer> deque = new ArrayDeque<>();
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();



        /*   SET   */
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        SortedSet<Integer> sortedSet = new TreeSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();


    }

}
