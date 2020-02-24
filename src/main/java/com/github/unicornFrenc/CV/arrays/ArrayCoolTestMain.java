package com.github.unicornFrenc.CV.arrays;

public class ArrayCoolTestMain {  //с инкапсуляцией операций с массивом
    public static void main(String[] args) {
        int maxCountOfElements = 100;
        ArrayCoolTest arrayCoolTest;
        arrayCoolTest = new ArrayCoolTest(100);

        arrayCoolTest.insert(00);
        arrayCoolTest.insert(10);
        arrayCoolTest.insert(20);
        arrayCoolTest.insert(30);
        arrayCoolTest.insert(40);
        arrayCoolTest.insert(50);
        arrayCoolTest.insert(60);
        arrayCoolTest.insert(70);
        arrayCoolTest.insert(80);
        arrayCoolTest.insert(90);

        arrayCoolTest.display();


        int seachValue = 20;
        if (arrayCoolTest.find(seachValue))
            System.out.println("Found " + seachValue);


        String result = String.valueOf(arrayCoolTest.binaryFind(30));
        System.out.println(result);


        arrayCoolTest.delete(00);
        arrayCoolTest.delete(90);

        arrayCoolTest.display();
    }
}
