package q1_test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue queueObj = new Queue(5);
		Stack stackObj = new Stack(5);
		
		for(int i = 0; i <5; i++) {
			System.out.print("Enter Charater : ");
			char c = sc.next().charAt(0);
			queueObj.insert(c);
		}
		
		for(int i = 0; i <5; i++) {
			stackObj.push(queueObj.remove());
		}
		
		for(int i = 0; i <5; i++) {
			queueObj.insert(stackObj.pop());
		}
		System.out.println();
		System.out.print("After : ");
		for(int i = 0; i <5; i++) {
			System.out.print(queueObj.remove() + " ");
		}
		sc.close();
	}
}
