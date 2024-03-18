package q1;

public class Stack {

	private int maxSize;
	private char[] stkArray;
	private int top;
	
	public Stack(int s) {
		this.maxSize = s;
		stkArray = new char[maxSize];
		top = -1;
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (top == maxSize - 1);
	}
	
	public void push(char r) {
		if(isFull()) {
			System.out.println("Stack is Full");
		} else {
			stkArray[++top] = r;
		}
	}
	
	public char pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return '.';
		} else {
			return stkArray[top--];
		}
	}
	
	public char peek() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return '.';
		} else {
			return stkArray[top];
		}
	}
}
