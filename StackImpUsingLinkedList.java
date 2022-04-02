package com.raviraj.java.datastructure;

public class StackImpUsingLinkedList {

    Node head;

    public class Node{
        int data;
        Node next;
    }

    public StackImpUsingLinkedList(){
        head = null;
    }

    public void push(int val){
        Node extraNode = head;
        head = new Node();
        head.data = val;
        head.next = extraNode;
    }

    public int pop(){
        int val;
        if(head==null){
            System.out.println("Stack is empty");
        }
         val = head.data;
         head = head.next;
         return val;
    }

    public static void main(String[] args) {

    	StackImpUsingLinkedList lls = new StackImpUsingLinkedList();
    	lls.push(1);
    	lls.push(2);
    	lls.push(3);
    	lls.push(4);
    	lls.push(5);
    	
    	System.out.println(lls.pop());
    	System.out.println(lls.pop());
    	System.out.println(lls.pop());
    	System.out.println(lls.pop());
    }

}
