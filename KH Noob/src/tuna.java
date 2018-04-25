
public class tuna {
	
		public void message(String name){
			System.out.println("Hello " + name);
			System.out.println("this is a message from class tuna");
		}
		
		private String gfName;
		
		public void setName(String temp)
		{
			gfName = temp;
		}
		
		public String getName()
		{
			return gfName;
		}
		
		public void saying()
		{
			System.out.print("Your first gf was " + getName() + ", " );
		}
}
