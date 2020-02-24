package com.github.unicornFrenc.CV.Queue;

public class QueueMain {

    public static void main(String[] args) {

        Queue queue = new Queue(5);
        queue.insert(10);
        queue.insert(20);
        queue.insert(130);
        queue.insert(14);
        queue.insert(12);

        queue.remove();
        queue.remove();
        queue.remove();

        queue.insert(222);
        queue.insert(333);
        queue.insert(555);
        queue.remove();

        while (!queue.isEmpty()) {
            long n = queue.remove();
            System.out.print(n);
            System.out.print(" ");
        }
        System.out.println("");
    }
}
