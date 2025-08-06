package com.bhavesh;

public class SimpleBubble {

	public static void main(String[] args) {
		int[] number= {5,2,4,1,3};
		
		//Bubble sort Logic
		for(int i=0;i<number.length-1;i++) {
			for(int j=0;j<number.length-1;j++) {
				//if the number is bigger than next one,swap them
				if(number[j]>number[j+1]) {
					//swapping
					int temp=number[j];
					number[j]=number[j+1];
					number[j+1]=temp;
					
				}
			}
		}
		//print the sorted numbers
		System.out.println("Sorted List");
		for(int num:number) {
			System.out.println(num+" ");
		}

	}

}
