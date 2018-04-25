package aGettingStarted_school;

//https://practice.geeksforgeeks.org/problems/small-factorial/0

//9:36 PM 4/14/2018
//9:47 PM 4/14/2018

import java.util.Scanner;

public class GFG_10_SmallFactorial {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input:");
		
		//testcase
		int tc = sc.nextInt();
		
		while(tc-->0){
			
			int n = sc.nextInt();
			
			//calculate factorial	
			System.out.print(factorial(n));
			
			if(tc>0)
				System.out.println();
		}
		
	}
	
	static long factorial(int n){
	
		long f = n ;
		
		//factorial of 0 is 1
		if (n == 0) {
			return 1;
		}
		
		while(n-->1){
			f*=n;
		}
		return f;
	}
}

/*
 * 
 * Small Factorial
 * 
 * Calculate factorial of a given number N.
 * 
 * Input:
 * 
 * The first line contains an integer 'T' denoting the total number of test
 * cases. In each test cases, it contains an integer 'N'.
 * 
 * 
 * Output: In each seperate line output the answer to the problem.
 */
