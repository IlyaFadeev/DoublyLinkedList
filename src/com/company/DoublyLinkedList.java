package com.company;


public class DoublyLinkedList<T>
{
        Node node;
        Node first;
        Node last;
        int size = 0;
    private class Node
    {
        private Node next = null;
        private Node prev = null;
        private T data;

        public void setNext(Node next) {
            this.next = next;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node getNext() {

            return next;
        }

        public Node getPrev() {
            return prev;
        }

        public Object getData() {
            return data;
        }
    }

    public void add(T data)
    {
        node = new Node();
        node.setData(data);
        if (first == null)
        {
            node.setPrev(null);
            node.setNext(null);
            first = node;
            last = node;
        }
        else
        {
            if (size == 1) last.setPrev(first);
            last.setNext(node);
            node.setPrev(last);
            node.setNext(null);
            last = node;
            if (size == 1)
            first.setNext(node);

        }
        size++;
    }


    public T get(int i)
    {
        Node resNode = first;
        Node currNode;
        int currNumber = 0;
        while (i != currNumber)
        {
            currNumber++;
                currNode = resNode.getNext();
                resNode = currNode;


        }

        return (T)resNode.getData();
    }

}