package dataStructures;

import java.util.Scanner;


/**
 * @author Raviraj
 * Java program for different tree traversals
 */
public class TreeSet 
{
	static Scanner scan = null;
	
	public static void main(String[] args) 
	{
		scan = new Scanner(System.in);
		inOrdered(createTreeSet());
	}


	static Node createTreeSet()
	{
		// Root of Binary Tree
		Node root = null;
		
		System.out.println("Enter data:");
		int data = scan.nextInt();
		
		if(data == -1) return null;
		
		root = new Node(data);
		
		System.out.println("Enter left for :" + data);
		root.left = createTreeSet();
		
		System.out.println("Enter right for :" + data);
		root.right = createTreeSet();
	
		return root;
	}

	/** Class containing left and right child of current
	 *  node and key value 
	 */
	static class Node
	{
		Node right, left;
		int data;
		
		Node(int data)
		{
			this.data = data;
			right = left = null;
		}
	}
	
	/**
	 * In-order Traversal (Left, Root, Right) 
	 */
	static void inOrdered(Node root)
	{
		if(root == null)return;
		
		inOrdered(root.left);
		System.out.print(root.data + " ");
		inOrdered(root.right);
	}

	/**
	 * pre-order Traversal (Root, Left, Right) 
	 */
	static void preOrdered(Node root)
	{
		if(root == null)return;
		
		System.out.print(root.data + " ");
		inOrdered(root.left);
		inOrdered(root.right);
	}
	
	/**
	 * post-order Traversal (Left, Right, Root) 
	 */	
	static void postOrdered(Node root)
	{
		if(root == null)return;
		
		System.out.print(root.data + " ");
		inOrdered(root.left);
		inOrdered(root.right);
	}

}