package com.senthuran;

public class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public LinkedList insertData(LinkedList linkedList, int data) {
        Node newnode = new Node(data);
        if (linkedList.head == null) {
            linkedList.head = newnode;
        } else {
            Node last = linkedList.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newnode;
        }
        return linkedList;
    }

    public void printElements(LinkedList linkedList) {
        Node currentNode = linkedList.head;
        System.out.print("Linked List : ");
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList = linkedList.insertData(linkedList, 1);
        linkedList = linkedList.insertData(linkedList, 4);
        linkedList = linkedList.insertData(linkedList, 6);
        linkedList = linkedList.insertData(linkedList, 8);
        linkedList = linkedList.insertData(linkedList, 10);
        linkedList = linkedList.insertData(linkedList, 83);
        linkedList = linkedList.insertData(linkedList, 30);

        linkedList.printElements(linkedList);
    }
}
