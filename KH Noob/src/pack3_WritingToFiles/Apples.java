package pack3_WritingToFiles;

public class Apples {
	
	public static void main(String args[]){
		
		createFile cfOb = new createFile();
		
		cfOb.openFile();
		cfOb.addRecords();
		cfOb.closeFile();
		
	}

}
