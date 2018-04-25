import java.util.Scanner;

//this is a sample program using methods with parameters

public class apples {

	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		tuna tunaObj1 = new tuna();
		
		System.out.print("Enter your name -> ");
		String name = input.nextLine();
		
		tunaObj1.message(name);
		
		System.out.print("Enter name of gf -> ");
		String temp = input.nextLine();
		
		tunaObj1.setName(temp);
		tunaObj1.saying();
		
		System.out.print(name);
		
	}
}
