import java.util.*;

public class Collections {
	
	public static void main(String args[]){
			String[] things = {"eggs", "lasers", "hats", "pie",};
			List<String> list1 = new ArrayList<String>();
			
			// add array items to list
			for(String x: things){
				list1.add(x);
			}
			
			String[] morethings = {"lasers", "hats"};
			List<String> list2 = new ArrayList<String>();
			
			// add array items to list
			for(String y: morethings){
				list2.add(y);
			}
			
			//display list 1 
			for(int i=0;i <list1.size();i++){
				System.out.printf("%s ", list1.get(i));
			}
			
			editList(list1,list2);
			System.out.println();
			
			//display list 1 
			for(int i=0;i <list1.size();i++){
				System.out.printf("%s ", list1.get(i));
			}
	}
	
	public static void editList(Collection<String> l1, Collection<String> l2){
		//goes to each list item by item
		Iterator<String> it = l1.iterator();
		
		//loop trough item by item until you reach the end of the list
		while(it.hasNext()){
			if(l2.contains(it.next()))
				it.remove();
		}
		
	}

}
