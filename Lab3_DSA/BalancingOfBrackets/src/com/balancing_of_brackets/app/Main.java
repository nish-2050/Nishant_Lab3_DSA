package com.balancing_of_brackets.app;

import com.balancing_of_brackets.model.*;

public class Main {
	public static void main(String[] args) {

		CheckBalancingOfBrackets balanceBracket = new CheckBalancingOfBrackets();

		String bracketExpression = "([[{}]])";

		if (balanceBracket.CheckBalancing(bracketExpression)) {
			System.out.println("The entered String has Balanced Brackets ");
		} else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}
	}
}
