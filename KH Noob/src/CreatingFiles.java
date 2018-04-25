import java.util.*;

public class CreatingFiles {
	
	public static void main(String args[]){
		//outputs strings to a file
		//final Formatter x; //(can also be used)
		
		//exception handling
		try{
			//x = new Formatter("tishaIsHot.txt"); //(also works but there's a stupid warning)
			new Formatter("tishaIsHot.txt");
		}
		catch(Exception e){
			System.out.println("You've got an error");
		}
		
	}

}
