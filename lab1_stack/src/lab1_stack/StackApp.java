package lab1_stack;

public class StackApp {

	public static void main(String[] args) {
		Stack stackObj = new Stack(7);
		
		// Insert characters to the stack
		stackObj.push('U');
		stackObj.push('D');
		stackObj.push('N');
		stackObj.push('I');
		stackObj.push('M');
		stackObj.push('A');
		stackObj.push('R');
		
		// Insert characters to the stack using for each loop
//		for(char c : "UDNIMAR".toCharArray()) {
//			stackObj.push(c);
//		}
		
		// Remove content of the stack and display them
		System.out.print("My Name is : ");
		while(!stackObj.isEmpty()) {
			System.out.print(stackObj.pop() + " ");
		}
		
		// Order of insertion: U, D, N, I, M, A, R
		// Order of removal: R, A, M, I, N, D, U
	}

}
