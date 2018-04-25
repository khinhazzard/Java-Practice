package L12_methodsAndInstances;

public class tuna {
	private String girlName; //private makes this variable accessible only within this class
	
	public void setName(String name){
		girlName = name;
	}
	
	public String getName(){
		return girlName;
	}
	
	public void saying(){
		System.out.printf("Your first gf was %s", getName());	
	}
}
