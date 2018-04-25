package pack7SimplePolymorphic;

public class Apple {
	public static void main(String args[]){
		
		animal[] dList = new animal[2];
		animal d = new dog();
		animal f = new fish();
		
		dList[0]=d;
		dList[1]=f;
		
		//enhanced loop(arrays only)
		for(animal x: dList){
			x.noise();
		}
		
	}
}