package lab4_trees;

public class Node {
	int empNumber;
	String empName;
	Node leftNode;
	Node rightNode;
	
	public Node(int empNumber, String empName) {
		this.empNumber = empNumber;
		this.empName = empName;
		this.leftNode = null;
		this.rightNode = null;
	}
	
	public void displayNode() {
		System.out.println("Employee Number: " + empNumber + ", Employee Name: " + empName);
	}
}
