package timeClass;

import java.util.Scanner;

public class apples {
	
	public static void main(String[]args){
		
		tuna tunaObj = new tuna();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Hour: ");
		tunaObj.hour = input.nextInt();
		System.out.print("Enter Minute: ");
		int m = input.nextInt();
		System.out.print("Enter Seconds: ");
		int s = input.nextInt();
		
		tunaObj.setTime(tunaObj.hour, m, s);
		System.out.println(tunaObj.toMilitary());
		System.out.println(tunaObj.toString());
		
	}
}
