package com.github.unicornFrenc.CV.Queue;

public class PriorityQueueMAin {
    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue(5);
        priorityQueue.insert(10);
        priorityQueue.insert(20);
        priorityQueue.insert(12);
        priorityQueue.insert(18);
        priorityQueue.insert(6);


        while (!priorityQueue.isEmpty()) {
            long value = priorityQueue.remove();
            System.out.print(value + " ");
        }
        System.out.println("");
    }
}
