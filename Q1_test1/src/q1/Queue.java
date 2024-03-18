package q1;

public class Queue {

	private char[] queArr;
	private int maxSize;
	private int rear;
	private int front;
	private int noItems;
	
	public Queue(int s) {
		this.maxSize = s;
		this.queArr = new char[maxSize];
		this.rear = -1;
		this.front = 0;
		this.noItems = 0;
	}
	
	public boolean isEmpty() {
		return (noItems == 0);
	}
	
	public boolean isFull() {
		return (rear == maxSize - 1);
	}
	
	public void insert(char r) {
		if(rear == maxSize - 1) {
			System.out.println("Queue is Full");
		} else {
			queArr[++rear] = r;
			noItems++;
		}
	}
	
	public char remove() {
		if(noItems == 0) {
			System.out.println("Queue is Empty");
			return '.';
		} else {
			noItems--;
			return queArr[front++];
		}
	}
}

