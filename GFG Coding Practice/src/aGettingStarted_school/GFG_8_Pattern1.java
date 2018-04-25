package aGettingStarted_school;

//https://practice.geeksforgeeks.org/problems/pattern-1/0/?ref=self

//1:45 PM 4/13/2018
//2:44 PM 4/13/2018
//Execution Time:0.08

import java.util.Scanner;

public class GFG_8_Pattern1 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		// testcase
		System.out.println("input:");
		int tc = sc.nextInt();
		
		//initialize
		char a[] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
				'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T' };

		while (tc-- > 0) {
			// ask for N Constraints N => 1 N<= 6
			int n = sc.nextInt();
			
			int p=0;//pointer for printing values from array a
			
			//display a table using rows and columns
			for(int r=0;r<n;r++){
				for(int c=0;c<n;c++){
					//condition to print $ only within the table
					if (r > 0 && r < n-1 && c>0 && c<n-1){
						System.out.print('$');
					}else{
						System.out.print(a[p]);
						p++;
					}
				}
				//display newline between rows
				if(r<n-1)
				System.out.println();
			}
			//display newline between testcases
			if (tc > 0) {
				System.out.println();
			}
		}
	}
}

// Pattern would look like this if, N=6
// ABCDEF
// G$$$$H
// I$$$$J
// K$$$$L
// M$$$$N
// OPQRST

