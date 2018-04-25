package mulitpleMethods;

import java.util.Scanner;

public class Khine {

		public static void main(String args[]){
			
			Scanner input = new Scanner(System.in);
			gfName gf1 = new gfName("Althea");
			gfName gf2 = new gfName("Nemia");
			
			
			gf1.message();
			System.out.print("Enter your name: ");
			String name = input.nextLine(); 
			gf2.message();
			
			System.out.print("Enter your new gf's name: ");
			String temp = input.nextLine();
			
			gf1.setName(name);
			gf1.setGfName(temp);
			gf1.message2();
		}
}
