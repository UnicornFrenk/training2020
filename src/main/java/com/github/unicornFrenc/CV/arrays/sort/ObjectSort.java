package com.github.unicornFrenc.CV.arrays.sort;


public class ObjectSort {

    private Person[] personArray;
    private int count;


    public ObjectSort(int max) {
        personArray = new Person[max];
        count = 0;
    }

    public void insert(String last, String first, int age) {
        personArray[count] = new Person(last, first, age);
        count++;
    }

    public void display() {
        for (int i = 0; i < count; i++)
            personArray[i].displayPerson();
        System.out.println("");
    }


    public void insertionSort() {
        int in, out;        //out -разделительный маркер
        for (out = 1; out < count; out++) {
            Person temp = personArray[out];    //скопировать помеченный элемент
            in = out;                           // начать перемещение с out

            while (in > 0 && personArray[in - 1].getLastName()
                                                .compareTo(
                                                        temp.getLastName()) > 0) {   //пока не найден меньший
                personArray[in] = personArray[in - 1];  // сдвинуть элемент
                --in;                                   //перейти на 1 влево
            }
            personArray[in] = temp;                     //вставить помеченный
        }
    }
}
