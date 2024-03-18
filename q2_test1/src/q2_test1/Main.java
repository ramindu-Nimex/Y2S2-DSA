package q2_test1;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue queueObj = new Queue(10);
		Stack stackObj = new Stack(10);
		
		System.out.println("Enter 5 characters in ascending order:");
        for (int i = 0; i < 5; i++) {
            char c = sc.next().charAt(0);
            queueObj.insert(c);
            stackObj.push(c);
        }
        
        System.out.println("After : ");
        while(!queueObj.isEmpty()) {
        	System.out.print(queueObj.remove() + " ");
        }
        
        while(!stackObj.isEmpty()) {
        	System.out.print(stackObj.pop() + " ");
        }
    }
}
