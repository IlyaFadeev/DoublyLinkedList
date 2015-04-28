package com.company;

public class Main {

    public static void main(String[] args) {
	DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();
        for (int i = 0; i < 10000; i++) {
            list.add(i);
            System.out.println(list.get(i));
        }
    }
}
