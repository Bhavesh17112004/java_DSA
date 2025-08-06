package com.bhavesh;

import java.util.Stack;

public class Stacked {

	public static void main(String[] args) {
		Stack<Integer> number = new Stack<Integer>();
		number.add(10);//"Put at the end"
		number.add(20);
		number.push(30);//"Put at the top"
		number.push(20);
		number.push(10);
		System.out.println(number);
		System.out.println(number.peek());
	}

}
