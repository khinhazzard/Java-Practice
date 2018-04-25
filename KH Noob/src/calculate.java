import java.util.Scanner;

public class calculate {

	public static void main(String args[])
	{
		Scanner apple = new Scanner(System.in);
		double num1, num2, sum;
		
		System.out.print("Enter First number: ");
		num1 = apple.nextDouble();
		System.out.print("Enter Second number: ");
		num2 = apple.nextDouble();
		
		sum = num1+num2;
		
		System.out.println("Sum = " + sum);		
	}
}
