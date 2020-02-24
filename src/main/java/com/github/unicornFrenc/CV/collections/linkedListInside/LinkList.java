package com.github.unicornFrenc.CV.collections.linkedListInside;

public class LinkList {


    private Link first; // Ссылка на первый элемент списка

    public LinkList() // Конструктор
    {
        first = null; // Список пока не содержит элементов
    }

    public void insertFirst(int id, double dd) { // Создание нового элемента
        Link newLink = new Link(id, dd);
        newLink.next = first; // newLink --> старое значение first
        first = newLink; // first --> newLink
    }


    public Link find(int key) // Поиск элемента с заданным ключом
    { // (предполагается, что список не пуст)
        Link current = first; // Начиная с 'first'
        while (current.key != key) // Пока совпадение не найдено
        {
            if (current.next == null) // Если достигнут конец списка
                return null; // и совпадение не найдено
            else // Если еще остались элементы
                current = current.next; // Перейти к следующему элементу
        }
        return current; // Совпадение обнаружено
    }


    public Link delete(int key) // Удаление элемента с заданным ключом
    { // (предполагается, что список не пуст)
        Link current = first; // Поиск элемента
        Link previous = first;
        while (current.key != key) {
            if (current.next == null) return null; // Элемент не найден
            else {
                previous = current; // Перейти к следующему элементу
                current = current.next;
            }
        } // Совпадение найдено
        if (current == first) // Если первый элемент,
            first = first.next; // изменить first
        else // В противном случае
            previous.next = current.next; // обойти его в списке
        return current;
    }


    public void displayList() // Вывод содержимого списка
    {
        System.out.print("List (first-->last): ");
        Link current = first; // От начала списка
        while (current != null) // Перемещение до конца списка
        {
            current.displayLink();
            current = current.next; // Переход к следующему элементу
        }
        System.out.println("");
    }

}
