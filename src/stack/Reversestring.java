package stack;

import java.util.Stack;

public class Reversestring {

	public static String reverse(String str) {
		
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<str.length();i++) {
			stack.push(str.charAt(i));
		}
		
		System.out.println(stack);
		
		String reversed = "";
		for(int i=0;i<str.length();i++) {
			reversed += stack.pop();
		}
		
		return reversed;
		
	}
	
	public static void main(String[] args) {
		String str = "Reverse";
		System.out.println(reverse(str));
	}

}
