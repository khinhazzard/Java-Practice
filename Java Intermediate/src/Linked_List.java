import java.util.*;

public class Linked_List {
	
	public static void main(String args[]){
		
		String[] things = {"apples","noobs", "pawnage", "bacon", "goATS"};
		
		List<String> list1 = new LinkedList<String>();
		
		for(String x: things){
			list1.add(x); 
		}
		
		String[] things2 = {"sausage", "bacon", "goats", "harrypotter"};
		List<String> list2 = new LinkedList<String>();
		
		
		for(String x: things2){
			list2.add(x); 
		}
		
		list1.addAll(list2);
		list2 = null;
		
		printMe(list1);
		removeStuff(list1, 1,5);
		printMe(list1);
		reverseMe(list1);
	}
		
	//printMe method
		private static void printMe(List<String> l){
			 
			for(String b:l)
				System.out.printf("%s ", b);
			System.out.println();
			
		}
		
	//removeStuff method
		private static void removeStuff(List<String> l, int from, int to){
			l.subList(from, to).clear(); //take portions of the list and then clear it
			
		}
		
	//reverseMe
		private static void reverseMe(List<String> l){
			ListIterator<String> i = l.listIterator(l.size()); // size of the list			
			while(i.hasPrevious()){ //loop through the list while it has something to loop through
				System.out.printf("%s ", i.previous());
			}
		}
}
