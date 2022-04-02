package com.raviraj.java.datastructure;

public class StackImpUsingArray {

	int size;
	int[] array;
	int top;
	
	
	public StackImpUsingArray(int size) {
		this.size = size;
		this.array = new int[size];
		this.top = -1;
	}

	public boolean isEmpty(){
		return top==-1;
	}

	public boolean isFull(){
		return (top == (this.size -1));
	}
	
	public int peek(){
		int retVal = 0;

		if(!isEmpty()){
			retVal = this.array[top];
		}
		else{
			System.out.println("Stack is empty");
		}

		return retVal;
	}

	public int pop(){
		int retVal = 0;

		if(!isEmpty()){
			retVal = this.array[top--];
		}
		else{
			System.out.println("Stack is empty");
		}

		return retVal;
	}
	
	public int push(int element){
		int retVal = 0;

		if(!isFull()){
			this.array[++top] = element;
			System.out.println("Successfully pushed the element: " + element);
		}
		else{
			System.out.println("Stack is full");
		}

		return retVal;
	}

	public static void main(String[] args) {
		
		StackImpUsingArray stack = new StackImpUsingArray(5);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		System.out.println(stack.peek());
		System.out.println(stack.isEmpty());
		System.out.println(stack.isFull());
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}
