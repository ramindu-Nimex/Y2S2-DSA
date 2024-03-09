package lab4_trees;

import java.util.Scanner;

public class TreeApplication {

	public static void main(String[] args) {
		
		Tree t1 = new Tree();
		
		t1.insert(149, "Anusha");
		t1.insert(167, "Kosala");
		t1.insert(47, "Dinusha");
		t1.insert(66, "Mihiri");
		t1.insert(159, "Jayani");
		t1.insert(118, "Nimal");
		t1.insert(195, "Nishantha");
		t1.insert(34, "Avodya");
		t1.insert(105, "Bimali");
		t1.insert(133, "Sampath");
		
		System.out.println("\nInOrder(left,root,right) \n");
		t1.inOrder();
		
		System.out.println("\nPreOrder(root,left,right) \n");
		t1.preOrder();
		
		System.out.println("\nPostOrder(left,right,root) \n");
		t1.postOrder();
		
		int value;
		
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.print("Enter Employer number : ");
		value = sc.nextInt();
		Node foundNode = t1.callRecursive(value);
		
		if (foundNode != null) {
            System.out.println("Employee found:");
            foundNode.displayNode();
        } else {
            System.out.println("Employee not found.");
        }
		
		System.out.println();
		t1.deleteAll();
		
		System.out.println("\nAfter Delete Method Calling");
//		t1.callRecursive(130);
		
		System.out.println("\nInOrder(left,root,right) \n");
		t1.inOrder();
		
		System.out.println("\nPreOrder(root,left,right) \n");
		t1.preOrder();
		
		System.out.println("\nPostOrder(left,right,root) \n");
		t1.postOrder();
	}

}
