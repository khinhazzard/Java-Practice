import java.util.*;

public class convertingListToArrays {
	
	public static void main(String args[]){
		
		String[] stuffs = {"babies", "watermelons", "melons", "fudge"};
		LinkedList<String>	list = new LinkedList<String>(Arrays.asList(stuffs));
		
		list.add("pumpkin");
		list.addFirst("firstthing"); 
		
		//convert back to array
		stuffs = list.toArray(new String[list.size()]);
		
		for(String x: stuffs)
			System.out.printf("%s ", x);
		
	}
	
}
