package lab1_stack;

public class ParenthesisChecker {
    public static boolean isCorrectlyParenthesized(String expression) {
        Stack stack = new Stack(expression.length());

        for (char ch : expression.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty() || !isMatching(stack.pop(), ch)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static boolean isMatching(char opening, char closing) {
        return (opening == '(' && closing == ')');
               
    }

    public static void main(String[] args) {
        String expression1 = "3 + ((6 * 2) - 3)";
        String expression2 = "5 * 6 + (2 - 5";
        System.out.println("Expression 1: " + isCorrectlyParenthesized(expression1));  // Valid
        System.out.println("Expression 2: " + isCorrectlyParenthesized(expression2));  // Not valid
    }
}

