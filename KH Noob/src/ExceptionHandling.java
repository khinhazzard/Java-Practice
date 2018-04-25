import java.util.*;

public class ExceptionHandling {
	
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int x = 1;
		
		do{
			try{
				System.out.println("Enter 1st num");
				int num1 = input.nextInt();
				System.out.println("Enter 2nd num");
				int num2 = input.nextInt();
				int quo = num1/num2;
				System.out.println(quo);
				x = 2;
				}
			catch(Exception e){
				System.out.println("You can't do that");
			}
		}while(x ==1);
	}

}