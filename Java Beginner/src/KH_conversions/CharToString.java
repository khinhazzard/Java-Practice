package KH_conversions;

import java.util.Scanner;

public class CharToString {

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Input");
			
		String s = sc.next();
		
		char c = sc.next().charAt(0);
		
		//conversion
		String ns = Character.toString(c);
		
		String total = s+ns;
		
		System.out.print(total);
	}
}
