package palindrome;

import java.util.Scanner;

public class apple {
	
	public static void main(String args[]){
		
	Scanner input = new Scanner(System.in);
	int close = 0;
	String temp = "temp";
	
	System.out.println("Instructions");
	System.out.println("ALl CAPS ONLY");
	System.out.println("#EXIT - to exit)");
	while(close == 0){
		System.out.println("Enter String:");
		temp = input.nextLine();

		if(temp.equals("#EXIT")){
			System.exit(0);
		}
		else{
			inspect v = new inspect(temp);
			
			if (v.validate()== 0){				
				v.check();	
			}
			else{
				System.out.println("Invalid Input!");
			}
			
		}
	}	
	}
}
