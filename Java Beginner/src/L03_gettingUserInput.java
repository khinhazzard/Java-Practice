import java.util.Scanner;

//basic program for getting user input

public class L03_gettingUserInput {

	public static void main(String args[]){
		
		Scanner khine = new Scanner(System.in);	//input from keyboard will be stored to khine variable
		
		System.out.println("Input:");
		System.out.println(khine.nextLine());   //nextLine() is used for the whole line (ex. sentences)
		System.out.println(khine.next());	//next() will only get the next token
		
	}
}
