package com.glearning.dsalab3;

import java.util.Stack;

public class BalancingBracket {
	
	public static boolean isBalanced(String s) {
		
		Stack stack = new Stack();
		
		char[] ch = s.toCharArray();
		for(int i=0; i<ch.length; i++) {
			char current = ch[i];
			if(current == '(' || current == '{' || current=='[') {
				stack.push(current);
				continue;
			}
			if(stack.isEmpty())
			{
				return false;
			}	
			
			char check;
			switch(current) {
			case ')':
				check = (char) stack.pop();
				if(current == '{' || current == '[') {
					return false;
				}
				break;
			case '}':
				check = (char) stack.pop();
				if(current == '(' || current == '[') {
					return false;
				}
				break;	
			case ']':
				check = (char) stack.pop();
				if(current == '(' || current == '{') {
					return false;
				}
				break;
			}
		}
		
		return (stack.isEmpty());
		
	}

	

}
