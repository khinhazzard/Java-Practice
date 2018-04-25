package pack6_Classes_to_Hold_Objects;

public class AnimalList {
	
	private Animal[] dList = new Animal[10];
	private int i=0;
	
	public void add(Animal a){
		
		if(i<dList.length){
			dList[i] = a;
			System.out.println("Animal was added at index "+i);
			i++;
		}
		
	}

}
