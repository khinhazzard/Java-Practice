//Variable Length Arguments

public class VarLenArg {
	public static void main(String args[]){
		System.out.print("Average: "+average(12,54,23,53,65));
	}
	
	//calculates the average
	public static int average(int...numbers){// "..." -> when you don't know how many args it take
		int total=0;
		
		for(int x: numbers)
			total+=x;
		
		return total/numbers.length;
	}
}	
	
