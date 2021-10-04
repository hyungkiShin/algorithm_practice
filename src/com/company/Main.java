package com.company;

public class Main {
//    private static MyQueue<Integer> mQueue = new MyQueue<Integer>();

    public static void main(String[] args) {

//        SingleLinkedList<Integer> MyLinkedList = new SingleLinkedList<Integer>();
//        MyLinkedList.addNode(1);
//        MyLinkedList.addNode(2);
//        MyLinkedList.addNode(3);
//        MyLinkedList.addNode(4);
//
//        MyLinkedList.delNode(3);
//
//        MyLinkedList.printAll();

        DoubleLinkedList<Integer> doubleLinkedList = new DoubleLinkedList<>();
        doubleLinkedList.addNode(1);
        doubleLinkedList.addNode(2);
        doubleLinkedList.addNode(3);

        doubleLinkedList.searchFromHead(4);
        doubleLinkedList.searchFromTail(3);
    }
}
