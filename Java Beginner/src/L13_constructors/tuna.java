package L13_constructors;

public class tuna {
	private String gfName;
	
	public tuna(String name){ // this is a constructor
		gfName = name;
	}
	
	public String getName(){
		return gfName;
	}
	
	public void saying(){
		System.out.printf("Your first gf was %s\n", getName());
	}
}
