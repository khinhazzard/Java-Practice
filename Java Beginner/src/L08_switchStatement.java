import java.util.Scanner;

public class L08_switchStatement {

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int age;
		
		System.out.print("Enter your age: ");
		age = scan.nextInt();
		
		switch(age){ //used for multiple conditions
		case 1:
			System.out.println("You can crawl");
			break;
		case 2:
			System.out.println("You can talk");
			break;
		case 3:
			System.out.println("You can get in trouble");
			break;
		default:
			System.out.println("I don't know how old you are");
			break;
		}
	}
}
