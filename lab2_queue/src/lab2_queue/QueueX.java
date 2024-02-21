package lab2_queue;

public class QueueX {
	
	private int[] queueArr;
	private int maxSize;
	private int rear;
	private int front;
	private int noItems;
	
	public QueueX(int s) {
		maxSize = s;
		queueArr = new int[maxSize];
		rear = -1;
		front = 0;
		noItems = 0;
	}
	
	public void insert(int j) {
		if(rear == maxSize - 1) {
			System.out.println("Queue is Full");
		} else {
			queueArr[++rear] = j;
			noItems++;
		}
	}
	
	public int remove() {
		if(noItems == 0) {
			System.out.println("Queue is Empty");
			return -99;
		} else {
			noItems--;
			return queueArr[front++];
		}
	}
	
	public boolean isEmpty() {
		return (noItems == 0);
	}
	
	public boolean isFull() {
		return (rear == maxSize - 1);
	}

}
