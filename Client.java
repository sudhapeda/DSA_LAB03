package com.glearning.dsalab3;

import java.util.Scanner;

public class Client {
	
	public static void main(String[] args) {
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		while(flag) {
			System.out.println("Enter the input  or q to quit::");
			String s = sc.next();
			if (s.equals("q")) {
				flag = false;
				continue;
			}
			boolean result = BalancingBracket.isBalanced(s);
			System.out.println("Input is balanced ? "+ result);
		}
			sc.close();
			
	}
}

