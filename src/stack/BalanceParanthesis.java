package stack;

import java.util.Stack;

public class BalanceParanthesis {

	public static Boolean Matchpairs(Character c1,Character c2) {
		if(c1 == '(' && c2 == ')')
			return true;
		else if(c1 == '[' && c2 == ']')
			return true;
		else if(c1 == '{' && c2 == '}')
			return true;
		else
			return false;
	}
	
	
	public static String Balanced(String str) {
		String result = "True";
		Stack stack = new Stack();
		for(int i=0;i<str.length();i++) {
			Character c = str.charAt(i);
			if(!Character.isLetterOrDigit(c)) {
				if(c == '(' || c == '{' || c == '[') {
					stack.push(c);
				}
				else if(c == ')' || c == '}' || c == ']') {
					if(!Matchpairs((Character)stack.pop(),c)) {
						result = "False";
					}
				}
			}
			else {
				result = "False";
			}
		}
		
		return result;
		
	}
	
	public static void main(String[] args) {
			
		String str = "([{])";
		System.out.println(Balanced(str));
		
	}

}
