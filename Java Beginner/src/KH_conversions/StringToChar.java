package KH_conversions;

import java.util.Scanner;

public class StringToChar {

	public static void main(String args[]){	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String");
		String s = sc.nextLine();
		
		//convert to array of characters
		char c_arr[] = s.toCharArray();
		
		//display all characters in array
		
		//using enhanced loop (char from c_arr will be stored to c per loop)
		for(char c: c_arr){
			System.out.print(c);
		}
		
	}
}
