package aGettingStarted_school;

//https://practice.geeksforgeeks.org/problems/greatest-of-three-numbers/0

//2:43 PM 4/15/2018
//2:52 PM 4/15/2018
//Execution Time:0.13


import java.util.Scanner;


public class GFG_13_GreatestOf3Numbers {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input");
		
		//testcase
		int tc = sc.nextInt();
		
		while(tc-->0){
			//ask for 3 positive integers
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			//print the greatest
			int max=a;
			if(b>=a && b>=c){
				max = b;
			}else if(c>=a && c >=b){
				max = c;
			}
			System.out.print(max);
			
			if(tc>0){
				System.out.println();
			}
		}
	}
}

/*
 * Greatest of three numbers
 * 
 * Write a program to find the greatest of the three numbers.
 * 
 * Input: First line contains an integer, the number of test cases 'T'. Each
 * test case should contain three positive numbers a,b and c.
 * 
 * 
 * Output: Print maximum of three numbers.
 */
