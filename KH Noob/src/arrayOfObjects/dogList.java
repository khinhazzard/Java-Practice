package arrayOfObjects;

public class dogList{
	int limit = 10, i;
	private dog[] thelist = new dog[limit];
	
	
	public void addDog(dog d){
		if(i<thelist.length){
			thelist[i] = d;
			System.out.println("Dog added at index " + i);
			i++;
		}
	}
}
