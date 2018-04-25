import java.io.File;

public class fileClass {
	public static void main(String args[]){
		File x = new File("D:\\HD\\Linux dl.txt");
		
		if(x.exists())
			System.out.println(x.getName() + " exist!");
		else
			System.out.println("this file does not exist!");
	}

}
