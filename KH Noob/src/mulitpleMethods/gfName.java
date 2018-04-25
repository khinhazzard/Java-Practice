package mulitpleMethods;

public class gfName {
	
	private String gfname;
	private String uname; //user's name
	
	public gfName(String name)//constructor
	{
		gfname = name;
	}
	
	public String getName(){
		return uname;
	}
	
	public String getGfName(){
		return gfname;
	}
	
	public void setGfName(String temp){
		gfname  = temp;
	}
	
	public void setName(String temp){
		uname = temp;
	}
	
	public void message(){
		System.out.printf("Your first gf was %s\n", gfname);
	}
	
	public void message2(){
		System.out.printf("Your next gf was %s, %s\n", gfname, uname);
	}

}
