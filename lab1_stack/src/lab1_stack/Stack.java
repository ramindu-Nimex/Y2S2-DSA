package lab1_stack;

public class Stack {
	
	private int maxSize;
	private char[] stkArray;
	private int top;

	public Stack(int size) {
		this.maxSize = size;
		this.stkArray = new char[maxSize];
		this.top = -1;
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (top == maxSize - 1);
	}
	
	public void push(char arr) {
		if(isFull()) {
			System.out.println("Stack is Full");
		} else {
			stkArray[++top] = arr;
		}
	}
	
	public char pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return '\0';
		} else {
			return stkArray[top--];
		}
	}
	
	public char peek() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return '\0';
		} else {
			return stkArray[top];
		}
	}
}
