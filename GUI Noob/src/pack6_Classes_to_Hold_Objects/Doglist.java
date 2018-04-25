package pack6_Classes_to_Hold_Objects;

public class Doglist {

	private Dog[] dList = new Dog[5];
	private int i=0;
	
	public void add(Dog d){
		
		if(i<dList.length){
			dList[i] = d;
			System.out.println("Dog added at index "+i);
			i++;
		}
	}
	
	
}
