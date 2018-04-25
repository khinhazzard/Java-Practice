package L11_methodsWithParameters;

import java.util.Scanner;

public class apple {
	
	public static void main(String args[]){ 
		
		Scanner input = new Scanner(System.in);
		tuna tunaObj = new tuna(); 	
		
		System.out.print("Enter your name: ");
		String name = input.nextLine();			//name will be used as parameter
		
		tunaObj.simpleMessage(name); 			//calls a method that requires a parameter
	}
}
