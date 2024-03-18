package q1_test1_;

import java.util.Scanner;

class Queue {
    private char[] queueArray;
    private int maxSize;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int size) {
        maxSize = size;
        queueArray = new char[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(char c) {
        if (rear == maxSize - 1)
            rear = -1;
        queueArray[++rear] = c;
        nItems++;
    }

    public char remove() {
        char temp = queueArray[front++];
        if (front == maxSize)
            front = 0;
        nItems--;
        return temp;
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }
}

class Stack {
    private int maxSize;
    private char[] stackArray;
    private int top;

    public Stack(int size) {
        maxSize = size;
        stackArray = new char[maxSize];
        top = -1;
    }

    public void push(char c) {
        stackArray[++top] = c;
    }

    public char pop() {
        return stackArray[top--];
    }

    public boolean isEmpty() {
        return (top == -1);
    }
}


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue queueObj = new Queue(5);
		Stack stackObj = new Stack(5);
		
		for(int i = 0; i <5; i++) {
			System.out.println("Enter Charater : ");
			char c = sc.next().charAt(0);
			queueObj.insert(c);
		}
		
		for(int i = 0; i <5; i++) {
			stackObj.push(queueObj.remove());
		}
		
		for(int i = 0; i <5; i++) {
			queueObj.insert(stackObj.pop());
		}
		
		for(int i = 0; i <5; i++) {
			System.out.println(queueObj.remove());
		}
		sc.close();
    }
}
