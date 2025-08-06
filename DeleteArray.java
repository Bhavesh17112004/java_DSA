package com.bhavesh;

public class DeleteArray {

	public static void main(String[] args) {
		int[] number = {10,20,30,40};
		int deleteNumber=2;
		
		for (int i =deleteNumber;i<number.length -1;i++ ) {
			number[i]=number[i+1];
			
		}
		for(int i=0;i < number.length-1;i++){
			System.out.println(number[i]);
		}
		

	}

}
