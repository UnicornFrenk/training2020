package com.github.unicornFrenc.CV.collections.linkedListInside;

public class Link {

    public int key; // Данные (ключ)
    public double value; // Данные
    public Link next; // Следующий элемент в списке
    // -------------------------------------------------------------
    public Link(int k, double v) // Конструктор
    {
        key = k;
        value = v;
    }
    // -------------------------------------------------------------
    public void displayLink() // Вывод содержимого элемента
    {
        System.out.print("{" + key + ", " + value + "} ");
    }
}
