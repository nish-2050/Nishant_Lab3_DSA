package com.balancing_of_brackets.model;

import java.util.*;

public class CheckBalancingOfBrackets {
	public boolean CheckBalancing(String bracketExpression) {

		if (bracketExpression.length() % 2 != 0)
			return false;

		Stack<Character> stack = new Stack<>();
		for (char s : bracketExpression.toCharArray()) {

			if (s == '(' || s == '[' || s == '{') {
				stack.push(s);
			}

			else if (s == ')' && !stack.isEmpty() && stack.peek() == '(') {
				stack.pop();
			}

			else if (s == ']' && !stack.isEmpty() && stack.peek() == '[') {
				stack.pop();
			}

			else if (s == '}' && !stack.isEmpty() && stack.peek() == '{') {
				stack.pop();
			} else {
				return false;
			}
		}
		return stack.isEmpty();
	}

}
