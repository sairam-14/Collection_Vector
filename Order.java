package com.vector;

import java.util.*;

public class Order {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the format");
		String s = sc.next();

		Stack<Character> a = new Stack<>();

		boolean b = true;
		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);
			if (ch == '{' || ch == '[' || ch == '(') {

				a.push(ch);
			} else {

				if ((!(a.empty()) && ch == '}' && a.peek() == '{' || ch == ']' && a.peek() == '['
						|| ch == ')' && a.peek() == '(')) {
					a.pop();
				} else {
					System.out.println("Un oredr");
					b = false;
					 break;

				}
			}

		}
		if (b) {
			System.out.println("Its order");
		}

	}

}
