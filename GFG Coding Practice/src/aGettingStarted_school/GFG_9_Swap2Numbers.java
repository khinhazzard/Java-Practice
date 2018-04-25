package aGettingStarted_school;

//https://practice.geeksforgeeks.org/problems/swap-two-numbers/0

//9:21 PM 4/14/2018
//9:34 PM 4/14/2018

import java.util.Scanner;

public class GFG_9_Swap2Numbers {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input:");
		
		//testcase
		int tc = sc.nextInt();
		
		while(tc-->0){
			//ask for two numbers
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int temp = a;
			a = b;
			b = temp;
					
			System.out.printf("%d %d",a,b);
			
			if(tc>0)
				System.out.println();
		}
	}
	
}

/*
 * Swap two numbers
 * 
 * Swap given two numbers and print them. (Try to do it without a temporary
 * variable.)
 * 
 * Input: First line contains an integer, the number of test cases 'T'. Each
 * test case should contain two positive numbers a and b.
 * 
 * 
 * Output: Print the 2 numbers after swapping.
 */