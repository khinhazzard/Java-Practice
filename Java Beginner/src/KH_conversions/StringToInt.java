package KH_conversions;

import java.util.Scanner;

public class StringToInt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input");

		String s = sc.next();
		int num=0;
		
		try{
		 num = Integer.parseInt(s);

		}catch(Exception e){
			System.out.print("Please enter a number");
		}
		

		System.out.print(num);
	}
}
