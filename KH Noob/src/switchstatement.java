import java.util.Scanner;


public class switchstatement {

	public static void main(String args[])
	{
		Scanner apple = new Scanner(System.in);
		
		int age;
		
		System.out.print("Enter your age: ");
		age = apple.nextInt();
		
		switch(age)
		{
		case 1:
			System.out.println("you can crawl baby!");
			break;
		case 2:
			System.out.println("you can talk baby!");
			break;
		case 3:
			System.out.println("you can get in trouble baby!");
			break;
		default:
			System.out.println("your too old!");
			break;
		
		}
		
	}
	
}
