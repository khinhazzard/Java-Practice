package aGettingStarted_school;

//https://practice.geeksforgeeks.org/problems/celsius-to-fahrenheit-conversion/0/

//5:29 PM 4/16/2018
//5:39 PM 4/16/2018
//Execution Time:0.13


import java.util.Scanner;

public class GFG_18_CelsiusToFarenheit {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input:");
		
		int tc = sc.nextInt();
		
		while(tc-->0){
			//input celsius
			int c = sc.nextInt();
			
			System.out.print(convertCtoF(c));
			
			if(tc>0)
				System.out.println();
		}
	}
	
	//celsius to Farenheit
	static int convertCtoF(int celsius){
		
		double f = celsius * 1.8 + 32;
		
		return (int)Math.floor(f);
	}
}

/*
 * Given a temperature in celsius, convert and print in farenheit.
 * 
 * 
 * Note: We need to print the floor value of the result.
 * 
 * Input: The first line of input contains T denoting number of testcases. Each
 * testcase contains single integer denoting the temperature in celsius.
 * 
 * 
 * Output: For each testcase, output the temperature in farenheit.
 */
