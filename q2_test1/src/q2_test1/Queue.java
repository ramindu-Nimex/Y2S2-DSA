package q2_test1;

public class Queue {
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
        if (rear == maxSize - 1) {
            rear = -1;
        }
        queueArray[++rear] = c;
        nItems++;
    }

    public char remove() {
        char temp = queueArray[front++];
        if (front == maxSize) {
            front = 0;
        }
        nItems--;
        return temp;
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }
}
