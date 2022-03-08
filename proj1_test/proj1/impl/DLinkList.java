package agh.ii.prinjava.proj1.impl;

public class DLinkList<E> {
    // ...

    Node head, tail = null;

    public void addFirst(E x){

        Node newNode = new Node();
        newNode.elem = x;

        if (head == null){
            head = newNode;
            tail = newNode;
            newNode.next = null;
            newNode.prev = null;
        }
        else {

            newNode.next = head;
            head.prev = newNode;
            head = newNode;

        }

    }

    public void addLast(E x){

        Node newNode = new Node();
        newNode.elem = x;

        if (tail == null){
            head = newNode;
            tail = newNode;
            newNode.next = null;
            newNode.prev = null;
        }
        else {

            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;

        }

    }

    public Object removeFirst(){

        if (head == null) {
            return null;
        }
        else {

            Node exHead = new Node();
            exHead = head;
            head = head.next;

            return exHead.elem;

        }
    }

    public Object removeLast(){

        if (tail == null) {
            return null;
        }
        else {

            Node exTail = new Node();
            exTail = tail;
            tail = tail.prev;

            return exTail.elem;

        }
    }

    @Override
    public String toString(){
        String str = "";
        Node cour = head;

        while(head.next != null){
            str += cour.elem + " / ";
            cour = cour.next;
        }

        str += cour.elem;

        return str;
    }

    private static class Node<T> {
        T elem;
        Node<T> next;
        Node<T> prev;

    }
}
