package lab1_stack;

public class BracketChecker {
	
	private String inputstr; 
	
	public BracketChecker(String in) {
		this.inputstr = in;
	}
	
	public void checkB() {
		int size = inputstr.length();
		Stack stckObj = new Stack(size);
		
		for(int i = 0; i < size; i++) {
			if(inputstr.charAt(i) == '(') {
				stckObj.push('(');
			} else if(inputstr.charAt(i) == ')') {
				stckObj.pop();
			}
		}
		
		if(!stckObj.isEmpty()) {
			System.out.println("Invalid String");
		} else {
			System.out.println("Valid String");
		}
	}

	public static void main(String[] args) {
		BracketChecker bracketCheck = new BracketChecker("3 + ((6 * 2) - 3)");
		bracketCheck.checkB();
	}
}
