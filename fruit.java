package com.bhavesh;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class fruit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList<String> names= new LinkedList<String>();
		HashSet<String> set=new HashSet<String>();
		System.out.println("Enter your fruilts name:");
		
		for(int i=0;i<5;i++) {
			String fruit=sc.nextLine();
			if(!set.contains(fruit)) {
				set.contains(fruit);
				names.add(fruit);
			}
		}
		System.out.println("Your Fruits names is :"+names);
		System.out.println("fruits count"+" "+names.size());
		
		sc.close();
		

	}

}
