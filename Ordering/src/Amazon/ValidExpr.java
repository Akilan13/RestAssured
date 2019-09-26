package Amazon;

import java.util.Stack;

public class ValidExpr {
	public static void main(String[] args) {
        String expr = "()";
        System.out.println(isValid(expr));
    }
    
    public static boolean isValid(String input) {
        Stack<Character> stack = new Stack<>();
        for (Character c : input.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (!stack.isEmpty()) {
                    char k = stack.pop();
                    if (k != '(') {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }

}
