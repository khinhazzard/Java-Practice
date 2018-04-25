package L12_methodsAndInstances;
import java.util.Scanner;

public class apples {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		tuna tunaObj = new tuna();
		
		System.out.print("Enter name of first gf: ");
		String temp = input.nextLine();
		
		tunaObj.setName(temp);
		tunaObj.saying();
		
	}
}
