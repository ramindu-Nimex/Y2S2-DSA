package lab2_queue;

import java.util.Scanner;

public class MainQueue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		QueueX mainQueue = new QueueX(5);
		
		for(int i = 1; i <= 5; i++) {
			System.out.print("Enter transaction ID " + i + ": ");
			int transactionID = sc.nextInt();
			mainQueue.insert(transactionID);
		}
		System.out.println();
		
		QueueX evenQueue = new QueueX(5);
		QueueX oddQueue = new QueueX(5);
		
		while(!mainQueue.isEmpty()) {
			int transactionID = mainQueue.remove();
			if (transactionID % 2 == 0) {
                evenQueue.insert(transactionID);
                System.out.println("ID " + transactionID + " is sent to PC1");
            } else {
                oddQueue.insert(transactionID);
                System.out.println("ID " + transactionID + " is sent to PC2");
            }
		}
		System.out.println();
		System.out.println("PC1");
		while (!evenQueue.isEmpty()) {
            System.out.println("Transaction " + evenQueue.remove());
        }
		System.out.println();
		System.out.println("PC2");
        while (!oddQueue.isEmpty()) {
            System.out.println("Transaction " + oddQueue.remove());
        }
        sc.close();
	}
}