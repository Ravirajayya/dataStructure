package dataStructures;

import java.util.HashSet;

/**
 * @author ravirajayya
 * Linked List loop detection
 */
public class LinkedListLoopDetection 
{
	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
		list.put(list, 1);
		list.put(list, 2);
		list.put(list, 3);
		list.put(list, 4);
		
		/* Print all the element data present in the list */
		list.printAll(list);
		
		/* Create loop for testing */
		list.head.next.next.next.next = list.head;
		
		boolean isDetected = list.detectLoop(list);
		System.out.println( "\n" + "Loop detected: " + isDetected);
	}
}

class LinkedList
{
	Node head; // head of the list
	
	LinkedList put(LinkedList list, int data)
	{
		if(data == -1) return null;
		
		/*  Allocate the Node & Put in the data*/
		Node new_Node = new Node(data);
		
		if(list.head == null)
		{
			list.head = new_Node;
		}
		else
		{
			Node currNode = list.head;
			
			/* Move the head to point to last node */
			while(currNode.next != null)
				currNode = currNode.next;
			
			currNode.next = new_Node;
		}
		
		return list;
	}
	
	void printAll(LinkedList list)
	{
		Node currNode = list.head;
		
		while(currNode != null)
		{
			System.out.print(currNode.data + " ");
			currNode = currNode.next;
		}
	}
	
	/**
	 * @param list contain the linked list
	 * @return true if there is a loop in linked, else false
	 */
	boolean detectLoop(LinkedList list)
	{
		Node currNode = list.head;
		HashSet<Node> set = new HashSet<Node>();
		
		while( currNode != null)
		{
			/* If we have already has this node */
			if(set.contains(currNode))
				return true;
			
			set.add(currNode);
			currNode = currNode.next;
		}
		
		return false;
	}

}

/* Linked list Node */
class Node
{
	int data;
	Node next;
	
	Node(int data)
	{
		this.data = data;
		next = null;
	}
}
