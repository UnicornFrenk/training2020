package com.github.unicornFrenc.CV.collections;

import java.util.*;

public class Collections {
    // List - упорядоченный список
    //Set - неповторяющиеся элементы
    //Queue - очередь, первый пришел - первый ушел
    //Map - ключ/значение

    public static void main(String[] args) {

        /* Queue*/

        Queue<Integer> queue = new ArrayDeque();
        //вставка элемента в очередь, возвращает false, если не удалось
        queue.offer(3);
        queue.offer(33);
        queue.offer(333);
        queue.offer(3333);
        queue.offer(33333);
        queue.offer(333333);

        System.out.println(queue);
        //удаление элемента (верхушки): poll -вернет null, если
        // очередь пустая,
        // remove - выбросит Exception
        queue.poll();
        queue.remove();

        //возвращает верхушку очереди (но не удаляют)
        queue.element();
        queue.peek();


        ((ArrayDeque<Integer>) queue).addFirst(2);
        System.out.println(queue);




        /* Map*/

        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Todes");
        hashMap.put(2, "ExpertSoft");
        Map<Integer, String> linkedHashMAp = new LinkedHashMap();
        Map<Integer, String> treeMAp = new TreeMap();

        /* В этом классе четыре конструктора:

ТгееМар() — создает пустой объект с естественным  порядком элементов;
TreeМар(Comparator с) — создает пустой объект, в котором порядок задается объектом сравнения с;
ТгееМар(Map f) — создает объект, содержащий все элементы отображения f, с естественным порядком его элементов;
ТгееМар(SortedMap sf) — создает объект, содержащий все элементы отображения
sf, в том же порядке. */


        if (hashMap.containsKey(1)) {
            System.out.println(hashMap);
        }


        /* Set*/

        List<Integer> listToSet = new ArrayList<>();
        listToSet.add(1);
        listToSet.add(2);
        listToSet.add(3);
        listToSet.add(1);
        listToSet.add(5);
        Set<Integer> hashSet = new HashSet<Integer>(listToSet);

        for (Integer val : hashSet) {
            System.out.print(val + ", ");
        }
    }
}
