package com.bhavesh;
import java.util.Scanner;
public class dsa_task31 {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}//task1
		

		
		        Scanner scanner = new Scanner(System.in);

		        // Input array size
		        System.out.print("Enter the size of the array: ");
		        int size = scanner.nextInt();

		        int[] numbers = new int[size];
		        int sum =0;
		        int max=Integer.MIN_VALUE;
		        int oddcount=0;
		        
		      

		        // Input array elements
		        System.out.println("Enter the numbers:");
		        for (int i = 0; i < size; i++) {
		            numbers[i] = scanner.nextInt();
		            sum += numbers[i];
		            if (numbers[i]>max) {
		            	max=numbers[i];
		            }

		        }

		        // Print only even numbers
		        System.out.println("Even numbers in the array:");
		        for (int num : numbers) {
		            if (num % 2 == 0) {
		                System.out.print(num + " ");
		            }
		        }//task 2
		        
		        System.out.println("All Elements sum answer is:"+" "+sum);//task 3
		        
		        System.out.println("Maximum number of arry is :"+" "+ max);//task 4 
		        
		        
		        	if(oddcount %2 != 0) {
		        		oddcount++;
		        		System.out.println("Total number of your odd is:"+oddcount);
		        		
		        	}
		        
		        
		        
		    }
		
	}


