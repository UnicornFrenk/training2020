package com.github.unicornFrenc.CV.collections;
import java.util.Collections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class SynchronizedCollections {

    //    Как получить синхронизированную коллекцию из не синхронизированной?
//    Используйте следующие методы:
    public static void main(String[] args) {

        ArrayList<Object> list = new ArrayList<>();
        HashSet<Object> set = new HashSet<>();
        HashMap<Object, Object> map = new HashMap<>();

        //возвращают потокобезопасную коллекцию с теми же элементами внутри
        Collections.synchronizedList(list);
        Collections.synchronizedSet(set);
        Collections.synchronizedMap(map);


//        Как получить коллекцию только для чтения?
//        Используйте следующие методы:

        Collections.unmodifiableList(list);
        Collections.unmodifiableSet(set);
        Collections.unmodifiableMap(map);
    }
}
