package aGettingStarted_school;

//https://practice.geeksforgeeks.org/problems/print-1-to-n-without-using-loops/0/?ref=self

//9:43 PM 4/22/2018
//9:56 PM 4/22/2018


import java.util.Scanner;

public class GFG_26_Print1ToNRecursion {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input");
		
		int tc = sc.nextInt();
		
		while(tc-->0){
			//enter n
			int n = sc.nextInt();
			
			//print from 1 to n using recursion
			print(1,n);
			
			if(tc>0)
				System.out.println();
		}
		
	}
	
	static int print(int current, int max){
		System.out.print(current);
		if(current < max){
			System.out.print(" ");
			return print(current+1,max);
		}else{
			return current;
		}
	}
	
}

/*

Print numbers from 1 to n without the help of loops.

Input: 
The first line of the input contains T denoting the number of testcases. First line of test case contain number n.

Output: 
Numbers from 1 to n will be printed.
*/
//
//Constraints:
//
//	1 <=T<= 100
//	1 <=N<= 990
//
//	Example:
//
//	Input:
//
//	1
//	10
//
//	Output:
//
//	1 2 3 4 5 6 7 8 9 10